package br.com.clinicamedica.model;

import java.util.Date;

public class Medico extends Funcionario{
     private long crm;
     private Especialidade especialidade;

    public Medico(long crm, Especialidade especialidade) {
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Medico(long crm, Especialidade especialidade, Date dataAdimissao, Date dataDemissao, TipoFuncionario cargo, String id, String nomeCompleto, long CPF, long RG, Contato contato, Endereco endereco) {
        super(dataAdimissao, dataDemissao, cargo, id, nomeCompleto, CPF,RG,contato,endereco);
        this.crm = crm;
        this.especialidade = especialidade;
        
    }

    public long getCrm() {
        return crm;
    }

    public void setCrm(long crm) {
        this.crm = crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
   
}
