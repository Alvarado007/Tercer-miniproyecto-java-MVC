package Controladores;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Clases.Batalla;
import Clases.Entrenador;
import Clases.Pokemon;
import Interfaces.SeleccionPokemonInterface;
import Vistas.BatallaPokemon;

public class ControladorSeleccion {
    private Interfaces.SeleccionPokemonInterface vista;
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private Batalla batalla;

    

    public ControladorSeleccion(SeleccionPokemonInterface vista, Entrenador entrenador1, Entrenador entrenador2) {
        this.vista = vista;
        this.vista.setControlador(this);
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void iniciar() {
        String nombreEntrenador1 = entrenador1.getNombre_entrenador();
        String nombreEntrenador2 = entrenador2.getNombre_entrenador();
        Pokemon[] pokemonesEntrenador1 = entrenador1.getEquipo_entrenador().toArray( new Pokemon[0]);
        Pokemon[] pokemonesEntrenador2 = entrenador2.getEquipo_entrenador().toArray( new Pokemon[0]);
        vista.Iniciar(nombreEntrenador1, nombreEntrenador2, pokemonesEntrenador1, pokemonesEntrenador2);
        if(entrenador1.getEquipo_entrenador().size() == 0 ) {
            vista.Mensaje("No hay pokemones disponibles para la batalla, el entrenador " + entrenador2.getNombre_entrenador() + " ha ganado");
            System.exit(0);
        }
        else if(entrenador2.getEquipo_entrenador().size() == 0) {
            vista.Mensaje("No hay pokemones disponibles para la batalla, el entrenador " + entrenador1.getNombre_entrenador() + " ha ganado");
            System.exit(0);
        }
        else {
            vista.Mensaje("Selecciona un pokemon para iniciar la batalla");
        }
    }

    public void InicioBatalla(Pokemon pokemon1, Pokemon pokemon2) {
        this.batalla = new Batalla(entrenador1, entrenador2, pokemon1, pokemon2);
        BatallaPokemon vistaBatalla = new BatallaPokemon();
        ControladorBatalla controlador = new ControladorBatalla(pokemon1, pokemon2, vistaBatalla, batalla);
        controlador.iniciar();
    }

    public void setBatalla(Batalla batalla) {
        this.batalla = batalla;
    }
        

}