package br.com.clinicamedica.service.impl;

import br.com.clinicamedica.dao.ContatoDao;
import br.com.clinicamedica.dao.EnderecoDao;
import br.com.clinicamedica.dao.PacienteDao;
import br.com.clinicamedica.dao.impl.ContatoDaoImpl;
import br.com.clinicamedica.dao.impl.EnderecoDaoImpl;
import br.com.clinicamedica.dao.impl.PacienteDaoImpl;
import br.com.clinicamedica.model.Contato;
import br.com.clinicamedica.model.Endereco;
import br.com.clinicamedica.model.Paciente;
import br.com.clinicamedica.model.Telefone;
import br.com.clinicamedica.service.PacienteService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PacienteServiceImpl implements PacienteService {

    private PacienteDao pacienteDao;
    private EnderecoDao enderecoDao;
    private ContatoDao contatoDao;

    @Override
    public boolean salvarPaciente(HttpServletRequest request, HttpServletResponse response) {

        try {
            Paciente paciente = castRequestToPaciente(request);

            pacienteDao = new PacienteDaoImpl();

            if (null == pacienteDao.readPaciente(paciente)) {

                paciente.setEndereco(saveEndereco(castRequestToEndereco(request)));
                paciente.setContato(saveContato(castRequestToContato(request)));
                paciente.setFlagAtivo(1);

                pacienteDao.createPaciente(paciente);

            } else {
                paciente.setFlagAtivo(1);

                pacienteDao.activatePaciente(paciente);
            }

            return true;

        } catch (Exception e) {
            System.out.println("ERRO(PacienteService): " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Paciente> listarPaciente() {
        try {
            pacienteDao = new PacienteDaoImpl();

            List<Paciente> pacientes = pacienteDao.listPaciente();

            return pacientes;

        } catch (Exception e) {
            System.out.println("ERRO(PacienteService): " + e.getMessage());
            return null;
        }
    }

    @Override
    public Paciente buscarPaciente(HttpServletRequest request, HttpServletResponse response) {
        try {
            Paciente paciente = new Paciente();
            paciente.setCpf(Long.parseLong(request.getParameter("cpfBusca")));

            pacienteDao = new PacienteDaoImpl();
            paciente = pacienteDao.readPaciente(paciente);

            enderecoDao = new EnderecoDaoImpl();
            paciente.setEndereco(enderecoDao.readEndereco(paciente.getEndereco()));

            contatoDao = new ContatoDaoImpl();
            paciente.setContato(contatoDao.readContato(paciente.getContato()));

            return paciente;
        } catch (Exception e) {
            System.out.println("ERRO(PacienteService): " + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean alterarPaciente(HttpServletRequest request, HttpServletResponse response) {
        try {

            Paciente paciente = castRequestToPaciente(request);
            pacienteDao = new PacienteDaoImpl();
            pacienteDao.updatePaciente(paciente);
            paciente = pacienteDao.readPaciente(paciente);

            updateEndereco(castRequestToEndereco(request), paciente);
            updateContato(castRequestToContato(request), paciente);

            return true;
        } catch (Exception e) {
            System.out.println("ERRO(PacienteService): " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean excluirPaciente(HttpServletRequest request, HttpServletResponse response) {
        try {
            Paciente paciente = new Paciente();
            paciente.setCpf(Long.parseLong(request.getParameter("cpf")));

            pacienteDao = new PacienteDaoImpl();
            paciente = pacienteDao.readPaciente(paciente);

            paciente.setFlagAtivo(0);

            if (pacienteDao.deletePaciente(paciente)) {

                deleteContato(paciente);
                deleteEndereco(paciente);
            }

            return true;
        } catch (Exception e) {
            System.out.println("ERRO(PacienteService): " + e.getMessage());
            return false;
        }

    }

    private Endereco castRequestToEndereco(HttpServletRequest request) {

        Endereco endereco = new Endereco();

        endereco.setCep(Integer.parseInt(request.getParameter("cep")));
        endereco.setLogradouro(request.getParameter("logradouro"));
        endereco.setNumero(Integer.parseInt(request.getParameter("numero")));
        endereco.setBairro(request.getParameter("bairro"));
        endereco.setCidade(request.getParameter("cidade"));
        endereco.setEstado(request.getParameter("estado"));

        return endereco;
    }

    private Contato castRequestToContato(HttpServletRequest request) {

        Telefone telefone = new Telefone();

        telefone.setDdd(Integer.parseInt(request.getParameter("ddd")));
        telefone.setNumero(Integer.parseInt(request.getParameter("telefone")));

        Contato contato = new Contato();

        contato.setEmail(request.getParameter("email").toLowerCase());
        contato.setTelefone(telefone);

        return contato;
    }

    private Paciente castRequestToPaciente(HttpServletRequest request) {

        Paciente paciente = new Paciente();

        paciente.setNomeCompleto(request.getParameter("nomeCompleto").toUpperCase());
        paciente.setCpf(Long.parseLong(request.getParameter("cpf")));
        paciente.setRg(Long.parseLong(request.getParameter("rg")));

        return paciente;
    }

    private Contato saveContato(Contato contato) {

        contatoDao = new ContatoDaoImpl();

        contato.setFlagAtivo(1);
        contatoDao.createContato(contato);

        contato = contatoDao.readContatoByEmail(contato);

        return contato;
    }

    private Endereco saveEndereco(Endereco endereco) {

        enderecoDao = new EnderecoDaoImpl();

        endereco.setFlagAtivo(1);
        enderecoDao.createEndereco(endereco);

        endereco = enderecoDao.readEnderecoByCep(endereco);

        return endereco;
    }

    private void updateContato(Contato contato, Paciente paciente) {

        contatoDao = new ContatoDaoImpl();

        contato.setId(paciente.getContato().getId());

        contatoDao.updateContato(contato);

    }

    private void updateEndereco(Endereco endereco, Paciente paciente) {

        enderecoDao = new EnderecoDaoImpl();

        endereco.setId(paciente.getEndereco().getId());

        enderecoDao.updateEndereco(endereco);
    }

    private void deleteContato(Paciente paciente) {
        Contato contato = new Contato();

        contato.setFlagAtivo(0);
        contato.setId(paciente.getContato().getId());
        contatoDao = new ContatoDaoImpl();

        contatoDao.deleteContato(contato);
    }

    private void deleteEndereco(Paciente paciente) {
        Endereco endereco = new Endereco();

        endereco.setFlagAtivo(0);
        endereco.setId(paciente.getEndereco().getId());
        enderecoDao = new EnderecoDaoImpl();

        enderecoDao.deleteEndereco(endereco);
    }

}
