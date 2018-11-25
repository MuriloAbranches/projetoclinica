package br.com.clinicamedica.service.impl;

import br.com.clinicamedica.dao.ConsultaDao;
import br.com.clinicamedica.dao.DataHoraConsultaDao;
import br.com.clinicamedica.dao.EspecialidadeDao;
import br.com.clinicamedica.dao.PacienteDao;
import br.com.clinicamedica.dao.impl.ConsultaDaoImpl;
import br.com.clinicamedica.dao.impl.DataHoraConsultaDaoImpl;
import br.com.clinicamedica.dao.impl.EspecialidadeDaoImpl;
import br.com.clinicamedica.dao.impl.PacienteDaoImpl;
import br.com.clinicamedica.model.Consulta;
import br.com.clinicamedica.model.DataHoraConsulta;
import br.com.clinicamedica.model.Especialidade;
import br.com.clinicamedica.model.Medico;
import br.com.clinicamedica.model.Paciente;
import br.com.clinicamedica.service.ConsultaService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConsultaServiceImpl implements ConsultaService {

    private EspecialidadeDao especialidadeDao;
    private ConsultaDao consultaDao;

    @Override
    public boolean salvarConsulta(HttpServletRequest request, HttpServletResponse response) {
        try {
     
            Paciente paciente = new Paciente();
            paciente.setCpf(Long.parseLong(request.getParameter("cpf")));
            PacienteDao pacienteDao = new PacienteDaoImpl();
            paciente = pacienteDao.readPaciente(paciente);
            
            Medico medico = new Medico();
            medico.setCrm(Long.parseLong(request.getParameter("medico")));
            
            Especialidade especialidade = new Especialidade();
            especialidade.setId(Integer.parseInt(request.getParameter("especialidade")));
            especialidadeDao = new EspecialidadeDaoImpl();
            especialidade = especialidadeDao.readEspecialidade(especialidade);

            DataHoraConsulta dataHoraConsulta = new DataHoraConsulta();
            dataHoraConsulta.setId(Integer.parseInt(request.getParameter("dataHora")));
                      
            Consulta consulta = new Consulta();
            consulta.setPaciente(paciente);
            consulta.setMedico(medico);
            consulta.setEspecialidade(especialidade);
            consulta.setDataHoraConsulta(dataHoraConsulta);
            
            
            DataHoraConsultaDao dataHoraConsultaDao = new DataHoraConsultaDaoImpl();
            dataHoraConsultaDao.updateDataHoraConsulta(dataHoraConsulta);

            consultaDao = new ConsultaDaoImpl();
            consultaDao.createConsulta(consulta);

            return true;

        } catch (Exception e) {
            System.out.println("ERRO(ConsultaServiceS): " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Consulta> listarConsulta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Consulta buscarConsulta(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterarConsulta(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirConsulta(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
