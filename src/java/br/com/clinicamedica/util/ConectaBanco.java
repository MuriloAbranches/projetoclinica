
package br.com.clinicamedica.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConectaBanco {
    
    
    public static Connection getConexao(){
        try{
            
             Class.forName("org.postgresql.Driver");
                                                   //local do banco                              //usuario  //senha
             return   DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbcliente", "postgres", "postgres"); //retorna um Connection
            
        }catch(Exception e){
            throw new RuntimeException(e);
        }
       
        
    }
}