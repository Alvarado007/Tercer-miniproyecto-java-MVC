import java.util.Scanner;
import java.util.ResourceBundle.Control;

import Clases.Visualizacion;
import Controladores.ControladorInicio;
import Vistas.InicioPokemon;
import Vistas.InicioPokemon;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // Visualizacion visualizacion = new Visualizacion();
        // visualizacion.iniciarJuego(sc);
        // sc.close();
        InicioPokemon inicio = new InicioPokemon();
        ControladorInicio controlador = new ControladorInicio(inicio);
        controlador.iniciar();
    }
}
