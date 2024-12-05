/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ailensalazar.laberintoproyecto.vista;

import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class GUIInstrucciones extends javax.swing.JFrame {

    /**
     * Creates new form GUIInstrucciones
     */
    public GUIInstrucciones() {
        initComponents();
        
    }

    public void escuchar(ActionListener controlador){
    
        btnSalir.addActionListener(controlador);
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonsalir.png"))); // NOI18N
        btnSalir.setActionCommand("salirInstrucciones");
        btnSalir.setContentAreaFilled(false);
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instrucciones.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
