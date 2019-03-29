package Controlador;

import Modelo.Modelo_Huesped;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Database;

public class SQL_Huesped extends Database{
    
    public SQL_Huesped(){}

    //String d_RUT, String d_DV, String d_NOMBRES, String d_APELLIDOP, String d_APELLIDOM, String d_SEXO, String d_NACIONALIDAD, Date d_FECHANAC
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
}