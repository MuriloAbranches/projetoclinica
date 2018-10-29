    package br.com.clinicamedica.model;
    public abstract class Pessoa {
    public Pessoa() {
    }
    private String id;
    private String nomeCompleto;
    private long CPF;
    private long RG;
    private Contato contado;
    private Endereco endereco;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public long getRG() {
        return RG;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    public Contato getContado() {
        return contado;
    }

    public void setContado(Contato contado) {
        this.contado = contado;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa(String id, String nomeCompleto, long CPF, long RG, Contato contado, Endereco endereco) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.RG = RG;
        this.contado = contado;
        this.endereco = endereco;
    }

    
}
    
