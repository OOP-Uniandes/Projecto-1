package src.Modelo.Usuarios;

import src.Modelo.Equipos.EquipoReal;
import src.Modelo.Jugadores.Jugador;
import src.Modelo.Partidos.Partido;
import src.Modelo.Temporadas.Temporada;

public class Administrador extends Usuario {

    public Administrador(String nombre, String contraseña, String rol) {
        super(nombre, contraseña, rol);
    }

    public void mostrarMenuAdministrador() {
        System.out.println("1. Crear temporada");
        System.out.println("2. Crear equipo");
        System.out.println("3. Crear jugador");
        System.out.println("4. Asignar partido a temporada");

    }

    public Temporada crearTemporada(int id, String fechaInicio, String fechaFinal) {
        Temporada temporada = new Temporada(id, fechaInicio, fechaFinal);
        return temporada;
    }

    public EquipoReal equipoReal(String nombre, int id) {
        EquipoReal equipo = new EquipoReal(nombre, id);
        return equipo;
    }

    public Jugador crearJugador(int id, String nombre, String posicion, Double precio) {
        Jugador jugador = new Jugador(id, nombre, posicion, precio);
        return jugador;
    }

    public Partido crearPartido(int id, EquipoReal equipoLocal, EquipoReal equipoVisitante, String fecha, String hora) {
        Partido partido = new Partido(id, equipoLocal, equipoVisitante, fecha, hora);
        return partido;
    }

}
