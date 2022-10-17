package src.Modelo.Usuarios;

import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println("4. Crear partido");
        System.out.println("10. Guardar cambios y salir");

    }

    public Temporada crearTemporada(int id, String nombre, String fechaInicio, String fechaFinal, int presupuesto) {
        Temporada temporada = new Temporada(id, nombre, fechaInicio, fechaFinal);
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

    public void mostrarLigas(ArrayList<Temporada> temporadas) {
        for (int i = 0; i < temporadas.size(); i++) {
            Temporada temporada = temporadas.get(i);
            System.out.println(temporada.getId() + ": " + temporada.getNombre());
        }
    }

    public String posicionJugadorPrompt() {
        System.out.println("Posicion: ");
        System.out.println("1. mediocampista");
        System.out.println("2. delantero");
        System.out.println("3. defensa");
        System.out.println("4. arquero");

        Scanner sc = new Scanner(System.in);
        int posicion = sc.nextInt();

        switch (posicion) {
            case 1:
                return "mediocampista";
            case 2:
                return "delantero";
            case 3:
                return "defensa";
            case 4:
                return "arquero";
            default:
                return null;
        }

    }

    public EquipoReal seleccionarEquipoTemporada(Temporada temporada) {
        System.out.println("Seleccione al equipo al que pertenece");
        for (int i = 0; i < temporada.getEquipos().size(); i++) {
            EquipoReal equipo = temporada.getEquipos().get(i);
            System.out.println(equipo.getId() + ": " + equipo.getNombre());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Equipo: ");
        int equipoSeleccionadoId = sc.nextInt();

        for (EquipoReal equipo : temporada.getEquipos()) {
            if (equipo.getId() == equipoSeleccionadoId) {
                return equipo;
            }
        }
        return null;
    }

}
