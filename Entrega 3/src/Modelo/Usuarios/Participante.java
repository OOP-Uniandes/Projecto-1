package src.Modelo.Usuarios;

import java.util.ArrayList;

import src.Modelo.Equipos.Equipo;
import src.Modelo.Equipos.EquipoFantasia;
import src.Modelo.Jugadores.Jugador;

public class Participante extends Usuario {

    public Participante(String nombre, String contraseña, String rol) {
        super(nombre, contraseña, "Participante");
    }

    public static void Main(String[] args) {

    }
    public EquipoFantasia crearEquipo(String nombre, int id, int puntajeActual, double presupuesto, ArrayList<Jugador> alineacion, Jugador capitan) {
        EquipoFantasia equipo = new EquipoFantasia(nombre, id, puntajeActual, presupuesto, alineacion, capitan);
            return equipo;
    
    }
    public void configurarAlineacion(ArrayList<Jugador> alineacion, EquipoFantasia equipo) {
            equipo.setAlineacion(alineacion);
    }
    public Jugador comprarJugador(int id, String nombre) {
        Jugador comprar = new Jugador(id, nombre, nombre, null);
            return comprar;
            
    }
}