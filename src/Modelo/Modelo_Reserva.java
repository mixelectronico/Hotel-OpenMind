
package Modelo;

import java.util.Date;

public class Modelo_Reserva {
    private int ID_RESERVA;
    private String ESTADO_RESERVA;
    private Date FECHA_RESERVA;
    private String RUT_TITULAR;
    private int ID_HABITACION;
    private String MODALIDAD_RESERVA;

    public int getID_HABITACION() {
        return ID_HABITACION;
    }

    public void setID_HABITACION(int ID_HABITACION) {
        this.ID_HABITACION = ID_HABITACION;
    }

    public String getMODALIDAD_RESERVA() {
        return MODALIDAD_RESERVA;
    }

    public void setMODALIDAD_RESERVA(String MODALIDAD_RESERVA) {
        this.MODALIDAD_RESERVA = MODALIDAD_RESERVA;
    }

    public int getID_RESERVA() {
        return ID_RESERVA;
    }

    public void setID_RESERVA(int ID_RESERVA) {
        this.ID_RESERVA = ID_RESERVA;
    }

    public String getESTADO_RESERVA() {
        return ESTADO_RESERVA;
    }

    public void setESTADO_RESERVA(String ESTADO_RESERVA) {
        this.ESTADO_RESERVA = ESTADO_RESERVA;
    }

    public Date getFECHA_RESERVA() {
        return FECHA_RESERVA;
    }

    public void setFECHA_RESERVA(Date FECHA_RESERVA) {
        this.FECHA_RESERVA = FECHA_RESERVA;
    }

    public String getRUT_TITULAR() {
        return RUT_TITULAR;
    }

    public void setRUT_TITULAR(String RUT_TITULAR) {
        this.RUT_TITULAR = RUT_TITULAR;
    }
    
    
}
