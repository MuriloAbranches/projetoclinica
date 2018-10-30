package br.com.clinicamedica.dao;
import br.com.clinicamedica.model.Paciente;
import java.util.List;


public interface PacienteDao {
    
    public boolean createPaciente(Paciente paciente);
    public boolean deletePaciente(Paciente paciente);
    public boolean readPaciente(Paciente paciente);
    public boolean updatePaciente(Paciente paciente);
    public List<Paciente> listaPaciente();
}

   
