package Modelo.Usuarios;

import java.util.Scanner;

public class Participante extends Usuario {

	public Participante(String nombre, String contraseña, String rol) {
		super(nombre, contraseña, "Participante");
		// TODO Auto-generated constructor stub
	}

	public static void Main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Usuario: ");
		String usuario = scn.nextLine();

		System.out.println("Contraseña: ");
		String contraseña = scn.nextLine();

	}
}
