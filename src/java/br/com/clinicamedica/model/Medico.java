package br.com.clinicamedica.model;

import java.util.Date;

public class Medico extends Funcionario{

    public Medico(long crm, Especialidade especialidade) {
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Medico(long crm, Especialidade especialidade, Date dataAdimissao, Date dataDemissao, TipoFuncionario cargo) {
        super(dataAdimissao, dataDemissao, cargo);
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
    long crm;
    Especialidade especialidade;
}
