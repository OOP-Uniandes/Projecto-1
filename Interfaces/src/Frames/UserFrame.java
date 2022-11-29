/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

/**
 *
 * @author miguelgomez
 */
public class UserFrame extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    public UserFrame() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLeft = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        crearEquipoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ConfigurarAlineacionPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        EstadisticasPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cerrarSesionPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PanelCenter = new javax.swing.JPanel();
        temporadaLabel = new javax.swing.JLabel();
        presupuestoLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PanelArqueros = new javax.swing.JPanel();
        PanelDefensores = new javax.swing.JPanel();
        PanelMediocampistas = new javax.swing.JPanel();
        PanelDelanteros = new javax.swing.JPanel();
        PanelAniadirArqueros = new javax.swing.JPanel();
        aniadirArquero = new javax.swing.JLabel();
        PanelAniadirDefensores = new javax.swing.JPanel();
        aniadirDefensor = new javax.swing.JLabel();
        PanelAniadirMediocampistas = new javax.swing.JPanel();
        aniadirMediocampista = new javax.swing.JLabel();
        PanelAniadirDelanteros = new javax.swing.JPanel();
        aniadirDelantero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1334, 806));

        PanelLeft.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Logo.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        crearEquipoPanel.setBackground(new java.awt.Color(204, 255, 255));
        crearEquipoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearEquipoPanelMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Crear equipo");

        javax.swing.GroupLayout crearEquipoPanelLayout = new javax.swing.GroupLayout(crearEquipoPanel);
        crearEquipoPanel.setLayout(crearEquipoPanelLayout);
        crearEquipoPanelLayout.setHorizontalGroup(
            crearEquipoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        crearEquipoPanelLayout.setVerticalGroup(
            crearEquipoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearEquipoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        ConfigurarAlineacionPanel.setBackground(new java.awt.Color(0, 102, 102));
        ConfigurarAlineacionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfigurarAlineacionPanelMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Configurar Alineacion");

        javax.swing.GroupLayout ConfigurarAlineacionPanelLayout = new javax.swing.GroupLayout(ConfigurarAlineacionPanel);
        ConfigurarAlineacionPanel.setLayout(ConfigurarAlineacionPanelLayout);
        ConfigurarAlineacionPanelLayout.setHorizontalGroup(
            ConfigurarAlineacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ConfigurarAlineacionPanelLayout.setVerticalGroup(
            ConfigurarAlineacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfigurarAlineacionPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        EstadisticasPanel.setBackground(new java.awt.Color(0, 102, 102));
        EstadisticasPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstadisticasPanelMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estadisticas");

        javax.swing.GroupLayout EstadisticasPanelLayout = new javax.swing.GroupLayout(EstadisticasPanel);
        EstadisticasPanel.setLayout(EstadisticasPanelLayout);
        EstadisticasPanelLayout.setHorizontalGroup(
            EstadisticasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EstadisticasPanelLayout.setVerticalGroup(
            EstadisticasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstadisticasPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        cerrarSesionPanel.setBackground(new java.awt.Color(0, 102, 102));
        cerrarSesionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionPanelMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poiret One", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cerrar Sesion");

        javax.swing.GroupLayout cerrarSesionPanelLayout = new javax.swing.GroupLayout(cerrarSesionPanel);
        cerrarSesionPanel.setLayout(cerrarSesionPanelLayout);
        cerrarSesionPanelLayout.setHorizontalGroup(
            cerrarSesionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cerrarSesionPanelLayout.setVerticalGroup(
            cerrarSesionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cerrarSesionPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelLeftLayout = new javax.swing.GroupLayout(PanelLeft);
        PanelLeft.setLayout(PanelLeftLayout);
        PanelLeftLayout.setHorizontalGroup(
            PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
            .addComponent(crearEquipoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ConfigurarAlineacionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EstadisticasPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cerrarSesionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelLeftLayout.setVerticalGroup(
            PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(crearEquipoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConfigurarAlineacionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EstadisticasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cerrarSesionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        getContentPane().add(PanelLeft, java.awt.BorderLayout.LINE_START);

        PanelCenter.setBackground(new java.awt.Color(255, 255, 255));

        temporadaLabel.setFont(new java.awt.Font("PingFang TC", 1, 24)); // NOI18N
        temporadaLabel.setForeground(new java.awt.Color(0, 102, 102));
        temporadaLabel.setText("Temporada Actual: 17/10/2022");

        presupuestoLabel.setFont(new java.awt.Font("PingFang TC", 1, 18)); // NOI18N
        presupuestoLabel.setForeground(new java.awt.Color(0, 102, 102));
        presupuestoLabel.setText("Presupuesto: 15000");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Mi equipo:");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel10.setText("Arqueros");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel11.setText("Mediocampistas");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel12.setText("Defensores");

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel13.setText("Delanteros");

        PanelArqueros.setBackground(new java.awt.Color(255, 255, 255));
        PanelArqueros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PanelDefensores.setBackground(new java.awt.Color(255, 255, 255));
        PanelDefensores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PanelMediocampistas.setBackground(new java.awt.Color(255, 255, 255));
        PanelMediocampistas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PanelDelanteros.setBackground(new java.awt.Color(255, 255, 255));
        PanelDelanteros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PanelAniadirArqueros.setBackground(new java.awt.Color(255, 255, 255));
        PanelAniadirArqueros.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 12, 1, new java.awt.Color(0, 102, 102)));

        aniadirArquero.setFont(new java.awt.Font("Helvetica Neue", 0, 120)); // NOI18N
        aniadirArquero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aniadirArquero.setText("+");
        aniadirArquero.setToolTipText("");
        aniadirArquero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aniadirArqueroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelAniadirArquerosLayout = new javax.swing.GroupLayout(PanelAniadirArqueros);
        PanelAniadirArqueros.setLayout(PanelAniadirArquerosLayout);
        PanelAniadirArquerosLayout.setHorizontalGroup(
            PanelAniadirArquerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aniadirArquero, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );
        PanelAniadirArquerosLayout.setVerticalGroup(
            PanelAniadirArquerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aniadirArquero, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        PanelAniadirDefensores.setBackground(new java.awt.Color(255, 255, 255));
        PanelAniadirDefensores.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 12, 1, new java.awt.Color(0, 102, 102)));

        aniadirDefensor.setFont(new java.awt.Font("Helvetica Neue", 0, 120)); // NOI18N
        aniadirDefensor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aniadirDefensor.setText("+");
        aniadirDefensor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aniadirDefensorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelAniadirDefensoresLayout = new javax.swing.GroupLayout(PanelAniadirDefensores);
        PanelAniadirDefensores.setLayout(PanelAniadirDefensoresLayout);
        PanelAniadirDefensoresLayout.setHorizontalGroup(
            PanelAniadirDefensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aniadirDefensor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );
        PanelAniadirDefensoresLayout.setVerticalGroup(
            PanelAniadirDefensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aniadirDefensor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, Short.MAX_VALUE)
        );

        PanelAniadirMediocampistas.setBackground(new java.awt.Color(255, 255, 255));
        PanelAniadirMediocampistas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 12, 1, new java.awt.Color(0, 102, 102)));

        aniadirMediocampista.setFont(new java.awt.Font("Helvetica Neue", 0, 120)); // NOI18N
        aniadirMediocampista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aniadirMediocampista.setText("+");
        aniadirMediocampista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aniadirMediocampistaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelAniadirMediocampistasLayout = new javax.swing.GroupLayout(PanelAniadirMediocampistas);
        PanelAniadirMediocampistas.setLayout(PanelAniadirMediocampistasLayout);
        PanelAniadirMediocampistasLayout.setHorizontalGroup(
            PanelAniadirMediocampistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aniadirMediocampista, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );
        PanelAniadirMediocampistasLayout.setVerticalGroup(
            PanelAniadirMediocampistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aniadirMediocampista, javax.swing.GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE)
        );

        PanelAniadirDelanteros.setBackground(new java.awt.Color(255, 255, 255));
        PanelAniadirDelanteros.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 12, 1, new java.awt.Color(0, 102, 102)));

        aniadirDelantero.setFont(new java.awt.Font("Helvetica Neue", 0, 120)); // NOI18N
        aniadirDelantero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aniadirDelantero.setText("+");
        aniadirDelantero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aniadirDelanteroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelAniadirDelanterosLayout = new javax.swing.GroupLayout(PanelAniadirDelanteros);
        PanelAniadirDelanteros.setLayout(PanelAniadirDelanterosLayout);
        PanelAniadirDelanterosLayout.setHorizontalGroup(
            PanelAniadirDelanterosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aniadirDelantero, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );
        PanelAniadirDelanterosLayout.setVerticalGroup(
            PanelAniadirDelanterosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aniadirDelantero, javax.swing.GroupLayout.PREFERRED_SIZE, 101, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelCenterLayout = new javax.swing.GroupLayout(PanelCenter);
        PanelCenter.setLayout(PanelCenterLayout);
        PanelCenterLayout.setHorizontalGroup(
            PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCenterLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCenterLayout.createSequentialGroup()
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCenterLayout.createSequentialGroup()
                                .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(presupuestoLabel)
                                    .addComponent(temporadaLabel))
                                .addGap(0, 551, Short.MAX_VALUE))
                            .addGroup(PanelCenterLayout.createSequentialGroup()
                                .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PanelDelanteros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PanelMediocampistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PanelDefensores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PanelArqueros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PanelAniadirArqueros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PanelAniadirDefensores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PanelAniadirMediocampistas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PanelAniadirDelanteros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, 54))
                    .addGroup(PanelCenterLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelCenterLayout.setVerticalGroup(
            PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCenterLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(temporadaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(presupuestoLabel)
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelAniadirArqueros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelArqueros, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelAniadirDefensores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDefensores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCenterLayout.createSequentialGroup()
                        .addComponent(PanelAniadirMediocampistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelCenterLayout.createSequentialGroup()
                        .addComponent(PanelMediocampistas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelAniadirDelanteros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDelanteros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(PanelCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aniadirArqueroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aniadirArqueroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aniadirArqueroMouseClicked

    private void aniadirDefensorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aniadirDefensorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aniadirDefensorMouseClicked

    private void aniadirMediocampistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aniadirMediocampistaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aniadirMediocampistaMouseClicked

    private void aniadirDelanteroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aniadirDelanteroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aniadirDelanteroMouseClicked

    private void crearEquipoPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearEquipoPanelMouseClicked
        System.out.println("OPRIMIDO!");
    }//GEN-LAST:event_crearEquipoPanelMouseClicked

    private void ConfigurarAlineacionPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfigurarAlineacionPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfigurarAlineacionPanelMouseClicked

    private void EstadisticasPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstadisticasPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadisticasPanelMouseClicked

    private void cerrarSesionPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionPanelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConfigurarAlineacionPanel;
    private javax.swing.JPanel EstadisticasPanel;
    private javax.swing.JPanel PanelAniadirArqueros;
    private javax.swing.JPanel PanelAniadirDefensores;
    private javax.swing.JPanel PanelAniadirDelanteros;
    private javax.swing.JPanel PanelAniadirMediocampistas;
    private javax.swing.JPanel PanelArqueros;
    private javax.swing.JPanel PanelCenter;
    private javax.swing.JPanel PanelDefensores;
    private javax.swing.JPanel PanelDelanteros;
    private javax.swing.JPanel PanelLeft;
    private javax.swing.JPanel PanelMediocampistas;
    private javax.swing.JLabel aniadirArquero;
    private javax.swing.JLabel aniadirDefensor;
    private javax.swing.JLabel aniadirDelantero;
    private javax.swing.JLabel aniadirMediocampista;
    private javax.swing.JPanel cerrarSesionPanel;
    private javax.swing.JPanel crearEquipoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel presupuestoLabel;
    private javax.swing.JLabel temporadaLabel;
    // End of variables declaration//GEN-END:variables
}
