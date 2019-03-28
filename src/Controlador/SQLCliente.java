package Controlador;

import Modelo.Modelo_Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Database;

public class SQLCliente extends Database{
    
    public SQLCliente(){}

    //String d_RUT, String d_DV, String d_NOMBRES, String d_APELLIDOP, String d_APELLIDOM, String d_SEXO, String d_NACIONALIDAD, Date d_FECHANAC
    public boolean InsertarCliente(Modelo_Cliente huesped) {
        try {
         String query = "INSERT INTO `hotel`.`cliente` (`RUT_CLIENTE`, `VERIF`, `NOMBRES`, `AP_PATERNO`, `AP_MATERNO`, `SEXO`, `FECHA_NAC`, `NACIONALIDAD`) VALUES ('"+huesped.getD_RUT()+"', '"+huesped.getD_DV()+"', '"+huesped.getD_NOMBRES()+"', '"+huesped.getD_APELLIDOP()+"', '"+huesped.getD_APELLIDOM()+"', '"+huesped.getD_SEXO()+"', '"+huesped.getD_FECHANAC()+"', '"+huesped.getD_NACIONALIDAD()+"');";
         PreparedStatement pstm = this .getConexion().prepareStatement(query);
         pstm.executeUpdate();
         return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}