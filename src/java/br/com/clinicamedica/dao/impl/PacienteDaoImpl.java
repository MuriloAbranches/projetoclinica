package br.com.clinicamedica.dao.impl;

import br.com.clinicamedica.dao.PacienteDao;
import br.com.clinicamedica.model.Paciente;
import br.com.clinicamedica.util.ConectaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class PacienteDaoImpl implements PacienteDao{

    private Connection connection;
    
    @Override
    public boolean createPaciente(Paciente paciente) {
        try{
            connection = ConectaBanco.getConexao();
            PreparedStatement pstmt = connection.prepareStatement(INSERT)//ALTERAR DEPOIS
                    pstmt.setString(1,paciente.getNomeCompleto());
                    pstmt.setLong(2,paciente.getRG());
                    pstmt.setLong(3,paciente.getCPF());
                        pstmt.execute();
                        return true;
        }
        catch(Exception e){
            System.out.println("Erro: " + getMessage());
            return false;
                }
                    
        }
    @Override
    public boolean deletePaciente(Paciente paciente) {
        try{
            connection = Connection.getConexao();
            PreparedStatement pstmt = connection.prepareStatement(DELETE)
                        pstmt.setint(1, paciente.getFlagAtivo());
                        pstmt.setLong(2, paciente.getCPF());
                        
                        pstmt.execute();
                        return true;
        catch(Exception e)
                        
        }
    }

    @Override
    public boolean readPaciente(Paciente paciente) {
        
    }

    @Override
    public boolean updatePaciente(Paciente paciente) {
        
    }

    @Override
    public List<Paciente> listaPaciente() {
        
    }
    
}
