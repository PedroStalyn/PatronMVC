package ec.edu.espoch.sumapatronmvc.controlador;

import ec.edu.espoch.sumapatronmvc.modelo.Modelo;
import ec.edu.espoch.sumapatronmvc.vista.Vista;

public class Controlador {
    
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.modelo= new Modelo();
    }
    
              
            
    public void procesaEventoSumar() {
        double num1, num2, result;
        try {
        
            num1=Double.parseDouble(vista.getPrimerNumero());
            num2=Double.parseDouble(vista.getSegundoNumero());
            result=modelo.sumar(num1, num2);
            vista.mostrarResultado(result);
        
        } catch (NumberFormatException e) {
            vista.mostrarError("Error estas equivocado...");
        }
    }
}
