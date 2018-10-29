package br.com.clinicamedica.model;

import java.util.Date;

public class Paciente extends Pessoa {
public Paciente() {
}
    private Date dataNascimento;

    public Paciente(Date dataNascimento, String id, String nomeCompleto, long CPF, long RG, Contato contado, Endereco endereco) {
        super(id, nomeCompleto, CPF, RG, contado, endereco);
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
