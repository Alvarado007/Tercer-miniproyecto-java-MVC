package Vistas;

import java.util.Scanner;

import Controladores.ControladorBatalla;
import Interfaces.BatallaInterface;

public class BatallaPokemonTerminal implements BatallaInterface {

    ControladorBatalla controlador;
    
    Scanner scanner;

    public BatallaPokemonTerminal() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void setControlador(ControladorBatalla controlador) {
        this.controlador = controlador;
    }

    @Override
    public void Iniciar(String nombre1, String nombre2, String Vida1, String Vida2, String AtatquePrimerEntrenador1,
            String AtatquePrimerEntrenador2, String AtatquePrimerEntrenador3, String AtatquePrimerEntrenador4,
            String AtatqueSegundoEntrenador1, String AtatqueSegundoEntrenador2, String AtatqueSegundoEntrenador3,
            String AtatqueSegundoEntrenador4, String imagen1, String imagen2) {
        
    }

    @Override
    public void Mensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void Borrar() {
        
    }
    
}
