package br.com.clinicamedica.model;

public class Login {

    private String usuario;
    private String senha;
    private int flagAtivo;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getFlagAtivo() {
        return flagAtivo;
    }

    public void setFlagAtivo(int flagAtivo) {
        this.flagAtivo = flagAtivo;
    }
    
    public Login() {
    }

    public Login(String usuario, String senha, int flagAtivo) {
        this.usuario = usuario;
        this.senha = senha;
        this.flagAtivo = flagAtivo;
    }
    
}
