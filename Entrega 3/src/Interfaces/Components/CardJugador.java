package src.Interfaces.Components;

import java.util.ArrayList;

import javax.swing.JFrame;

import src.Interfaces.UserFrame;
import src.Modelo.Equipos.EquipoFantasia;
import src.Modelo.Jugadores.Jugador;
import src.Vista.App;

public class CardJugador extends javax.swing.JPanel {

    /**
     * Creates new form PanelVistaJugador
     */
    String nombreJugador;
    double precioJugadorDouble;


    public CardJugador(String nombreJugador, double precioJugadorDouble) {
        this.nombreJugador = nombreJugador;
        this.precioJugadorDouble = precioJugadorDouble;
        initComponents();
        NombreJugador.setText(nombreJugador);
        CostoJugador.setText(" " + precioJugadorDouble);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        NombreJugador = new javax.swing.JLabel();
        venderBtn = new javax.swing.JButton();
        CostoJugador = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        NombreJugador.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        NombreJugador.setText("Pedri");

        venderBtn.setText("Vender");
        venderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                venderBtnMouseClicked(evt);
            }
        });

        CostoJugador.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        CostoJugador.setText("Costo: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CostoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(venderBtn))
                                .addContainerGap(53, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(NombreJugador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CostoJugador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(venderBtn)
                                .addGap(12, 12, 12)));
    }// </editor-fold>

    private void venderBtnMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO: aniadir codigo para vender un jugador :)
        Jugador jugadorAVender = App.getJugadorPorNombre(this.nombreJugador);

        // sacar equipo usuario
        EquipoFantasia equipoUsuario = App.participanteActual.getEquipo();

        // Aniadir presupuesto a jugador
        double precioVenta = this.precioJugadorDouble * 0.97;
        double presupuestoActual = App.participanteActual.getEquipo().getPresupuesto();
        App.participanteActual.getEquipo().setPresupuesto(presupuestoActual + precioVenta);

        // Sacar jugador de equipo fantasia 
        ArrayList<Jugador> jugadoresEquipo = App.participanteActual.getEquipo().getJugadores();
        jugadoresEquipo.remove(jugadorAVender);
        App.participanteActual.getEquipo().setJugadores(jugadoresEquipo);
        
        // sacar de alineacion 
        ArrayList<Jugador> alineacion = App.participanteActual.getEquipo().getAlineacion();
        if(alineacion.contains(jugadorAVender)){
                alineacion.remove(jugadorAVender);
                App.participanteActual.getEquipo().setAlineacion(alineacion);
        }

        //actualizar numero de jugadores en esa posicion para el equipo de fantasia
        if (jugadorAVender.getPosicion().equals("arquero")) {
                
                        equipoUsuario.setCantArqueros(equipoUsuario.getCantArqueros() - 1);
                
        } else if (jugadorAVender.getPosicion().equals("defensa")) {
                
                        equipoUsuario.setCantDefensores(equipoUsuario.getCantDefensores() - 1);
                
        } else if (jugadorAVender.getPosicion().equals("mediocampista")) {
                
                        equipoUsuario.setCantMediocampistas(equipoUsuario.getCantMediocampistas() - 1);
                
        } else if (jugadorAVender.getPosicion().equals("delantero")) {
                
                        equipoUsuario.setCantDelanteros(equipoUsuario.getCantDelanteros() - 1);
                
        }

        // reiniciar el frame parent para ver los cambios relflejados
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();
        new UserFrame();
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel CostoJugador;
    private javax.swing.JLabel NombreJugador;
    private javax.swing.JButton venderBtn;
    // End of variables declaration
}
