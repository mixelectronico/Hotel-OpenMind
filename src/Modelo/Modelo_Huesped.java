
package Modelo;

import java.util.Date;

public class Modelo_Huesped {
    private int ID_HUESPED;
    private String RUT;
    private String DIGITOV;
    private String NOMBRE;
    private String APELLIDOP;
    private String APELLIDOM;
    private String SEXO;
    private String NACIONALIDAD;
    private Date FECHANAC;

    public int getID_HUESPED() {
        return ID_HUESPED;
    }

    public void setID_HUESPED(int ID_HUESPED) {
        this.ID_HUESPED = ID_HUESPED;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    public String getDIGITOV() {
        return DIGITOV;
    }

    public void setDIGITOV(String DIGITOV) {
        this.DIGITOV = DIGITOV;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDOP() {
        return APELLIDOP;
    }

    public void setAPELLIDOP(String APELLIDOP) {
        this.APELLIDOP = APELLIDOP;
    }

    public String getAPELLIDOM() {
        return APELLIDOM;
    }

    public void setAPELLIDOM(String APELLIDOM) {
        this.APELLIDOM = APELLIDOM;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public String getNACIONALIDAD() {
        return NACIONALIDAD;
    }

    public void setNACIONALIDAD(String NACIONALIDAD) {
        this.NACIONALIDAD = NACIONALIDAD;
    }

    public Date getFECHANAC() {
        return FECHANAC;
    }

    public void setFECHANAC(Date FECHANAC) {
        this.FECHANAC = FECHANAC;
    }
}
