
package Controlador;

import Modelo.ReservasModel;

public class ReservasController {
    
    ReservasModel r = new ReservasModel();
    
    public static void SeleccionarReservas()
    {
        
    }
    
    public  void InsertarReservas(String name, int valor) {
        
        System.out.print(name);
        System.out.print(valor);
        r.InsertarReservas(name, valor);
        //boolean flag = r.InsertarReservas();
    }


    
}
