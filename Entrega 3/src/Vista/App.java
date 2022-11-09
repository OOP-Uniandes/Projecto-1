package src.Vista;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import src.Interfaces.Login;
import src.Modelo.Equipos.EquipoFantasia;
import src.Modelo.Equipos.EquipoReal;
import src.Modelo.Jugadores.Jugador;
import src.Modelo.Partidos.Partido;
import src.Modelo.Temporadas.Temporada;
import src.Modelo.Usuarios.Administrador;
import src.Modelo.Usuarios.Participante;
import src.Modelo.Usuarios.Usuario;
import src.Procesamiento.Archivo;

public class App {

	public static Usuario usuarioActual = null;
	public static boolean usuarioLogueado = false;
	public static Administrador adminActual = null;
	public static Participante participanteActual = null;
	public static Temporada temporada;;

	public static void main(String[] args) throws IOException {
		{
			Archivo reader = new Archivo();
			temporada = reader.cargarTemporadas("data/datos_iniciales.json");
			new Login();

		}
	}

	// private static void MenuInicioDeSesion() throws IOException {
	// Scanner sc = new Scanner(System.in);
	// System.out.println("1. Iniciar Sesión");
	// System.out.println("2. Registrate Gratis");
	// System.out.println("3. Salir");
	// System.out.println("Selecciona una opción para continuar");

	// int opcion_seleccionada = sc.nextInt();

	// if (opcion_seleccionada == 1) {
	// //boolean login = iniciarSesion();

	// if (login == true) {
	// if (usuarioActual.rol.equals("Usuario")) {
	// // menu usuario
	// participanteActual = new Participante(usuarioActual.nombre,
	// usuarioActual.contraseña,
	// usuarioActual.rol);
	// menuUsuario();

	// } else if (usuarioActual.rol.equals("Administrador")) {
	// // menu administrador
	// adminActual = new Administrador(usuarioActual.nombre,
	// usuarioActual.contraseña, usuarioActual.rol);
	// menuAdministrador();

	// }
	// } else {
	// MenuInicioDeSesion();
	// }

	// } else if (opcion_seleccionada == 2) {
	// RegistrarUsuario();

	// } else {
	// System.out.println("Has salido de la aplicación");
	// }
	// sc.close();

	// }

	private static void menuUsuario() {
		Scanner sc = new Scanner(System.in);
		boolean continue_ = true;

		System.out.println("1. Crear Equipo de Fantasía");
		System.out.println("2. Comprar jugador");
		System.out.println("3. Vender Jugador");
		System.out.println("4. Ver puntuación");
		System.out.println("5. Seleccionar capitan");
		System.out.println("6. Configurar Alineación");

		System.out.println("Pulse una opción para continuar");
		int opcion_seleccionada_participante = sc.nextInt();

		if (opcion_seleccionada_participante == 1) {

			// EquipoFantasia equipoNuevo = participanteActual.crearEquipo(nombre, 0,
			// 0,temporada.getPresupuesto());

			// participanteActual.setEquipo(equipoNuevo);

		} else if (opcion_seleccionada_participante == 2) {

			System.out.println("Intruduzca el nombre del jugador a comprar: ");
			ArrayList<Jugador> jugadores = participanteActual.mostrarJugadoresTemporada(temporada);
			String nombre_jugador = sc.nextLine();
			Jugador jugadorComprar = participanteActual.buscarJugadorPorNombre(nombre_jugador, jugadores);
			if (participanteActual.getEquipo().getPresupuesto() >= jugadorComprar.getPrecio()) {
				EquipoFantasia equipoDelUsuario = participanteActual.getEquipo();
				boolean continuar;

				switch (jugadorComprar.getPosicion()) {
					case "arquero":
						if (equipoDelUsuario.getCantArqueros() < 2) {
							continuar = true;
						} else {
							System.out.println("Ya tienes 2 arqueros");
							continuar = false;
						}
						break;
					case "mediocampista":
						if (equipoDelUsuario.getCantMediocampistas() < 5) {
							continuar = true;
						} else {
							System.out.println("Ya tienes 5 mediocampistas");
							continuar = false;
						}
						break;
					case "defensa":
						if (equipoDelUsuario.getCantDefensores() < 5) {
							continuar = true;
						} else {
							System.out.println("Ya tienes 5 defensores");
							continuar = false;
						}
						break;
					case "delantero":
						if (equipoDelUsuario.getCantDelanteros() < 3) {
							continuar = true;
						} else {
							System.out.println("Ya tienes 3 delanteros");
							continuar = false;
						}
						break;
					default:
						continuar = false;
						break;
				}

				if (continuar) {
					int presupuesto = (int) participanteActual.getEquipo().getPresupuesto();
					double nuevoPresupuesto = presupuesto - jugadorComprar.getPrecio();
					participanteActual.getEquipo().setPresupuesto(nuevoPresupuesto);

					participanteActual.getEquipo().addJugador(jugadorComprar);
					System.out.println("Compra exitosa! Su nuevo presupuesto: " + nuevoPresupuesto);
				}

			} else {
				System.out.println("No se puede comprar :(");
			}

		} else if (opcion_seleccionada_participante == 3) {
			sc.nextLine();
			System.out.println("Temporada a la que pertenece: ");

			System.out.println("Intruduzca el nombre del jugador a vender ");
			ArrayList<Jugador> jugadores = participanteActual.mostrarJugadoresTemporada(temporada);
			String jugadorVenderNombre = sc.nextLine();
			Jugador jugadorVender = participanteActual.buscarJugadorPorNombre(jugadorVenderNombre, jugadores);
			participanteActual.getEquipo().removeJugador(jugadorVender);
			participanteActual.getEquipo().setPresupuesto(
					participanteActual.getEquipo().getPresupuesto() + jugadorVender.getPrecio() * 0.97);

			System.out.println("Jugador vendido !");

		} else if (opcion_seleccionada_participante == 4) {

		} else if (opcion_seleccionada_participante == 5) {

			sc.nextLine();
			try {
				System.out.println("Introducir nombre capitan: ");
				String nombreCapitan = sc.nextLine();
				Jugador capitan = participanteActual.buscarJugadorPorNombre(nombreCapitan,
						participanteActual.getEquipo().getJugadores());
				participanteActual.getEquipo().setCapitan(capitan);

			} catch (Exception e) {
				System.out.println("El capitan no esta2 en tu equipo :(");
			}

		} else if (opcion_seleccionada_participante == 6) {

			System.out.println("Hora de generar una alineación");
			System.out.println("Temporada a la que pertenece: ");
			int temporadaId = sc.nextInt();
			System.out.println("Seleccione el jugador a alinear");
			String nombre_jugador = sc.nextLine();

			ArrayList<Jugador> Jugadorescomprados = participanteActual.getEquipo().getJugadores();
			ArrayList<Jugador> alineacion_equipo = participanteActual.getEquipo().getAlineacion();
			Jugador Jugador_a_alinear = participanteActual.buscarJugadorPorNombre(nombre_jugador,
					Jugadorescomprados);

			boolean continuar = false;

			switch (Jugador_a_alinear.getPosicion()) {

				case "arquero":
					if (participanteActual.getEquipo().getAlineacionArqueros() < 1) {
						continuar = true;
					} else {
						System.out.println("Ya tienes 1 arquero");
						continuar = false;
					}

				case "defensa":

					if (participanteActual.getEquipo().getAlineacionDefensas() < 4) {
						continuar = true;
					} else {
						System.out.println("Ya tienes 4 defensores");
						continuar = false;
					}

				case "mediocampista":

					if (participanteActual.getEquipo().getAlineacionMedioCampistas() < 4) {
						continuar = true;
					} else {
						System.out.println("Ya tienes 4 mediocampistas");
						continuar = false;
					}

				case "delantero":

					if (participanteActual.getEquipo().getAlineacionDelanteros() < 2) {
						continuar = true;
					} else {
						System.out.println("Ya tienes 2 delanteros");
						continuar = false;
					}

				default:

					continuar = false;

			}
			if (continuar) {
				alineacion_equipo.add(Jugador_a_alinear);
			} else {
				System.out.println(
						"Ya tienes suficientes jugadores en las posiciones de la alineación correspondiente: 1 Arquero - 4 Defensas - 4 Medio Campistas - 2 Delanteros");
			}

		} else {
			System.out.println("Por favor seleccione una opción válida");
			menuUsuario();
		}

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

				System.out.println("Presupuesto de la Temporada (para los equipos)");
				int presupuesto = sc.nextInt();

				System.out.println("\n\n\n\n\nLa temporada ha sido creada con exito!");

			} else if (opcion_seleccionada_administrador == 2) {
				sc.nextLine();

				System.out.println("Nombre equipo: ");
				String nombre = sc.nextLine();

				System.out.println("Temporada a la que pertenece: ");

				int temporadaId = sc.nextInt();

				ArrayList<EquipoReal> equipos = temporada.getEquipos();
				EquipoReal equipo = new EquipoReal(nombre, equipos.size() + 1);
				equipos.add(equipo);
				temporada.setEquipos(equipos);
				System.out.println("\n\n\n\n\nEquipo creado y añadido a la temporada !");

			} else if (opcion_seleccionada_administrador == 3) {
				sc.nextLine();
				System.out.println("Nombre jugador: ");
				String nombre = sc.nextLine();

				String posicion = adminActual.posicionJugadorPrompt();

				System.out.println("Precio del jugador: ");
				Double precio = sc.nextDouble();

				System.out.println("Seleccione la temporada: ");

				int temporadaId = sc.nextInt();

				Temporada temporadaSeleccionada;

				temporadaSeleccionada = temporada;
				EquipoReal equipoSeleccionado = adminActual.seleccionarEquipoTemporada(temporadaSeleccionada);
				Jugador jugador = new Jugador(equipoSeleccionado.getJugadores().size() + 1, nombre, posicion,
						precio);
				ArrayList<Jugador> jugadoresEquipo = equipoSeleccionado.getJugadores();
				jugadoresEquipo.add(jugador);
				equipoSeleccionado.setJugadores(jugadoresEquipo);
				System.out.println("\n\n\n\n\n\nEl jugador ha sido añadido !");

			} else if (opcion_seleccionada_administrador == 4) {
				sc.nextLine();
				System.out.println("Temporada a la que pertenece: ");

				int temporadaId = sc.nextInt();

				System.out.print("Equipo local: ");
				EquipoReal equipoLocal = adminActual.seleccionarEquipoTemporada(temporada);

				System.out.print("Equipo visitante: ");
				EquipoReal equipoVisitante = adminActual.seleccionarEquipoTemporada(temporada);

				System.out.print("Fecha: ");
				String fecha = sc.nextLine();

				System.out.print("Hora : ");
				String hora = sc.nextLine();

				Partido partido = new Partido(temporada.getPartidos().size() - 1, equipoLocal, equipoVisitante,
						fecha, hora);

				ArrayList<Partido> partidos = temporada.getPartidos();

				partidos.add(partido);

				temporada.setPartidos(partidos);

				System.out.println("\n\n\n\n\n\n Partido añadido !");

			} else if (opcion_seleccionada_administrador == 5) {
				// Registrar informacion de partidos
				sc.nextLine();
				System.out.println("Temporada a la que pertenece: ");

				int temporadaId = sc.nextInt();

				Partido partido_seleccionado = null;
				partido_seleccionado = adminActual.mostrarPartidos(temporada);
				adminActual.registrarDatosPartido(partido_seleccionado);
				System.out.println("\n\n\n\n\n\n\n\nDatos registrados!");

			} else if (opcion_seleccionada_administrador == 10) {
				ObjectMapper mapper = new ObjectMapper();
				try {
					String json = mapper.writeValueAsString(temporada);
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

}
