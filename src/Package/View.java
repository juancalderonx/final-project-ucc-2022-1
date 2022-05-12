package Package;

import Package.Conexion;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View extends javax.swing.JFrame {

    static Icon iconoBien = new ImageIcon("src\\Images\\aprobed.png");

    public View() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgDer = new javax.swing.JPanel();
        lblDetails = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        lblQuantity = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        bgIzq = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        btnCargar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgDer.setBackground(new java.awt.Color(55, 73, 97));
        bgDer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDetails.setFont(new java.awt.Font("Roboto", 0, 49)); // NOI18N
        lblDetails.setForeground(new java.awt.Color(110, 223, 203));
        lblDetails.setText("Details");
        bgDer.add(lblDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 170, 80));

        txtQuantity.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        bgDer.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 310, 30));

        txtCode.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        bgDer.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 310, 30));

        txtName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        bgDer.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 310, 30));

        txtPrice.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        bgDer.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 310, 30));

        separador1.setForeground(new java.awt.Color(255, 255, 255));
        bgDer.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 300, 10));

        lblQuantity.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(242, 242, 242));
        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuantity.setText("Quantity");
        bgDer.add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        lblCode.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCode.setForeground(new java.awt.Color(242, 242, 242));
        lblCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCode.setText("Code");
        bgDer.add(lblCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblName.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(242, 242, 242));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");
        bgDer.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lblPrice.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(242, 242, 242));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setText("Price");
        bgDer.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        separador2.setForeground(new java.awt.Color(255, 255, 255));
        bgDer.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 300, 10));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(24, 30, 72));
        btnEliminar.setText("Delete product");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        bgDer.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 140, 40));

        btnInsertar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(24, 30, 72));
        btnInsertar.setText("Insert product");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        bgDer.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 140, 40));

        btnModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(24, 30, 72));
        btnModificar.setText("Update product");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        bgDer.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 140, 40));

        getContentPane().add(bgDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 0, 360, 682));

        bgIzq.setBackground(new java.awt.Color(110, 223, 203));

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

        btnCargar.setText("Load table");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblBuscar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(24, 30, 72));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("Search");
        lblBuscar.setPreferredSize(new java.awt.Dimension(87, 22));

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(24, 30, 72));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Inventory System");

        javax.swing.GroupLayout bgIzqLayout = new javax.swing.GroupLayout(bgIzq);
        bgIzq.setLayout(bgIzqLayout);
        bgIzqLayout.setHorizontalGroup(
            bgIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgIzqLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(bgIzqLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(bgIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgIzqLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(txtBuscar)
                        .addGap(86, 86, 86)
                        .addComponent(btnCargar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        bgIzqLayout.setVerticalGroup(
            bgIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgIzqLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(bgIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        getContentPane().add(bgIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed

        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaProducto.setModel(modeloTabla);

        String campo = txtBuscar.getText();
        String where = "";

        if (!"".equals(campo)) { //Si el campo no está vacío
            where = "WHERE code ='" + campo + "'";
        }

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            Conexion con = new Conexion();
            Connection conexion = con.connectDB();

            ps = conexion.prepareStatement("SELECT code, name, price, quantity FROM producto " + where);
            rs = ps.executeQuery();

            modeloTabla.addColumn("Code");
            modeloTabla.addColumn("Name");
            modeloTabla.addColumn("Price");
            modeloTabla.addColumn("Quantity");

            ResultSetMetaData rsm = rs.getMetaData();
            int cantidadColumnas = rsm.getColumnCount(); //Aquí estoy haciendo el conteo exacto de cuántas columnas tiene mi tabla productos.

            int anchos[] = {50, 150, 50, 70}; //Ancho de cada columna de la tabla.

            for (int i = 0; i < 4; i++) {
                tablaProducto.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object fila[] = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1); //El i+1 es porque si empezamos desde i me va tomar el id de la BD, yo quiero es desde el código.   
                }

                modeloTabla.addRow(fila); //Luego, cada tabla que encuentre la agrega

            }

        } catch (Exception e) {
            System.err.println("Error" + e);
        }

    }//GEN-LAST:event_btnCargarActionPerformed

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            Conexion con = new Conexion();
            Connection conexion = con.connectDB();

            int fila = tablaProducto.getSelectedRow();
            String code = (String) tablaProducto.getValueAt(fila, 0);
            /*
            Lo que hago aquí es que con la fila seleccionada, guardo el código de dicho elemento
            y en base a ese código hago la consulta de los datos.
            El cero representa la columna code, ya que es la primera.
             */

            ps = conexion.prepareStatement("SELECT code, name, price, quantity FROM producto WHERE code =?");
            ps.setString(1, code);

            rs = ps.executeQuery();

            while (rs.next()) {
                txtCode.setText(rs.getString("code"));
                txtName.setText(rs.getString("name"));
                txtPrice.setText(String.valueOf(rs.getString("price")));
                txtQuantity.setText(String.valueOf(rs.getInt("quantity")));
            }

        } catch (Exception e) {
            System.err.println("Error " + e);
        }


    }//GEN-LAST:event_tablaProductoMouseClicked

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

        PreparedStatement ps = null;

        try {

            Conexion con = new Conexion();
            Connection conexion = con.connectDB();

            ps = conexion.prepareStatement("INSERT INTO producto(code, name, price, quantity)"
                    + "VALUES(?,?,?,?)");

            ps.setString(1, txtCode.getText());
            ps.setString(2, txtName.getText());
            ps.setDouble(3, Double.parseDouble(txtPrice.getText()));
            ps.setInt(4, Integer.parseInt(txtQuantity.getText()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "¡Registro insertado correctamente!", "Insert product", JOptionPane.INFORMATION_MESSAGE, iconoBien);

        } catch (Exception e) {
            System.err.println("Error " + e);
        }


    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        PreparedStatement ps = null;

        try {

            Conexion con = new Conexion();
            Connection conexion = con.connectDB();

            ps = conexion.prepareStatement("UPDATE producto SET code=?, name=?, price=?, quantity=? WHERE code=?");

            ps.setString(1, txtCode.getText());
            ps.setString(2, txtName.getText());
            ps.setDouble(3, Double.parseDouble(txtPrice.getText()));
            ps.setInt(4, Integer.parseInt(txtQuantity.getText()));
            ps.setString(5, txtCode.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "¡Registro modificado correctamente!", "Update product", JOptionPane.INFORMATION_MESSAGE, iconoBien);

        } catch (Exception e) {
            System.err.println("Error " + e);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        PreparedStatement ps = null;

        try {

            Conexion con = new Conexion();
            Connection conexion = con.connectDB();

            ps = conexion.prepareStatement("DELETE FROM producto WHERE code=?");

            ps.setString(1, txtCode.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "¡Registro eliminado correctamente!", "Delete product", JOptionPane.INFORMATION_MESSAGE, iconoBien);

        } catch (Exception e) {
            System.err.println("Error " + e);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgDer;
    private javax.swing.JPanel bgIzq;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblDetails;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
