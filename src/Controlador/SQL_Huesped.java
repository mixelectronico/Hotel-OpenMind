package Controlador;

import Modelo.Modelo_Huesped;
import Vista.Vista_Reserva;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Database;

public class SQL_Huesped extends Database{
    
    public SQL_Huesped(){
        
    }
    public boolean InsertarCliente(Modelo_Huesped huesped) {
        try {
         String query = "INSERT INTO HUESPED (`RUT`, `DIGITOV`, `NOMBRE`, `APELLIDO_P`, `APELLIDO_M`, `SEXO`, `FECHANAC`, `NACIONALIDAD`) VALUES ('"+huesped.getRUT()+"', '"+huesped.getDIGITOV()+"', '"+huesped.getNOMBRE()+"', '"+huesped.getAPELLIDOP()+"', '"+huesped.getAPELLIDOM()+"', '"+huesped.getSEXO()+"', '"+huesped.getFECHANAC()+"', '"+huesped.getNACIONALIDAD()+"');";
         PreparedStatement pstm = this .getConexion().prepareStatement(query);
         pstm.executeUpdate();
         pstm.close();
         return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean ModificarCliente(Modelo_Huesped huesped) {
        try {
         String query = "UPDATE HUESPED SET RUT='"+huesped.getRUT()+"', DIGITOV='"+huesped.getDIGITOV()+"', NOMBRE='"+huesped.getNOMBRE()+"', APELLIDO_P='"+huesped.getAPELLIDOP()+"', APELLIDO_M='"+huesped.getAPELLIDOM()+"', SEXO='"+huesped.getSEXO()+"', FECHANAC='"+huesped.getFECHANAC()+"', NACIONALIDAD='"+huesped.getNACIONALIDAD()+"' WHERE RUT_CLIENTE='"+huesped.getRUT()+"';";
         PreparedStatement pstm = this .getConexion().prepareStatement(query);
         pstm.executeUpdate();
         pstm.close();
         return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean EliminarCliente(Modelo_Huesped huesped) {
        try {
         String query = "DELETE FROM HUESPED WHERE RUT='"+huesped.getRUT()+"';";
         PreparedStatement pstm = this .getConexion().prepareStatement(query);
         pstm.executeUpdate();
         pstm.close();
         return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
      
    public boolean mostrarCliente(Modelo_Huesped huesped) {
        try {
         PreparedStatement pstm;
         pstm = this.getConexion().prepareStatement( "select RUT,DIGITOV,NOMBRE,APELLIDO_P,APELLIDO_M,SEXO,FECHANAC,NACIONALIDAD from HUESPED where RUT=?;");   
         pstm.setString(1, huesped.getRUT());
         ResultSet res = pstm.executeQuery();
         
         if(res.next()){
             huesped.setRUT(res.getString("RUT"));
             huesped.setDIGITOV(res.getString("DIGITOV"));
             huesped.setNOMBRE(res.getString("NOMBRE"));
             huesped.setAPELLIDOP(res.getString("APELLIDO_P"));
             huesped.setAPELLIDOM(res.getString("APELLIDO_P"));
             huesped.setSEXO(res.getString("SEXO"));
             huesped.setFECHANAC(res.getDate("FECHANAC"));
             huesped.setNACIONALIDAD(res.getString("NACIONALIDAD"));
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

    public boolean verificarRUT(String RUT) {
         try {
         String s = "";
         PreparedStatement pstm = this.getConexion().prepareStatement( "select RUT from HUESPED where RUT='"+RUT+"';");
         ResultSet res = pstm.executeQuery();
         
         if(res.next()){
             res.close();
             pstm.close();
             return true;
         }else{
             res.close();
             pstm.close();
             return false;
         }
        } catch (Exception e) {
            e.printStackTrace();  
            System.out.println(e);
            return false;
        }
    }

}    

