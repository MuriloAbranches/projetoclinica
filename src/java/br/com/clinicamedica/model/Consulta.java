package br.com.clinicamedica.model;
import java.util.Date;
public class Consulta {
    private int id;
    private Paciente paciente;
    private Medico medico;
    private Especialidade especialidade;
    private Date dataConsulta; 
    private Date horaConsulta;
    private String prontuario;
    private Funcionario agendadoPor;

    public Consulta(int id, Paciente paciente, Medico medico, Especialidade especialidade, Date dataConsulta, Date horaConsulta, String prontuario, Funcionario agendadoPor) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.especialidade = especialidade;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.prontuario = prontuario;
        this.agendadoPor = agendadoPor;
    }

    public Consulta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Date getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(Date horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public Funcionario getAgendadoPor() {
        return agendadoPor;
    }

    public void setAgendadoPor(Funcionario agendadoPor) {
        this.agendadoPor = agendadoPor;
    }
}
