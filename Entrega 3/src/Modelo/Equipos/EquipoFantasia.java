package src.Modelo.Equipos;

import java.util.ArrayList;

import src.Modelo.Jugadores.Jugador;

public class EquipoFantasia extends Equipo {

    int puntajeActual = 0;

    int cantMediocampistas = 0;

    int cantArqueros = 0;

    int cantDelanteros = 0;

    int cantDefensores = 0;
    

    int AlineacionArqueros = 0;
    int AlineacionMedioCampistas = 0;
    int AlineacionDefensas = 0;
    int AlineacionDelanteros = 0;
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

    
    public int getAlineacionArqueros() {
        return AlineacionArqueros;
    }

    public void setAlineacionArqueros(int alineacionArqueros) {
        AlineacionArqueros = alineacionArqueros;
    }

    public int getAlineacionMedioCampistas() {
        return AlineacionMedioCampistas;
    }

    public void setAlineacionMedioCampistas(int alineacionMedioCampistas) {
        AlineacionMedioCampistas = alineacionMedioCampistas;
    }

    public int getAlineacionDefensas() {
        return AlineacionDefensas;
    }

    public void setAlineacionDefensas(int alineacionDefensas) {
        AlineacionDefensas = alineacionDefensas;
    }

    public int getAlineacionDelanteros() {
        return AlineacionDelanteros;
    }

    public void setAlineacionDelanteros(int alineacionDelanteros) {
        AlineacionDelanteros = alineacionDelanteros;
    }

    public String getDueñoActual() {
        return DueñoActual;
    }

    public void setDueñoActual(String dueñoActual) {
        DueñoActual = dueñoActual;
    }
}