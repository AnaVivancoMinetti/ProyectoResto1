package resto.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class menu extends javax.swing.JFrame {
    //private javax.swing.JDesktopPane Escritorio;
    private ImageIcon icono;
    private Image miImagen;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public menu() {
        initComponents();
        initComponentss();
        this.setLocationRelativeTo(null);
        this.setSize(WIDTH, HEIGHT);

        // Inicializar icono y miImagen aquí
//        icono = new ImageIcon(getClass().getResource("/resto/img/mozos.png"));
//        miImagen = icono.getImage();


//ImageIcon icon = new ImageIcon("/resto/img/camarero.jpg.jpg");
//Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
//icon = new ImageIcon(image);
//JLabel label = new JLabel(icon);

    }

    private void initComponentss() {
        Escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        ImageIcon icono= new ImageIcon(getClass().getResource("/resto/img/mozos.png"));

        Image miImagen=icono.getImage();
        Escritorio = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);

            }   };
            jLabel1 = new javax.swing.JLabel();
            jRadioButton1 = new javax.swing.JRadioButton();
            jRadioButton2 = new javax.swing.JRadioButton();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();

            jMenu3.setText("jMenu3");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
            Escritorio.setLayout(EscritorioLayout);
            EscritorioLayout.setHorizontalGroup(
                EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 589, Short.MAX_VALUE)
            );
            EscritorioLayout.setVerticalGroup(
                EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 536, Short.MAX_VALUE)
            );

            jLabel1.setBackground(new java.awt.Color(255, 204, 204));
            jLabel1.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(102, 0, 0));
            jLabel1.setText("     Cargá tus pedidos");

            jRadioButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
            jRadioButton1.setForeground(new java.awt.Color(51, 0, 0));
            jRadioButton1.setText("Ya me encuentro registrado ");
            jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButton1ActionPerformed(evt);
                }
            });

            jRadioButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
            jRadioButton2.setForeground(new java.awt.Color(51, 0, 0));
            jRadioButton2.setText("Me tengo que registrar");
            jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButton2ActionPerformed(evt);
                }
            });

            jLabel3.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(102, 0, 0));
            jLabel3.setText("      más rápido!!!");

            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/img/notas_1.png"))); // NOI18N

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButton1)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(Escritorio)
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2)
                    .addGap(66, 66, 66)
                    .addComponent(jRadioButton1)
                    .addGap(126, 126, 126))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}




