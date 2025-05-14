package Clases;

public class Batalla {
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private byte turno;
    private byte contadorAtaque1;
    private byte contadorAtaque2;

    public Batalla(Entrenador entrenador1, Entrenador entrenador2, Pokemon pokemon1, Pokemon pokemon2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public void turno() {
        if (pokemon1.getVelocidad() >= pokemon2.getVelocidad()) {
            this.turno = (byte)(1); // Pokemon 1 ataca primero
        } else {
            this.turno = (byte)(2); // Pokemon 2 ataca primero
        }
    }

    public void atacar(int indiceAtaque) {
        if (turno == 1) {
            pokemon1.atacar(pokemon2, indiceAtaque);
            contadorAtaque1++;
            this.turno = 2; // Cambia el turno al Pokemon 2
        } else {
            pokemon2.atacar(pokemon1, indiceAtaque);
            contadorAtaque2++;
            this.turno = 1; // Cambia el turno al Pokemon 1
        }
    }

    public void setTurno(byte turno) {
        this.turno = turno;
    }
    public byte getTurno() {
        return turno;
    }

    public byte getContadorAtaque1() {
        return contadorAtaque1;
    }

    public byte getContadorAtaque2() {
        return contadorAtaque2;
    }


}