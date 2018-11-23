package br.com.clinicamedica.model;

import java.util.Date;
//biblioteca para manusear tipo Date
public class Funcionario extends Pessoa {
    private Date dataAdimissao;
    private Date dataDemissao;
    private TipoFuncionario cargo;
    
    

    public Funcionario() {
    }

    public Funcionario(Date dataAdimissao, Date dataDemissao, TipoFuncionario cargo, int id, String nomeCompleto, long CPF, long RG, Contato contato, Endereco endereco, int flagAtivo) {
        super(id, nomeCompleto, CPF, RG, contato, endereco,flagAtivo);
        this.dataAdimissao = dataAdimissao;
        this.dataDemissao = dataDemissao;
        this.cargo = cargo;
    }

    public Date getDataAdimissao() {
        return dataAdimissao;
    }

    public void setDataAdimissao(Date dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
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

  
}
