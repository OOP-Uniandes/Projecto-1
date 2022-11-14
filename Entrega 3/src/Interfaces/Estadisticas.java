package src.Interfaces;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import src.Modelo.Usuarios.Administrador;
import src.Modelo.Usuarios.Participante;
import src.Modelo.Usuarios.Usuario;
import src.Vista.App;

import java.awt.*;
import java.io.IOException;

public class Estadisticas extends JFrame {

    public Estadisticas() {

        super("Fantasy League");

        this.setSize(1480, 920);

        this.setLayout(new BorderLayout(0, 0));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelTop = makePanelTop("17/10/2022", "15000");
        JPanel panelLeft = makePanelLeft();
        
        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelLeft, BorderLayout.WEST);
        

        this.setVisible(true);

    }

    private JPanel makePanelLeft() {
        JPanel panelLeft = new JPanel();
        panelLeft.setBackground(Color.BLUE);
        panelLeft.setPreferredSize(new Dimension(200, 0));
        panelLeft.setLayout(new GridLayout(5, 1));

        JLabel imgNameLabel = new JLabel("Hola, Samuel");
        // Menú
        JButton CrearEquipo = new JButton("Crear Equipo");
        JButton configurarAlineacion = new JButton("Configurar Alineación");
        JButton comprarJugador = new JButton("Comprar Jugador");
        JButton Estadisticas = new JButton("Estadisticas");
        
        ImageIcon img = new ImageIcon("Assets/Logo.png");
        Image image = img.getImage();
        Image newimg = image.getScaledInstance(200, 130, java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(newimg);
        imgNameLabel.setIcon(img);
        imgNameLabel.setForeground(Color.white);
        imgNameLabel.setHorizontalTextPosition(JLabel.CENTER);
        imgNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
        
        panelLeft.add(imgNameLabel);
        panelLeft.add(CrearEquipo);
        panelLeft.add(configurarAlineacion);
        panelLeft.add(comprarJugador);
        panelLeft.add(Estadisticas);
        
        
        
        CrearEquipo.addActionListener(e -> {
                this.dispose();
                new CrearEquipo();
        });
        
        configurarAlineacion.addActionListener(e -> {
            this.dispose();
            new ConfigurarAlineacion();
    });
        comprarJugador.addActionListener(e -> {
            this.dispose();
            new comprarJugador();
    });
        Estadisticas.addActionListener(e -> {
            this.dispose();
            new Estadisticas();
    });

        return panelLeft;
    }

    private JPanel makePanelTop(String temporadaFechas, String presupuesto) {
        JPanel panelTop = new JPanel();

        panelTop.setBackground(new Color(255, 255, 255));
        panelTop.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        JLabel temporadaActualLBL = new JLabel("   Estadisticas ");
        JLabel temporadaFechasLBL = new JLabel(temporadaFechas);

        JLabel tuPresupuestoLBL = new JLabel("Tu presupuesto: ");
        JLabel presupuestoLBL = new JLabel(presupuesto);
        
        JLabel AnuncioCrearEquipo = new JLabel("¡Aún no puedes jugar! para empezar a concursar, necesitas crear un equipo");
        JButton BotonAnuncioCrearEquipo = new JButton("Crear Equipo");
        temporadaActualLBL.setFont(new Font("Arial", Font.BOLD, 30));
        temporadaActualLBL.setForeground(new Color(0, 123, 255));

        temporadaFechasLBL.setFont(new Font("Arial", Font.BOLD, 16));
        temporadaFechasLBL.setBackground(new Color(0, 123, 255));
        temporadaFechasLBL.setForeground(Color.white);
        temporadaFechasLBL.setOpaque(true);

        tuPresupuestoLBL.setFont(new Font("Arial", Font.BOLD, 16));

        presupuestoLBL.setFont(new Font("Arial", Font.PLAIN, 16));
        presupuestoLBL.setBackground(new Color(0, 123, 255));
        presupuestoLBL.setForeground(Color.white);
        presupuestoLBL.setOpaque(true);

        JPanel spacer = new JPanel();
        spacer.setBackground(Color.white);
        spacer.setPreferredSize(new Dimension(650, 50));
        JPanel spacer2 = new JPanel();
        spacer2.setBackground(Color.blue);
        spacer2.setPreferredSize(new Dimension(200, 50));
        
        
        panelTop.add(spacer2);
        panelTop.add(temporadaActualLBL);
        panelTop.add(temporadaFechasLBL);
        panelTop.add(spacer);
        panelTop.add(tuPresupuestoLBL);
        panelTop.add(presupuestoLBL);
        panelTop.add(AnuncioCrearEquipo);
        panelTop.add(BotonAnuncioCrearEquipo);
        return panelTop;
    }
    
    
    

    public static void main(String[] args) {
        new Estadisticas();
    }

}