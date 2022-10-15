package src.Vista;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
				System.out.println("Haz iniciado sesión !");
				if (usuarioActual.rol.equals("Usuario")) {
					// menu usuario
					participanteActual = new Participante(usuarioActual.nombre, usuarioActual.contraseña,
							usuarioActual.rol);

				} else if (usuarioActual.rol.equals("Administrador")) {
					// menu administrador
					adminActual = new Administrador(usuarioActual.nombre, usuarioActual.contraseña, usuarioActual.rol);
					adminActual.mostrarMenuAdministrador();

					int opcion_seleccionada_administrador = 1;

					if (opcion_seleccionada_administrador == 1) {
						int id = sc.nextInt();
						String fechaInicio = sc.nextLine();
						String fechaFinal = sc.nextLine();

						temporadas.add(adminActual.crearTemporada(id, fechaInicio, fechaFinal));
						System.out.println("La temporada ha sido creada con exito!");
					} else if (opcion_seleccionada_administrador == 2) {

					} else if (opcion_seleccionada_administrador == 3) {

					} else if (opcion_seleccionada_administrador == 4) {

					}

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

	private static boolean iniciarSesion() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre de usuario");
		String usuario = sc.nextLine();

		System.out.println("Ingresa tu contraseña");
		String contrasena = sc.nextLine();

		sc.close();

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
