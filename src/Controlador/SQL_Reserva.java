
package Controlador;

import Modelo.Modelo_Reserva;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Database;

public class SQL_Reserva extends Database{
    public boolean InsertarHabitacion(Modelo_Reserva reserva){
        try {
         String query = "INSERT INTO RESERVA (`ID_RESERVA`, `ESTADO_RESERVA`, `FECHA_RESERVA`, `RUT_TITULAR`, `ID_HABITACION`, `MODALIDAD_RESERVA`) VALUES ('"+reserva.getID_RESERVA()+"', '"+reserva.getESTADO_RESERVA()+"', '"+reserva.getFECHA_RESERVA()+"', '"+reserva.getRUT_TITULAR()+"', '"+reserva.getID_HABITACION()+"', '"+reserva.getMODALIDAD_RESERVA()+"');";
         PreparedStatement pstm = this .getConexion().prepareStatement(query);
         pstm.executeUpdate();
         pstm.close();
         return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}
