package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

import Modelo.Equipos.EquipoReal;
import Modelo.Jugadores.Jugador;

public class Partido {
    private int id;
    private EquipoReal equipoLocal;
    private EquipoReal equipoVisitante;
    private String fecha;
    private String hora;
    private ArrayList<HashMap<Jugador, Integer>> rendimientoJugadores = new ArrayList<HashMap<Jugador, Integer>>();

    public Partido(int id, EquipoReal equipoLocal, EquipoReal equipoVisitante, String fecha, String hora) {
        this.id = id;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EquipoReal getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(EquipoReal equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public EquipoReal getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(EquipoReal equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public ArrayList<HashMap<Jugador, Integer>> getRendimientoJugadores() {
        return rendimientoJugadores;
    }

    public void setRendimientoJugadores(ArrayList<HashMap<Jugador, Integer>> rendimientoJugadores) {
        this.rendimientoJugadores = rendimientoJugadores;
    }

}
