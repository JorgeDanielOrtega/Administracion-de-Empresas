
package view;

import java.awt.Color;

public class DatosEmpresa extends javax.swing.JFrame {

    int xPos, yPos;
    
    public DatosEmpresa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lbBarraSuperior = new javax.swing.JPanel();
        pnlExit = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1035, 460));
        setUndecorated(true);

        pnlBackground.setBackground(new java.awt.Color(246, 246, 246));
        pnlBackground.setMinimumSize(new java.awt.Dimension(1035, 460));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbBarraSuperior.setBackground(new java.awt.Color(221, 221, 221));
        lbBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbBarraSuperiorMouseDragged(evt);
            }
        });
        lbBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbBarraSuperiorMousePressed(evt);
            }
        });

        pnlExit.setBackground(new java.awt.Color(221, 221, 221));
        pnlExit.setPreferredSize(new java.awt.Dimension(30, 30));

        lbExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setText("X");
        lbExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlExitLayout = new javax.swing.GroupLayout(pnlExit);
        pnlExit.setLayout(pnlExitLayout);
        pnlExitLayout.setHorizontalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );
        pnlExitLayout.setVerticalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout lbBarraSuperiorLayout = new javax.swing.GroupLayout(lbBarraSuperior);
        lbBarraSuperior.setLayout(lbBarraSuperiorLayout);
        lbBarraSuperiorLayout.setHorizontalGroup(
            lbBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbBarraSuperiorLayout.createSequentialGroup()
                .addGap(0, 990, Short.MAX_VALUE)
                .addComponent(pnlExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        lbBarraSuperiorLayout.setVerticalGroup(
            lbBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbBarraSuperiorLayout.createSequentialGroup()
                .addComponent(pnlExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlBackground.add(lbBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseEntered
        pnlExit.setBackground(Color.red);
        lbExit.setForeground(Color.white);
    }//GEN-LAST:event_lbExitMouseEntered

    private void lbExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseExited
        pnlExit.setBackground(new Color(221,221,221));
        lbExit.setForeground(Color.black);
    }//GEN-LAST:event_lbExitMouseExited

    private void lbBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xPos, y - yPos);
    }//GEN-LAST:event_lbBarraSuperiorMouseDragged

    private void lbBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBarraSuperiorMousePressed
        xPos = evt.getX();
        yPos = evt.getY();
    }//GEN-LAST:event_lbBarraSuperiorMousePressed

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
            java.util.logging.Logger.getLogger(DatosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel lbBarraSuperior;
    private javax.swing.JLabel lbExit;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlExit;
    // End of variables declaration//GEN-END:variables
}
