
package Modelo;

public class Modelo_Habitacion {
    private int ID_HABITACION;
    private String NOMBRE_HABITACION;
    private int PRECIO_MOMENTO;
    private int PRECIO_JORNADA;
    private String ESTADO_HABITACION;

    public int getID_HABITACION() {
        return ID_HABITACION;
    }

    public void setID_HABITACION(int ID_HABITACION) {
        this.ID_HABITACION = ID_HABITACION;
    }

    public String getNOMBRE_HABITACION() {
        return NOMBRE_HABITACION;
    }

    public void setNOMBRE_HABITACION(String NOMBRE_HABITACION) {
        this.NOMBRE_HABITACION = NOMBRE_HABITACION;
    }

    public int getPRECIO_MOMENTO() {
        return PRECIO_MOMENTO;
    }

    public void setPRECIO_MOMENTO(int PRECIO_MOMENTO) {
        this.PRECIO_MOMENTO = PRECIO_MOMENTO;
    }

    public int getPRECIO_JORNADA() {
        return PRECIO_JORNADA;
    }

    public void setPRECIO_JORNADA(int PRECIO_JORNADA) {
        this.PRECIO_JORNADA = PRECIO_JORNADA;
    }

    public String getESTADO_HABITACION() {
        return ESTADO_HABITACION;
    }

    public void setESTADO_HABITACION(String ESTADO_HABITACION) {
        this.ESTADO_HABITACION = ESTADO_HABITACION;
    }
    
}
