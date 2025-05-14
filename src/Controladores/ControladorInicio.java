package Controladores;

import Interfaces.Inicio;
import Vistas.Entrenadores;

public class ControladorInicio {
    private Inicio vista;

    public ControladorInicio(Vistas.InicioPokemon vista) {
        this.vista = vista;
        this.vista.SetControlador(this);
    }

    public void iniciarJuego() {
        Entrenadores vistaEntrenadores = new Entrenadores();
        ControladorEntrenadores controladorEntrenadores = new ControladorEntrenadores(vistaEntrenadores);
        controladorEntrenadores.iniciar();
    }

    public void iniciar() {
        vista.Iniciar();
    }
}
