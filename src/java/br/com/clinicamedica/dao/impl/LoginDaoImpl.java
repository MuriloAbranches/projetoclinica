package br.com.clinicamedica.dao.impl;

import br.com.clinicamedica.dao.LoginDao;
import br.com.clinicamedica.model.Login;
import br.com.clinicamedica.util.ConectaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LoginDaoImpl implements LoginDao{
    
    private static final String INSERT = "INSERT INTO LOGINS values (nextval('logins_seq'),?,?,?);";
    private static final String DELETE = "UPDATE LOGINS SET flag_ativo = ? WHERE usuario = ?";
    private static final String SELECT = "SELECT * FROM LOGINS WHERE usuario = ?";
    private static final String UPDATE = "UPDATE LOGINS SET senha = ? WHERE usuario = ?";
    private static final String ACTIVATE = "UPDATE LOGINS SET flag_ativo = ? WHERE usuario = ?";

    private Connection conexao;
    
    @Override
    public boolean createLogin(Login login) {
        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(INSERT);

            pstmt.setString(1, login.getUsuario());
            pstmt.setString(2, login.getSenha());
            pstmt.setInt(3, login.getFlagAtivo());
            
            return true;
        } catch (Exception e) {
            System.out.println("ERRO(LoginDaoC): " + e.getMessage());
            return false;
        }finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }

    @Override
    public boolean deleteLogin(Login login) {
        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(DELETE);

            pstmt.setInt(1, login.getFlagAtivo());
            pstmt.setString(2, login.getUsuario());

            pstmt.execute();

            return true;
        } catch (Exception e) {
            System.out.println("ERRO(LoginDaoD): " + e.getMessage());
            return false;
        }finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }

    @Override
    public Login readLogin(Login login) {
        try {
             conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT);

            pstmt.setString(1, login.getUsuario());

            ResultSet rs = pstmt.executeQuery();
            rs.next();

            login.setUsuario(rs.getString("usuario"));
            login.setSenha(rs.getString("senha"));
            
            return login;
        } catch (Exception e) {
             System.out.println("ERRO(LoginDaoD): " + e.getMessage());
            return null;
        }finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }

    @Override
    public boolean updateLogin(Login login) {
        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(UPDATE);

            pstmt.setString(1, login.getSenha());
            pstmt.setString(2, login.getUsuario());
            
            return true;
        } catch (Exception e) {
            System.out.println("ERRO(LoginDaoD): " + e.getMessage());
            return false;
        }finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
