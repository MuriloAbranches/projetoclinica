package br.com.clinicamedica.model;

import java.util.Date;

public class Paciente extends Pessoa {
public Paciente() {
}
    private Date dataNascimento;

    public Paciente(Date dataNascimento, int id, String nomeCompleto, long CPF, long RG, Contato contado, Endereco endereco, int flagAtivo) {
        super(id, nomeCompleto, CPF, RG, contado, endereco, flagAtivo);
        this.dataNascimento = dataNascimento;
   
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
