package Modelo.Usuarios;

public class Administrador extends Usuario {

    public Administrador(String nombre, String contraseña, String rol) {
        super(nombre, contraseña, rol);
        // TODO Auto-generated constructor stub
    }

    public void mostrarMenuAdministrador() {
        System.out.println("1. Crear temporada");
        System.out.println("2. Crear equipo");
        System.out.println("3. Crear jugador");
        System.out.println("4. Asignar partido a temporada");

    }

}
