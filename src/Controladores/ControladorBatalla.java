package Controladores;

import Clases.Entrenador;
import Clases.Pokemon;
import Vistas.BatallaPokemon;

public class ControladorBatalla {
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private BatallaPokemon vista;
    //Recibe el modelo batalla no esta todavia
    public ControladorBatalla(Pokemon pokemon1, Pokemon pokemon2, BatallaPokemon vista) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.vista = vista;
        this.vista.setControlador(this);
    }
    public void iniciar() {
        String nombre1 = pokemon1.getNombre();
        String nombre2 = pokemon2.getNombre();
        String Vida1 = String.valueOf(pokemon1.getVida());
        String Vida2 = String.valueOf(pokemon2.getVida());
        String AtatquePrimerEntrenador1 = "<html>" + pokemon1.getAtaques().get(0).getNombreAtaque() + "<br>" + "daño:" +pokemon1.getAtaques().get(0).getPotencia() + "</html>";
        String AtatquePrimerEntrenador2 = "<html>" + pokemon1.getAtaques().get(1).getNombreAtaque() + "<br>" + "daño:" +pokemon1.getAtaques().get(1).getPotencia() + "</html>";
        String AtatquePrimerEntrenador3 = "<html>" + pokemon1.getAtaques().get(2).getNombreAtaque() + "<br>" + "daño:" +pokemon1.getAtaques().get(2).getPotencia() + "</html>";
        String AtatquePrimerEntrenador4 = "<html>" + pokemon1.getAtaques().get(3).getNombreAtaque() + "<br>" + "daño:" +pokemon1.getAtaques().get(3).getPotencia() + "</html>";
        String AtatqueSegundoEntrenador1 = "<html>" + pokemon2.getAtaques().get(0).getNombreAtaque() + "<br>" + "daño:" +pokemon2.getAtaques().get(0).getPotencia() + "</html>";
        String AtatqueSegundoEntrenador2 = "<html>" + pokemon2.getAtaques().get(1).getNombreAtaque() + "<br>" + "daño:" +pokemon2.getAtaques().get(1).getPotencia() + "</html>";
        String AtatqueSegundoEntrenador3 = "<html>" + pokemon2.getAtaques().get(2).getNombreAtaque() + "<br>" + "daño:" +pokemon2.getAtaques().get(2).getPotencia() + "</html>";
        String AtatqueSegundoEntrenador4 = "<html>" + pokemon2.getAtaques().get(3).getNombreAtaque() + "<br>" + "daño:" +pokemon2.getAtaques().get(3).getPotencia() + "</html>";
        String imagen1 = Entrenador.getimagenes_Back().get(pokemon1.getNombre());
        String imagen2 = Entrenador.getimagenes_front().get(pokemon2.getNombre());
        vista.Iniciar(nombre1, nombre2, Vida1, Vida2, AtatquePrimerEntrenador1, AtatquePrimerEntrenador2, AtatquePrimerEntrenador3, AtatquePrimerEntrenador4, AtatqueSegundoEntrenador1, AtatqueSegundoEntrenador2, AtatqueSegundoEntrenador3, AtatqueSegundoEntrenador4, imagen1, imagen2);
    }
    



}
