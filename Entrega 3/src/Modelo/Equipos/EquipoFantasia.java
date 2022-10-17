package src.Modelo.Equipos;

import java.util.ArrayList;

import src.Modelo.Jugadores.Jugador;

public class EquipoFantasia extends Equipo {

    int puntajeActual = 0;
    String DueñoActual;
    double presupuesto;
    ArrayList<Jugador> alineacion = new ArrayList<Jugador>();
    Jugador capitan = null;

    public EquipoFantasia(String nombre, int id, int puntajeActual, double presupuesto, ArrayList<Jugador> alineacion, Jugador capitan) {
        super(id, nombre);
        this.puntajeActual = puntajeActual;
		this.presupuesto = presupuesto;
		this.alineacion = alineacion;
		this.capitan = capitan;
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

}