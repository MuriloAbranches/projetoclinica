/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alunocmc
 */
public class Usuario {
    
    private String login;
    private String senha;
    private PerfilDeAcesso perfil;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public PerfilDeAcesso getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilDeAcesso perfil) {
        this.perfil = perfil;
    }

    public Usuario() {
    }

    public Usuario(String login, String senha, PerfilDeAcesso perfil) {
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }
    
}
