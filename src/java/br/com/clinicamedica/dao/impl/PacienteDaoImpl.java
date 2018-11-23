package br.com.clinicamedica.dao.impl;

import br.com.clinicamedica.dao.PacienteDao;
import br.com.clinicamedica.model.Paciente;
import br.com.clinicamedica.util.ConectaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public abstract class PacienteDaoImpl implements PacienteDao {

    private static final String INSERT = "INSERT INTO PACIENTES values (nextval('pacientes_seq'),?,?,?) ";
    private static final String DELETE = "UPDATE PACIENTES SET Flag_Ativo=? WHERE cpf=?";
    private static final String SELECT_ALL = "SELECT * FROM PACIENTES";
    private static final String SELECT = "SELECT * FROM PACIENTES WHERE cpf=?";
    private static final String UPDATE = "UPDATE PACIENTES SET nome=? WHERE cpf=?";

    private Connection connection;

    public boolean createPaciente(Paciente paciente) {
        try {
            connection = ConectaBanco.getConexao();
            PreparedStatement pstmt = connection.prepareStatement(INSERT);//ALTERAR DEPOIS
            pstmt.setString(1, paciente.getNomeCompleto());
            pstmt.setLong(2, paciente.getRG());
            pstmt.setLong(3, paciente.getCPF());
            pstmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }

    }

    public boolean deletePaciente(Paciente paciente) {
        try {
            connection = ConectaBanco.getConexao();
            PreparedStatement pstmt = connection.prepareStatement(DELETE);
            pstmt.setInt(1, paciente.getflagAtivo());
            pstmt.setLong(2, paciente.getCPF());
            pstmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return false;
        }

    }

    public boolean readPaciente(Paciente paciente) {
        try {
            connection = ConectaBanco.getConexao();
            PreparedStatement pstmt = connection.prepareStatement(SELECT);
            pstmt.setLong(1, paciente.getCPF());
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            paciente.setId(Integer.parseInt(rs.getString("Id")));

            return true;
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return false;
        }
    }

    public boolean updatePaciente(Paciente paciente) {
        try {
            connection = ConectaBanco.getConexao();            
            PreparedStatement pstmt = connection.prepareStatement(UPDATE);
            pstmt.setString(1, paciente.getNomeCompleto());
            pstmt.setLong(2, paciente.getCPF());

            pstmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return false;
        }
    }

    public List<Paciente> listaPaciente() {
        try {
            connection = ConectaBanco.getConexao();
            PreparedStatement pstmt = connection.prepareStatement(SELECT_ALL);

            List<Paciente> pacientes = new ArrayList<>();
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Paciente paciente = new Paciente();

                paciente.setId(Integer.parseInt(rs.getString("id")));
                paciente.setCPF(Long.parseLong(rs.getString("cpf")));

                pacientes.add(paciente);
            }
            return pacientes;
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }
}
