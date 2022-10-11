package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

import Modelo.Equipos.Equipo;

public class Partido {
    private int id;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String fecha;
    private String hora;
    private ArrayList<HashMap> rendimientoJugadores = new ArrayList<HashMap>();

    public Partido(int id, Equipo equipoLocal, Equipo equipoVisitante, String fecha, String hora) {
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

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
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

    public ArrayList<HashMap> getRendimientoJugadores() {
        return rendimientoJugadores;
    }

    public void setRendimientoJugadores(ArrayList<HashMap> rendimientoJugadores) {
        this.rendimientoJugadores = rendimientoJugadores;
    }

}
