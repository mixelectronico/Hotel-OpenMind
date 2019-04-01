
package Controlador;

import Modelo.Modelo_Habitacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Database;


public class SQL_Habitacion extends Database{
    
    public boolean InsertarHabitacion(Modelo_Habitacion habitacion){
        try {
         String query = "INSERT INTO HABITACION (`ID_HABITACION`, `NOMBRE_HABITACION`, `PRECIO_M`, `PRECIO_J`, `ESTADO_HABITACION`) VALUES ('"+habitacion.getID_HABITACION()+"', '"+habitacion.getNOMBRE_HABITACION()+"', '"+habitacion.getPRECIO_MOMENTO()+"', '"+habitacion.getPRECIO_JORNADA()+"', '"+habitacion.getESTADO_HABITACION()+"');";
         PreparedStatement pstm = this .getConexion().prepareStatement(query);
         pstm.executeUpdate();
         pstm.close();
         return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean ModificarHabitacion(Modelo_Habitacion habitacion) {
        try {
         String query = "UPDATE HABITACION SET ID_HABITACION='"+habitacion.getID_HABITACION()+"', NOMBRE_HABITACION='"+habitacion.getNOMBRE_HABITACION()+"', PRECIO_M='"+habitacion.getPRECIO_MOMENTO()+"', PRECIO_J='"+habitacion.getPRECIO_JORNADA()+"', ESTADO_HABITACION='"+habitacion.getESTADO_HABITACION()+"'";
         PreparedStatement pstm = this .getConexion().prepareStatement(query);
         pstm.executeUpdate();
         pstm.close();
         return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean EliminarHabitacion(Modelo_Habitacion habitacion) {
        try {
         String query = "DELETE FROM HABITACION WHERE ID_HABITACION='"+habitacion.getID_HABITACION()+"';";
         PreparedStatement pstm = this .getConexion().prepareStatement(query);
         pstm.executeUpdate();
         pstm.close();
         return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean mostrarHabitacion(Modelo_Habitacion habitacion) {
        try {
         PreparedStatement pstm;
         pstm = this.getConexion().prepareStatement( "select RUT,DIGITOV,NOMBRE,APELLIDO_P,APELLIDO_M,SEXO,FECHANAC,NACIONALIDAD from HUESPED where RUT=?;");   
         pstm.setString(1, habitacion.getNOMBRE_HABITACION());
         ResultSet res = pstm.executeQuery();
         
         if(res.next()){
             habitacion.setID_HABITACION(res.getInt("ID_HABITACION"));
             habitacion.setNOMBRE_HABITACION(res.getString("NOMBRE_HABITACION"));
             habitacion.setPRECIO_MOMENTO(res.getInt("PRECIO_M"));
             habitacion.setPRECIO_JORNADA(res.getInt("PRECIO_J"));
             habitacion.setESTADO_HABITACION(res.getString("ESTADO_HABITACION"));
             res.close();
             pstm.close();
             return true;
         }
         
        } catch (Exception e) {
            e.printStackTrace();  
            System.out.println(e);
            return false;
        } 
        return false;
    } 
}