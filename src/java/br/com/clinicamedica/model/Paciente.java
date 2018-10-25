package br.com.clinicamedica.model;
import java.util.Date;
public class Paciente {

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Paciente(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Paciente() {
    }
    Date dataNascimento;
}
