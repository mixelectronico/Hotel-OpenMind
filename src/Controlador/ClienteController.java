
package Controlador;

import Modelo.ClienteModel;
import java.util.Date;

public class ClienteController {
    //clase nombre_variable
    ClienteModel  cm = new ClienteModel();

    public void InsertarCliente(String m_RUT, String m_DV, String m_NOMBRES, String m_APELLIDOP, String m_APELLIDOM, String m_SEXO, String m_NACIONALIDAD, Date m_FECHANAC) {
        String d_RUT = m_RUT;
        String d_DV = m_DV;
        String d_NOMBRES = m_NOMBRES;
        String d_APELLIDOP = m_APELLIDOP;
        String d_APELLIDOM = m_APELLIDOM;
        String d_SEXO = m_SEXO;
        String d_NACIONALIDAD = m_NACIONALIDAD;
        Date d_FECHANAC;
        d_FECHANAC = m_FECHANAC;
        
        cm.InsertarCliente(d_RUT, d_DV, d_NOMBRES, d_APELLIDOP, d_APELLIDOM, d_SEXO, d_NACIONALIDAD, d_FECHANAC);
        //parametros: 1,2,3,4,5,6,7,8
    }  
}
