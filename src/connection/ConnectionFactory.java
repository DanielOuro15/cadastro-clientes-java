package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://192.168.15.9:3306/cadastrocliente";
    private static final String user = "hcode";
    private static final String pass = "S3rv1d0rD4t4B4s3";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão...",ex);
        }
        
    }    
public static void closeConnection(Connection con){
    
        try {
            if(con!=null){
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
   }   

public static void closeConnection(Connection con, PreparedStatement stmt){
    
        closeConnection(con);
    
        try {
            if(stmt!=null){
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
    
        closeConnection(con, stmt);
        
    
        try {
            if(rs!= null){
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

   }
