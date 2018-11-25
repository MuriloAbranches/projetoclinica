package br.com.clinicamedica.model;

import java.util.Date;

public class Funcionario extends Pessoa {

    private Date dataAdmissao;
    private Date dataDemissao;
    private TipoFuncionario cargo;

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public TipoFuncionario getCargo() {
        return cargo;
    }

    public void setCargo(TipoFuncionario cargo) {
        this.cargo = cargo;
    }

    public Funcionario() {
    }

    public Funcionario(Date dataAdmissao, Date dataDemissao, TipoFuncionario cargo) {
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
        this.cargo = cargo;
    }

}
