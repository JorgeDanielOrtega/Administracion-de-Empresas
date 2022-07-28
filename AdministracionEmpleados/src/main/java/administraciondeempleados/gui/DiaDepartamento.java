package administraciondeempleados.gui;

import javax.swing.JOptionPane;
import administraciondeempleados.Departamento;
import java.util.List;

public class DiaDepartamento extends javax.swing.JDialog {

    private List<Departamento> departamentoList;
//    private DBConnect dbConnect;
//    private Connection connection;
//    private String sql;
//    private ResultSet result;
//    private PreparedStatement ps;
    
    public DiaDepartamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
//        dbConnect = new DBConnect();
    }

    public DiaDepartamento(java.awt.Frame parent, boolean modal, List<Departamento> departamentoList) {
        this(parent, modal);
        this.departamentoList = departamentoList;
        modelTableDescripcionDepartamentoo.setDepartamentoList(departamentoList);
        modelTableDescripcionDepartamentoo.cargarModelo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modelTableDescripcionDepartamentoo = new administraciondeempleados.gui.ModelTableDescripcionDepartamento();
        panDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNumeroEmpleados = new javax.swing.JTextField();
        txtNumeroMaximoEmpleados = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVacaciones = new javax.swing.JTextField();
        panOperaciones = new javax.swing.JPanel();
        btnAgregarDepartamento = new javax.swing.JButton();
        btnModificarDepartamento = new javax.swing.JButton();
        btnEliminarDepartamento = new javax.swing.JButton();
        panLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelTableDescripcionDepartamento = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("Nombre");

        jLabel3.setText("Numero");

        jLabel4.setText("Numero máximo empleados");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtNumeroEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroEmpleadosActionPerformed(evt);
            }
        });

        txtNumeroMaximoEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroMaximoEmpleadosActionPerformed(evt);
            }
        });

        jLabel5.setText("Vacaciones");

        txtVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVacacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panDatosLayout = new javax.swing.GroupLayout(panDatos);
        panDatos.setLayout(panDatosLayout);
        panDatosLayout.setHorizontalGroup(
            panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDatosLayout.createSequentialGroup()
                        .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panDatosLayout.createSequentialGroup()
                                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(108, 108, 108)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panDatosLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(108, 108, 108)))
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNumeroEmpleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(txtNumeroMaximoEmpleados, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVacaciones, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre))
                .addGap(75, 75, 75))
        );
        panDatosLayout.setVerticalGroup(
            panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDatosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDatosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNumeroEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDatosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNumeroMaximoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDatosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        panOperaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        btnAgregarDepartamento.setText("Agregar");
        btnAgregarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDepartamentoActionPerformed(evt);
            }
        });

        btnModificarDepartamento.setText("Modificar");
        btnModificarDepartamento.setEnabled(false);
        btnModificarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDepartamentoActionPerformed(evt);
            }
        });

        btnEliminarDepartamento.setText("Eliminar");
        btnEliminarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDepartamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panOperacionesLayout = new javax.swing.GroupLayout(panOperaciones);
        panOperaciones.setLayout(panOperacionesLayout);
        panOperacionesLayout.setHorizontalGroup(
            panOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOperacionesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnAgregarDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        panOperacionesLayout.setVerticalGroup(
            panOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOperacionesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panLista.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));

        modelTableDescripcionDepartamento.setModel(modelTableDescripcionDepartamentoo);
        modelTableDescripcionDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelTableDescripcionDepartamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(modelTableDescripcionDepartamento);

        javax.swing.GroupLayout panListaLayout = new javax.swing.GroupLayout(panLista);
        panLista.setLayout(panListaLayout);
        panListaLayout.setHorizontalGroup(
            panListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panListaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panListaLayout.setVerticalGroup(
            panListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificación Departamento");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(183, 183, 183))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(503, 503, 503)))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(panOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    private void eliminarDepartamento(long id){
//        try {
//            sql = "DELETE FROM \"Departamentos\"WHERE id = " + id +";";
//            ps = connection.prepareStatement(sql);     
//            ps.execute();
//        } catch (Exception e) {
//            System.out.println("Error al eliminar el id de departamento en DiaDepartamento " + e.getMessage());
//        }
//    }
//
//    private long retornarID (String tipo){
//        long id = 0;
//        try {
//            String query = "SELECT id FROM\"Departamentos\"WHERE tipo='" + tipo + "' GROUP BY id";
//            ps = connection.prepareStatement(query);
//            result = ps.executeQuery();
//            while(result.next()){
//                id = result.getLong("id");
//            }
//            System.out.println(id);
//            return id;
//        } catch (Exception e) {
//            System.out.println("No se pudo encontrar el id" + e.getMessage());
//        }
//        return 0;
//    }
//    private void eliminarDepartamentoDB(Departamento departamento){
//        try {
//            connection = dbConnect.conectar();
//            long id = retornarID(departamento.getNombre());
//            eliminarDepartamento(id);
//            sql = "DELETE FROM \"Departamentos\" WHERE id= " + id;
//            ps = connection.prepareStatement(sql);
//            ps.execute();
//        } catch (Exception e) {
//        }finally{
//            dbConnect.desconectar();
//        }
//    }
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNumeroEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroEmpleadosActionPerformed

    private void txtNumeroMaximoEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroMaximoEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroMaximoEmpleadosActionPerformed

    private void btnAgregarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDepartamentoActionPerformed
        Departamento departamentoMolde = new Departamento(txtNombre.getText(), Integer.parseInt(txtNumeroEmpleados.getText()),
                Integer.parseInt(txtNumeroMaximoEmpleados.getText()), Integer.parseInt(txtVacaciones.getText()));
        modelTableDescripcionDepartamentoo.agregarDepartamento(departamentoMolde);
    }//GEN-LAST:event_btnAgregarDepartamentoActionPerformed

    private void btnModificarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDepartamentoActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea modificar");
        Departamento departamentoMolde = new Departamento(txtNombre.getText(), Integer.parseInt(txtNumeroEmpleados.getText()),
                Integer.parseInt(txtNumeroMaximoEmpleados.getText()), Integer.parseInt(txtVacaciones.getText()));
        int fila = modelTableDescripcionDepartamento.getSelectedRow();
        modelTableDescripcionDepartamentoo.editarDepartamento(fila, departamentoMolde);

    }//GEN-LAST:event_btnModificarDepartamentoActionPerformed
    public Departamento obtenerDepartamento(){
        int fila;
        Departamento departamentoModel = new Departamento();
        if( modelTableDescripcionDepartamento.getSelectedRow() >= 0){
            fila = modelTableDescripcionDepartamento.getSelectedRow();
            departamentoModel = modelTableDescripcionDepartamentoo.leerDepartamento(fila);
        }
        return departamentoModel;
    }
    private void btnEliminarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDepartamentoActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar?");
        if (a == 0) {
            int fila = modelTableDescripcionDepartamento.getSelectedRow();
            modelTableDescripcionDepartamentoo.eliminarDepartamento(fila);
            //eliminarDepartamentoDB(departamento);
        }
    }//GEN-LAST:event_btnEliminarDepartamentoActionPerformed

    private void txtVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVacacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVacacionesActionPerformed

    private void modelTableDescripcionDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modelTableDescripcionDepartamentoMouseClicked
        btnModificarDepartamento.setEnabled(true);
    }//GEN-LAST:event_modelTableDescripcionDepartamentoMouseClicked

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
            java.util.logging.Logger.getLogger(DiaDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiaDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiaDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiaDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DiaDepartamento dialog = new DiaDepartamento(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDepartamento;
    private javax.swing.JButton btnEliminarDepartamento;
    private javax.swing.JButton btnModificarDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable modelTableDescripcionDepartamento;
    private administraciondeempleados.gui.ModelTableDescripcionDepartamento modelTableDescripcionDepartamentoo;
    private javax.swing.JPanel panDatos;
    private javax.swing.JPanel panLista;
    private javax.swing.JPanel panOperaciones;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroEmpleados;
    private javax.swing.JTextField txtNumeroMaximoEmpleados;
    private javax.swing.JTextField txtVacaciones;
    // End of variables declaration//GEN-END:variables
}
