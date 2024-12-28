package trabalhoprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectaBD {
    
    private static Connection con = null;
    
    public static Connection conectar (){
        
        try {
            String url = "jdbc:postgresql://localhost:5432/SistemaAeroporto";
            String user = "postgres";
            String password = "admin";
            
            con = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return con;
    }
    
    public static void fecharConexao(){
        if (con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Erro: " + ex.getMessage());
            }
        }
    }
}
