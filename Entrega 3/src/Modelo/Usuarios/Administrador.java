package src.Modelo.Usuarios;

import java.util.ArrayList;
import java.util.HashMap;
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
        Temporada temporada = new Temporada(id, nombre, fechaInicio, fechaFinal, presupuesto);
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
        System.out.println("Seleccione al equipo: ");
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

    public Partido mostrarPartidos(Temporada temporada) {
        ArrayList<Partido> partidos = temporada.getPartidos();
        System.out.println("Seleccionar partido a configurar: ");
        for (int i = 0; i < partidos.size(); i++) {
            Partido partido = partidos.get(i);
            System.out.print(partido.getId() + ": " + partido.getEquipoLocal().getNombre() + " V.S "
                    + partido.getEquipoVisitante().getNombre());
        }
        Scanner sc = new Scanner(System.in);
        int idPartido = sc.nextInt();

        for (Partido partido : partidos) {
            if (partido.getId() == idPartido) {
                return partido;
            }
        }
        return null;

    }

    public void registrarDatosPartido(Partido partido) {

        Scanner sc = new Scanner(System.in);

        EquipoReal equipoLocal = partido.getEquipoLocal();
        EquipoReal equipoVisitante = partido.getEquipoVisitante();

        HashMap<Jugador, Integer> rendimiento = new HashMap<Jugador, Integer>();

        for (Jugador jugador : equipoLocal.getJugadores()) {
            System.out.println("Ingrese los puntos del jugador: " + jugador.getNombre());
            int puntosJugador = sc.nextInt();
            rendimiento.put(jugador, puntosJugador);
        }

        for (Jugador jugador : equipoVisitante.getJugadores()) {
            System.out.println("Ingrese los puntos del jugador: " + jugador.getNombre());
            int puntosJugador = sc.nextInt();
            rendimiento.put(jugador, puntosJugador);
        }
    }
}
