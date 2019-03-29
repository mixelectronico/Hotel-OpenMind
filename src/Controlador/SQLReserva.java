
package Controlador;

import Modelo.Modelo_Reserva;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Database;

public class SQLReserva extends Database{
    public boolean InsertarReserva(Modelo_Reserva reserva) {
        try {
         String query = "INSERT INTO `hotel`.`reserva`() VALUES ();";
         PreparedStatement pstm = this .getConexion().prepareStatement(query);
         pstm.execute();
         return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}
