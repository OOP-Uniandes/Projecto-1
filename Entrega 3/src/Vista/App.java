package src.Vista;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.Modelo.Equipos.Equipo;
import src.Modelo.Equipos.EquipoReal;
import src.Modelo.Jugadores.Jugador;
import src.Modelo.Temporadas.Temporada;
import src.Modelo.Usuarios.Administrador;
import src.Modelo.Usuarios.Participante;
import src.Modelo.Usuarios.Usuario;
import src.Procesamiento.Archivo;

public class App {

	public static Usuario usuarioActual = null;
	public static Administrador adminActual = null;
	public static Participante participanteActual = null;
	public static ArrayList<Temporada> temporadas = new ArrayList<Temporada>();

	public static void main(String[] args) throws IOException {
		{
			Archivo reader = new Archivo();
			temporadas = reader.cargarTemporadas("data/datos_iniciales.json");
			MenuInicioDeSesion();
		}
	}

	private static void MenuInicioDeSesion() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Iniciar Sesión");
		System.out.println("2. Registrate Gratis");
		System.out.println("3. Salir");
		System.out.println("Selecciona una opción para continuar");

		int opcion_seleccionada = sc.nextInt();

		if (opcion_seleccionada == 1) {
			boolean login = iniciarSesion();

			if (login == true) {
				if (usuarioActual.rol.equals("Usuario")) {
					// menu usuario
					participanteActual = new Participante(usuarioActual.nombre, usuarioActual.contraseña,
							usuarioActual.rol);

				} else if (usuarioActual.rol.equals("Administrador")) {
					// menu administrador
					adminActual = new Administrador(usuarioActual.nombre, usuarioActual.contraseña, usuarioActual.rol);
					menuAdministrador();

				}
			} else {
				MenuInicioDeSesion();
			}

		} else if (opcion_seleccionada == 2) {
			RegistrarUsuario();

		} else {
			System.out.println("Has salido de la aplicación");
		}
		sc.close();

	}

	private static void menuAdministrador() {
		Scanner sc = new Scanner(System.in);
		boolean continue_ = true;

		while (continue_) {
			adminActual.mostrarMenuAdministrador();
			int opcion_seleccionada_administrador = sc.nextInt();

			if (opcion_seleccionada_administrador == 1) {
				sc.nextLine();

				System.out.println("Nombre temporada:");
				String nombre = sc.nextLine();

				System.out.println("Fecha inicio:");
				String fechaInicio = sc.nextLine();

				System.out.println("Fecha final:");
				String fechaFinal = sc.nextLine();

				int id = temporadas.get(temporadas.size() - 1).getId() + 1;
				temporadas.add(adminActual.crearTemporada(id, nombre, fechaInicio, fechaFinal));
				System.out.println("\n\n\n\n\nLa temporada ha sido creada con exito!");

			} else if (opcion_seleccionada_administrador == 2) {
				sc.nextLine();

				System.out.println("Nombre equipo: ");
				String nombre = sc.nextLine();

				System.out.println("Temporada a la que pertenece: ");
				adminActual.mostrarLigas(temporadas);
				int temporadaId = sc.nextInt();

				for (Temporada temporada : temporadas) {
					if (temporada.getId() == temporadaId) {
						ArrayList<EquipoReal> equipos = temporada.getEquipos();
						EquipoReal equipo = new EquipoReal(nombre, equipos.size() + 1);
						equipos.add(equipo);
						temporada.setEquipos(equipos);
						System.out.println("\n\n\n\n\nEquipo creado y añadido a la temporada !");
					}

				}

			} else if (opcion_seleccionada_administrador == 3) {
				sc.nextLine();
				System.out.println("Nombre jugador: ");
				String nombre = sc.nextLine();

				String posicion = adminActual.posicionJugadorPrompt();

				System.out.println("Precio del jugador: ");
				Double precio = sc.nextDouble();

				System.out.println("Seleccione la temporada: ");
				adminActual.mostrarLigas(temporadas);
				int temporadaId = sc.nextInt();

				Temporada temporadaSeleccionada;
				for (Temporada temporada : temporadas) {
					if (temporada.getId() == temporadaId) {
						temporadaSeleccionada = temporada;
						EquipoReal equipoSeleccionado = adminActual.seleccionarEquipoTemporada(temporadaSeleccionada);
						Jugador jugador = new Jugador(equipoSeleccionado.getJugadores().size() + 1, nombre, posicion,
								precio);
						ArrayList<Jugador> jugadoresEquipo = equipoSeleccionado.getJugadores();
						jugadoresEquipo.add(jugador);
						equipoSeleccionado.setJugadores(jugadoresEquipo);
						System.out.println("\n\n\n\n\n\nEl jugador ha sido añadido !");
					}
				}

			} else if (opcion_seleccionada_administrador == 4) {

				System.out.println("Temporada a la que pertenece: ");
				adminActual.mostrarLigas(temporadas);
				int temporadaId = sc.nextInt();
				for (Temporada temporada : temporadas) {
					if (temporada.getId() == temporadaId) {
						// crear funciones en administrador
						EquipoReal equipoLocal;
						EquipoReal equipoVisitante;
					}
				}

			} else if (opcion_seleccionada_administrador == 10) {
				ObjectMapper mapper = new ObjectMapper();
				try {
					String json = mapper.writeValueAsString(temporadas);
					System.out.println(json);
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (opcion_seleccionada_administrador == 0) {
				continue_ = false;
			}
		}
	}

	private static boolean iniciarSesion() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre de usuario");
		String usuario = sc.nextLine();

		System.out.println("Ingresa tu contraseña");
		String contrasena = sc.nextLine();

		Usuario user = src.Modelo.Usuarios.Usuario.iniciarSesion(usuario, contrasena);

		if (user == null) {
			MenuInicioDeSesion();
			return false;
		}
		usuarioActual = user;
		return true;
	}

	private static void RegistrarUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre de usuario");
		String usuario = sc.nextLine();

		System.out.println("Ingresa tu contraseña");
		String contrasena = sc.nextLine();

		sc.close();

		Usuario user = src.Modelo.Usuarios.Usuario.RegistrarUsuario(usuario, contrasena, "Usuario");
		if (user != null) {
			usuarioActual = user;
		}
	}

}
