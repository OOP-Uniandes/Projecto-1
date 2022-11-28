package src.Interfaces;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
public class CrearEquipo extends JFrame {

    public  CrearEquipo (){
        super("Fantasy League");

        this.setSize(1480, 920);

        this.setLayout(new BorderLayout(0, 0));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelTop = makePanelTop();
        JPanel panelLeft = makePanelLeft();
        JPanel panelCenter = makePanelCenter();
        
        this.add(panelTop, BorderLayout.CENTER);
        this.add(panelLeft, BorderLayout.WEST);
        this.add(panelCenter, BorderLayout.CENTER);

        this.setVisible(true);
}
    private JPanel makePanelLeft() {
        JPanel panelLeft = new JPanel();
        panelLeft.setBackground(Color.BLUE);
        panelLeft.setPreferredSize(new Dimension(200, 0));
        panelLeft.setLayout(new GridLayout(5, 1));

        JLabel imgNameLabel = new JLabel("Hola, Samuel | Estás en Crear Equipo");
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
        new ComprarJugadores();
});
    Estadisticas.addActionListener(e -> {
        this.dispose();
        new Estadisticas();
});
        return panelLeft;
    }

    private JPanel makePanelTop() {
        JPanel panelTop = new JPanel();

        return panelTop;
    }
    
    private JPanel makePanelCenter() {
        JPanel panelCenter = new JPanel();
        
        panelCenter.setBackground(new Color(255, 255, 255));
        panelCenter.setLayout(new GridLayout(10, 1));
        panelCenter.setBorder(new EmptyBorder(200, 200, 200, 200));
        panelCenter.setBackground(new Color(255, 255, 255));
        JLabel CrearEquipo = new JLabel("Crear Equipo");
        CrearEquipo.setForeground(new Color(0, 123, 255));
        CrearEquipo.setPreferredSize(new Dimension(250, 100));

        JLabel NombreDelEquipo = new JLabel("Nombre del equipo");
        NombreDelEquipo.setBounds(600, 300, 100, 60);
        
        JTextField NombreDelEquipoInput = new JTextField();
        NombreDelEquipoInput.setBounds(20, 40, 50, 60);
        
        JLabel TemporadaDelEquipo = new JLabel("Temporada del Equipo");
        TemporadaDelEquipo.setBounds(800, 500, 100, 60);

        String temporadas[]= { "Temporada Actual", "Temporada Anterior"};
        JList SeleccionarTemporadas;
        SeleccionarTemporadas = new JList<String>(temporadas);
        SeleccionarTemporadas.setBounds(900, 600, 100, 60);
        
        JButton CrearEquipoBoton = new JButton("Crear Equipo");
        CrearEquipoBoton.setBounds(1000, 700, 100, 60);
        


        
        panelCenter.add(CrearEquipo);
        panelCenter.add(NombreDelEquipo);
        panelCenter.add(NombreDelEquipoInput);
        panelCenter.add(TemporadaDelEquipo);
        panelCenter.add(SeleccionarTemporadas);
        panelCenter.add(CrearEquipoBoton);
        return panelCenter;
    }
    
    public static void main(String[] args) {
        new CrearEquipo();
    }
}




