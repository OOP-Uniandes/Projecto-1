package src.Interfaces;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Login extends JFrame{

    static JLabel et;
    static JLabel correo_electronico, contraseña, logo;
    static JTextField correo_electronico_input, contraseña_input;
    static JButton iniciar_sesion, registrarse;
    Login() {
        
        setLayout(null);
        setTitle("Fantasy League | Iniciar Sesión");
        setBounds(1480, 920, 1480, 920);
    }
    
    public static void main(String[] args) throws IOException {
        
        Login marco = new Login();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        BufferedImage Logo = ImageIO.read(new File("C:\\Users\\s.santaa\\Desktop\\Projecto1\\Projecto-1\\Entrega 3\\src\\Assets\\Logo.png"));
        logo = new JLabel(new ImageIcon(Logo));
        logo.setBounds(200, 250, 347, 321);

        correo_electronico = new JLabel("Correo Electrónico");
        correo_electronico.setBounds(700,200,200,60);
        
        correo_electronico_input = new JTextField();
        correo_electronico_input.setBounds(700,250,480,60);      
        
        contraseña = new JLabel("Contraseña");
        contraseña.setBounds(700,300,200,60);
        
        contraseña_input = new JTextField();
        contraseña_input.setBounds(700,350,480,60);
        
        iniciar_sesion = new JButton("Iniciar Sesión");
        iniciar_sesion.setBounds(700,450,480,60);
        iniciar_sesion.setBackground(new Color(0, 123, 255));
        
        registrarse = new JButton("Regístrate Gratis");
        registrarse.setBounds(700,550,480,60); 
        
        marco.add(logo);
        marco.add(correo_electronico);
        marco.add(correo_electronico_input);
        marco.add(contraseña);
        marco.add(contraseña_input);
        marco.add(iniciar_sesion);
        marco.add(registrarse);
    }

    }
}
