
package Modelo;

public class Reserva {
    
    private int ID_RESERVA;
    private String TIPO_CTE;
    private int CANT_OCUP;
    private int CONT_RES;

    public int getID_RESERVA() {
        return ID_RESERVA;
    }

    public void setID_RESERVA(int ID_RESERVA) {
        this.ID_RESERVA = ID_RESERVA;
    }

    public String getTIPO_CTE() {
        return TIPO_CTE;
    }

    public void setTIPO_CTE(String TIPO_CTE) {
        this.TIPO_CTE = TIPO_CTE;
    }

    public int getCANT_OCUP() {
        return CANT_OCUP;
    }

    public void setCANT_OCUP(int CANT_OCUP) {
        this.CANT_OCUP = CANT_OCUP;
    }

    public int getCONT_RES() {
        return CONT_RES;
    }

    public void setCONT_RES(int CONT_RES) {
        this.CONT_RES = CONT_RES;
    }   
}
