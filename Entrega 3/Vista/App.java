package Vista;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelo.Temporada;
import Modelo.Usuarios.Administrador;
import Modelo.Usuarios.Participante;
import Modelo.Usuarios.Usuario;

public class App {

	public static Usuario usuarioActual = null;
	public static Administrador adminActual = null;
	public static Participante participanteActual = null;
	public static ArrayList<Temporada> list = new ArrayList<Temporada>();

	public static void main(String[] args) throws IOException {
		{
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
				if (usuarioActual.rol == "Usuario") {
					// menu usuario
					participanteActual = new Participante(usuarioActual.nombre, usuarioActual.contraseña,
							usuarioActual.rol);
				} else if (usuarioActual.rol == "Administrador") {
					// menu administrador
					adminActual = new Administrador(usuarioActual.nombre, usuarioActual.contraseña, usuarioActual.rol);
					adminActual.mostrarMenuAdministrador();
				}
			} else {
				MenuInicioDeSesion();
			}

		} else if (opcion_seleccionada == 2) {
			RegistrarUsuario();

		} else {
			System.out.println("Has salido de la aplicación");
		}

	}

	private static boolean iniciarSesion() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre de usuario");
		String usuario = sc.nextLine();

		System.out.println("Ingresa tu contraseña");
		String contrasena = sc.nextLine();

		Usuario user = Modelo.Usuarios.Usuario.iniciarSesion(usuario, contrasena);
		if (user == null) {
			MenuInicioDeSesion();
			return false;
		}
		usuarioActual = user;
		return true;
	}

	private static void RegistrarUsuario() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre de usuario");
		String usuario = sc.nextLine();

		System.out.println("Ingresa tu contraseña");
		String contrasena = sc.nextLine();

		Usuario user = Modelo.Usuarios.Usuario.RegistrarUsuario(usuario, contrasena, "Usuario");
		if (user != null) {
			usuarioActual = user;
		}
	}

}
