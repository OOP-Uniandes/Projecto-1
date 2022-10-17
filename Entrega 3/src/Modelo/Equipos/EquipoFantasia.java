package src.Modelo.Equipos;

import java.util.ArrayList;

import src.Modelo.Jugadores.Jugador;

public class EquipoFantasia extends Equipo {

    int puntajeActual = 0;

    int cantMediocampistas = 0;

    int cantArqueros = 0;

    int cantDelanteros = 0;

    int cantDefensores = 0;
    // comentario

    String DueñoActual;
    double presupuesto;
    ArrayList<Jugador> alineacion = new ArrayList<Jugador>();
    Jugador capitan = null;

    public EquipoFantasia(String nombre, int id, int puntajeActual, double presupuesto) {
        super(id, nombre);
        this.puntajeActual = puntajeActual;
        this.presupuesto = presupuesto;
    }

    public int getPuntajeActual() {
        return puntajeActual;
    }

    public void setPuntajeActual(int puntajeActual) {
        this.puntajeActual = puntajeActual;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Jugador> getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(ArrayList<Jugador> alineacion) {
        this.alineacion = alineacion;
    }

    public Jugador getCapitan() {
        return capitan;
    }

    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
    }

    public void addJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public int getCantDefensores() {
        return cantDefensores;
    }

    public void setCantDefensores(int cantDefensores) {
        this.cantDefensores = cantDefensores;
    }

    public int getCantDelanteros() {
        return cantDelanteros;
    }

    public void setCantDelanteros(int cantDelanteros) {
        this.cantDelanteros = cantDelanteros;
    }

    public int getCantMediocampistas() {
        return cantMediocampistas;
    }

    public void setCantMediocampistas(int cantMediocampistas) {
        this.cantMediocampistas = cantMediocampistas;
    }

    public int getCantArqueros() {
        return cantArqueros;
    }

    public void setCantArqueros(int cantArqueros) {
        this.cantArqueros = cantArqueros;
    }

    public void removeJugador(Jugador jugador) {
        this.jugadores.remove(jugador);
    }
}