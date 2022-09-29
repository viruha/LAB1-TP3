package view;

import tp3.Directorio;

public class FPrincipal extends javax.swing.JFrame {

    public static final Directorio guia = new Directorio();

    public FPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCliente = new javax.swing.JMenu();
        MenuClienteAgregar = new javax.swing.JMenuItem();
        MenuClienteBuscar = new javax.swing.JMenuItem();
        MenuClientesProCiudad = new javax.swing.JMenuItem();
        MenuBusquedaTelefonos = new javax.swing.JMenuItem();
        MenuClienteBorrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laboratorio 1 Trabajo Práctico 3");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jMenuBar1.setName(""); // NOI18N

        MenuCliente.setText("Clientes");

        MenuClienteAgregar.setText("Agregar");
        MenuClienteAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClienteAgregarActionPerformed(evt);
            }
        });
        MenuCliente.add(MenuClienteAgregar);

        MenuClienteBuscar.setText("Buscar");
        MenuClienteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClienteBuscarActionPerformed(evt);
            }
        });
        MenuCliente.add(MenuClienteBuscar);

        MenuClientesProCiudad.setText("Buscar Clientes por Ciudad");
        MenuClientesProCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClientesProCiudadActionPerformed(evt);
            }
        });
        MenuCliente.add(MenuClientesProCiudad);

        MenuBusquedaTelefonos.setText("Buscar Telefonos con mismo apellido");
        MenuBusquedaTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBusquedaTelefonosActionPerformed(evt);
            }
        });
        MenuCliente.add(MenuBusquedaTelefonos);

        MenuClienteBorrar.setText("Borrar");
        MenuClienteBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClienteBorrarActionPerformed(evt);
            }
        });
        MenuCliente.add(MenuClienteBorrar);

        jMenuBar1.add(MenuCliente);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleName("");
        jMenuBar1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuClienteAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClienteAgregarActionPerformed
        ClienteAlta frm_ClienteAlta = new ClienteAlta();
        frm_ClienteAlta.setVisible(true);
        desktopPane.add(frm_ClienteAlta);
        desktopPane.moveToFront(frm_ClienteAlta);

        // ca.setAlwaysOnTop(true);

    }//GEN-LAST:event_MenuClienteAgregarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void MenuClienteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClienteBuscarActionPerformed
        ClienteBusqueda frm_ClienteBusqueda = new ClienteBusqueda();
        frm_ClienteBusqueda.setVisible(true);
        desktopPane.add(frm_ClienteBusqueda);
        desktopPane.moveToFront(frm_ClienteBusqueda);
    }//GEN-LAST:event_MenuClienteBuscarActionPerformed

    private void MenuClienteBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClienteBorrarActionPerformed
        ClienteBorrar frm_ClienteBorrar = new ClienteBorrar();
        frm_ClienteBorrar.setVisible(true);
        desktopPane.add(frm_ClienteBorrar);
        desktopPane.moveToFront(frm_ClienteBorrar);
    }//GEN-LAST:event_MenuClienteBorrarActionPerformed

    private void MenuClientesProCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientesProCiudadActionPerformed
                ClientesBusqueda frm_ClientesBusqueda = new ClientesBusqueda();
        frm_ClientesBusqueda.setVisible(true);
        desktopPane.add(frm_ClientesBusqueda);
        desktopPane.moveToFront(frm_ClientesBusqueda);
    }//GEN-LAST:event_MenuClientesProCiudadActionPerformed

    private void MenuBusquedaTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBusquedaTelefonosActionPerformed
                 TelefonosBusqueda frm_TelefonosBusqueda = new TelefonosBusqueda();
        frm_TelefonosBusqueda.setVisible(true);
        desktopPane.add(frm_TelefonosBusqueda);
        desktopPane.moveToFront(frm_TelefonosBusqueda);
    }//GEN-LAST:event_MenuBusquedaTelefonosActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuBusquedaTelefonos;
    private javax.swing.JMenu MenuCliente;
    private javax.swing.JMenuItem MenuClienteAgregar;
    private javax.swing.JMenuItem MenuClienteBorrar;
    private javax.swing.JMenuItem MenuClienteBuscar;
    private javax.swing.JMenuItem MenuClientesProCiudad;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
