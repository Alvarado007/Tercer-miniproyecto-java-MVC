package Vistas;

import java.util.ArrayList;
import java.util.Scanner;

import Clases.Pokemon;
import Controladores.ControladorEntrenadores;
import Interfaces.EntrenadoresInterface;

public class EntrenadoresTerminal implements EntrenadoresInterface {

    ControladorEntrenadores controlador;
    
    private Scanner scanner;

    public EntrenadoresTerminal() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void setControlador(ControladorEntrenadores controlador) {
        this.controlador = controlador;
    }

    @Override
    public void Iniciar() {
        System.out.println("Eliga una opcion:");
        System.out.println("1. Nombres entrenadores");
        System.out.println("2. Cambiar a GUI");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                controlador.setESGUI(false);
                System.out.println("Nombre del Entrenador 1:");
                String nombreEntrenador1 = scanner.next();
                System.out.println("Nombre del Entrenador 2:");
                String nombreEntrenador2 = scanner.next();
                controlador.crearEntrenadores(nombreEntrenador1, nombreEntrenador2);
                break;
        
            case 2:
                controlador.cambiarVista();
                break;
        }
    }

    @Override
    public void Mostrar_equipo(String nombreEntrenador, ArrayList<Pokemon> equipo) {
        for (int i = 0; i < equipo.size(); i++) {
            System.out.println("Entrenador: " + nombreEntrenador + " Pokemon: " + equipo.get(i).getNombre());
        }
    }
    
}
