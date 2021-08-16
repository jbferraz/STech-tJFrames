/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tjframes;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class jfThiago extends javax.swing.JFrame {

    /**
     * Creates new form jfThiago
     */
    public jfThiago() {
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

        jlIdade = new javax.swing.JLabel();
        jbCalcDias = new javax.swing.JButton();
        jtfIdade = new javax.swing.JTextField();
        jlResultado = new javax.swing.JLabel();
        jtfResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("tela"); // NOI18N

        jlIdade.setText("Idade:");
        jlIdade.setName("jlIdade"); // NOI18N

        jbCalcDias.setText("Calcular dias ");
        jbCalcDias.setName("jbCalcDias"); // NOI18N
        jbCalcDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcDiasActionPerformed(evt);
            }
        });

        jtfIdade.setToolTipText("");
        jtfIdade.setName("jtfIdade"); // NOI18N
        jtfIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfIdadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIdadeKeyTyped(evt);
            }
        });

        jlResultado.setText("Resultado:");

        jtfResultado.setEditable(false);
        jtfResultado.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCalcDias)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlResultado)
                            .addComponent(jlIdade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jtfResultado))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCalcDias)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //private void bttnEnter

    private void jbCalcDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcDiasActionPerformed
        // TODO add your handling code here:
        String aux = jtfIdade.getText();

        switch (aux.length()) {
            case 0:
                JOptionPane.showMessageDialog(this, "Campo não pode ser em branco!");
                break;

            default:
                int dias = (Integer.parseInt(aux) * 365);
                if (dias > 0) {
                    jtfResultado.setForeground(Color.black);
                    jtfResultado.setText(Integer.toString(dias));
                    jtfIdade.requestFocus();
                    jtfIdade.setText(""); 
                } 
                
        }

    }//GEN-LAST:event_jbCalcDiasActionPerformed

    private void jtfIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdadeKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789-";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();

        }
    }//GEN-LAST:event_jtfIdadeKeyTyped

    private void jtfIdadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdadeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.jbCalcDias.doClick();
        }
    }//GEN-LAST:event_jtfIdadeKeyPressed

        
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
            java.util.logging.Logger.getLogger(jfThiago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfThiago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfThiago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfThiago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                jfThiago tela = new jfThiago();
                tela.setTitle("Calculadora de dias");
                tela.setBounds(500, 320, 320, 210);
                tela.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCalcDias;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlResultado;
    private javax.swing.JTextField jtfIdade;
    private javax.swing.JTextField jtfResultado;
    // End of variables declaration//GEN-END:variables
}
