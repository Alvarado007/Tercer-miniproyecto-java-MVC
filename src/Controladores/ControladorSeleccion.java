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
    private Pokemon PokemonGuardado;
    public static Boolean Guardado;
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
    }
    public void actualizar() {
        String nombreEntrenador1 = entrenador1.getNombre_entrenador();
        String nombreEntrenador2 = entrenador2.getNombre_entrenador();
        Pokemon[] pokemonesEntrenador1 = entrenador1.getEquipo_entrenador().toArray( new Pokemon[0]);
        Pokemon[] pokemonesEntrenador2 = entrenador2.getEquipo_entrenador().toArray( new Pokemon[0]);
        vista.Iniciar(nombreEntrenador1, nombreEntrenador2, pokemonesEntrenador1, pokemonesEntrenador2);
    }
    
    public void guardarPokemon(Pokemon pokemon) {
        this.PokemonGuardado = pokemon;
        this.Guardado = true;
    }

    public void InicioBatalla(Pokemon pokemon1, Pokemon pokemon2) {
        this.batalla = new Batalla(entrenador1, entrenador2, pokemon1, pokemon2);
        BatallaPokemon vistaBatalla = new BatallaPokemon();
        ControladorBatalla controlador = new ControladorBatalla(pokemon1, pokemon2, vistaBatalla, batalla);
        controlador.iniciar();
    }
        

}