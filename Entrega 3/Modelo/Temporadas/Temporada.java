package Modelo.Temporadas;

import java.util.ArrayList;

import Modelo.Equipos.EquipoReal;
import Modelo.Partidos.Partido;

public class Temporada {
    private int id;
    private String fechaInicio;
    private String fechaFinal;
    private ArrayList<Partido> partidos = new ArrayList<Partido>();
    private ArrayList<Ranking> rankingActual = new ArrayList<Ranking>();
    private ArrayList<EquipoReal> equipos = new ArrayList<EquipoReal>();

    public Temporada(int id, String fechaInicio, String fechaFinal) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Ranking> getRankingActual() {
        return rankingActual;
    }

    public void setRankingActual(ArrayList<Ranking> rankingActual) {
        this.rankingActual = rankingActual;
    }

    public ArrayList<EquipoReal> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<EquipoReal> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {

        // TODO: implementar toString
        return super.toString();
    }

}
