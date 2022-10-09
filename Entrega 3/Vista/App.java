package Vista;

import java.io.IOException;
import java.util.Scanner;

public class App {
	
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
		
		if (opcion_seleccionada == 1) 
		{
			boolean login = iniciarSesion();
			
			if(login == true) {
				System.out.println("Todo ok");
			} else {
				MenuInicioDeSesion();
			}
			
		} else if (opcion_seleccionada == 2)
		{
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
		
		boolean login = Modelo.Users.Usuario.iniciarSesion(usuario, contrasena);
		return login;
	}

	private static void RegistrarUsuario() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre de usuario");
		String usuario = sc.nextLine();
		
		System.out.println("Ingresa tu contraseña");
		String contrasena = sc.nextLine();
		
		System.out.println("¿Usuario o Admin?");
		String rol = sc.nextLine();
		Modelo.Users.Usuario.RegistrarUsuario(usuario, contrasena, rol);
	}

}


