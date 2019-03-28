
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import modelo.Database;


public class ReservasModel extends Database{
    
    public ReservasModel (){}
    
    public  void InsertarReservas(String name, int valor) {
        
        //boolean flag = true;

       try {
          
         String s = "";
         PreparedStatement pstm = this.getConexion().prepareStatement( "select nombres from cliente");
         ResultSet res = pstm.executeQuery();
         res.next();
         s = res.getString("nombres");
         res.close();
       
        } catch (Exception e) {
            e.printStackTrace();
            //flag = false;
            
        } finally {
          
         //return flag;
  
        }

    }

    public static void All() {
        try {
         
         Class.forName("com.mysql.jdbc.Driver").newInstance();
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?useTimezone=true&serverTimezone=UTC", "root", "ac75f48ea2");
         Statement stmt = conn.createStatement();
         ResultSet  rs = stmt.executeQuery("SELECT * FROM cliente");
         String s = "";
                 
         while (rs.next()) {
           
            s = rs.getString("nombres");
           
        }
         
        stmt.close();
       
           conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          
         
  
        }
    }
    
    
}
