package Modelo.Users;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Usuario {
	private int id;
	private String nombre;
	private String contraseña;
	private static String rol;
	
	// Constructor
	public Usuario(String nombre, String contraseña, String rol) {
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.rol = rol;
	}
	public void cambiarContraseña(String nuevaContraseña) {
		this.contraseña = nuevaContraseña;
	}
	public static void RegistrarUsuario(String nombre, String contraseña, String rol) {
		 try{
	            FileWriter fw = new FileWriter("C:\\Users\\samue\\Desktop\\Entrega 3\\Projecto-1\\Entrega 3\\Modelo\\Users\\db.txt", true);
	            BufferedWriter bw = new BufferedWriter(fw);
	            
	            bw.write("\n" + nombre+" "+contraseña+" "+ rol);
	            bw.close();

	            JOptionPane.showMessageDialog(null,"Te has registrado exitosamente");
	            System.out.println("Te has registrado exitosamente");
	        }
	        catch(Exception E){
	            JOptionPane.showMessageDialog(null,"Oops! Parece que ha ocurrido un error con tu registro, vuelve a intentarlo");
	            System.out.println("Oops! Parece que ha ocurrido un error con tu registro, vuelve a intentarlo");

	        }
		new Usuario(nombre, contraseña, rol);
	}
	public static boolean iniciarSesion(String nombre, String contraseña) throws IOException {
		boolean login = false;
		 String record = null;
		    FileReader in = null;
		    boolean existe = false; // para comprobar si cuenta y pass no coindicen con ninguna línea 
		    in = new FileReader("C:\\Users\\samue\\Desktop\\Entrega 3\\Projecto-1\\Entrega 3\\Modelo\\Users\\db.txt");
		    BufferedReader br = new BufferedReader(in);

		    while ((record = br.readLine()) !=null) {
		          String [] word = record.split(" "); // dividir en palabras delimitadas por espacios
		          if (word[0].equals(nombre) && word[1].equals(contraseña)) {
		                System.out.println("Has iniciado sesión exitosamente como: " + word[2]);
		                existe = true;
		                login = true;
		            }
		        }

		        if (!existe) {
		            System.out.println("Usuario o contraseña incorrecto.");
		            login = false;
		        }
				return login;
		    
		}
	
}

