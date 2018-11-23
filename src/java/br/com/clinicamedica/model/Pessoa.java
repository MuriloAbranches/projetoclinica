    package br.com.clinicamedica.model;
    public abstract class Pessoa {
    public Pessoa() {
    }
    private int id;
    private String nomeCompleto;
    private long CPF;
    private long RG;
    private Contato contato;
    private Endereco endereco;
    private int flagAtivo;

    public Pessoa(int flagAtivo) {
        this.flagAtivo = flagAtivo;
    }

    public int getflagAtivo() {
        return flagAtivo;
    }

    public void setflagAtivo(int flagAtivo) {
        this.flagAtivo = flagAtivo;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa(int id, String nomeCompleto, long CPF, long RG, Contato contato, Endereco endereco, int flagAtivo) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.RG = RG;
        this.contato = contato;
        this.endereco = endereco;
        this.flagAtivo = flagAtivo;
    }

    
}
    
