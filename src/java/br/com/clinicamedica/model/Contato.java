package br.com.clinicamedica.model;
public class Contato extends Telefone{
    private int id;
    private String email;
    private Telefone telefone;

    public Contato(int id, String email, Telefone telefone) {
        this.id = id;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
}
