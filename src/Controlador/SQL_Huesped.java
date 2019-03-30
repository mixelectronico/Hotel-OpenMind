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
         String query = "INSERT INTO `hotel`.`cliente` (`RUT_CLIENTE`, `VERIF`, `NOMBRES`, `AP_PATERNO`, `AP_MATERNO`, `SEXO`, `FECHA_NAC`, `NACIONALIDAD`) VALUES ('"+huesped.getRUT()+"', '"+huesped.getDIGITOV()+"', '"+huesped.getNOMBRE()+"', '"+huesped.getAPELLIDOP()+"', '"+huesped.getAPELLIDOM()+"', '"+huesped.getSEXO()+"', '"+huesped.getFECHANAC()+"', '"+huesped.getNACIONALIDAD()+"');";
         PreparedStatement pstm = this .getConexion().prepareStatement(query);
         pstm.executeUpdate();
         return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean verificarRUT(String RUT) {
         try {
         String s = "";
         PreparedStatement pstm = this.getConexion().prepareStatement( "select RUT_CLIENTE from cliente where RUT_CLIENTE='"+RUT+"';");
         ResultSet res = pstm.executeQuery();
         
         if(res.next()){
             res.close();
             return true;
         }else{
             res.close();
             return false;
         }
        } catch (Exception e) {
            e.printStackTrace();  
            System.out.println(e);
            return false;
        }
    }
    
    public boolean mostrarCliente(Modelo_Huesped modcli) {
        try {
         PreparedStatement pstm;
         pstm = this.getConexion().prepareStatement( "select RUT_CLIENTE,VERIF,NOMBRES,AP_PATERNO,AP_MATERNO,SEXO,FECHA_NAC,NACIONALIDAD from cliente where RUT_CLIENTE=?;");   
         pstm.setString(1, modcli.getRUT());
         ResultSet res = pstm.executeQuery();
         
         if(res.next()){
             modcli.setRUT(res.getString("RUT_CLIENTE"));
             modcli.setDIGITOV(res.getString("VERIF"));
             modcli.setNOMBRE(res.getString("NOMBRES"));
             modcli.setAPELLIDOP(res.getString("AP_PATERNO"));
             modcli.setAPELLIDOM(res.getString("AP_MATERNO"));
             modcli.setSEXO(res.getString("SEXO"));
             modcli.setFECHANAC(res.getDate("FECHA_NAC"));
             modcli.setNACIONALIDAD(res.getString("NACIONALIDAD"));
             res.close();
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
    

