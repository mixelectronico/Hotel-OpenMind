package Modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Database;
import java.util.Date;

public class SQLCliente extends Database{
    
    public SQLCliente(){}

    //parametros: 1,2,3,4,5,6,7,8
    public  void InsertarCliente(String d_RUT, String d_DV, String d_NOMBRES, String d_APELLIDOP, String d_APELLIDOM, String d_SEXO, String d_NACIONALIDAD, Date d_FECHANAC) {
        try {
         String query = "INSERT INTO CLIENTE (RUT_CLIENTE,VERIF,NOMBRES,AP_PATERNO,AP_MATERNO,SEXO,NACIONALIDAD,FECHA_NAC) VALUES ('"+d_RUT+"','"+d_DV+"','"+d_NOMBRES+"','"+d_APELLIDOP+"','"+d_APELLIDOM+"','"+d_SEXO+"','"+d_NACIONALIDAD+"','"+d_FECHANAC+"')";
         PreparedStatement pstm = this .getConexion().prepareStatement(query);
         pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
           
        }
    }
}