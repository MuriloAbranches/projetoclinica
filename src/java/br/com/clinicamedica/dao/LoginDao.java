package br.com.clinicamedica.dao;

import br.com.clinicamedica.model.Login;
import java.util.List;

public interface LoginDao {

    public boolean createLogin(Login login);

    public boolean deleteLogin(Login login);

    public Login readLogin(Login login);

    public boolean updateLogin(Login login);

}
