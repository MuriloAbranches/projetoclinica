package br.com.clinicamedica.model;
import java.util.Date;//biblioteca para manusear tipo Date
public abstract class Funcionario {
    private Date dataAdimissao;
    private Date dataDemissao;
    private TipoFuncionario cargo;

    public Funcionario() {
    }

    public Funcionario(Date dataAdimissao, Date dataDemissao, TipoFuncionario cargo) {
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
