/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tjframes;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor
 */
public class jfIgor extends javax.swing.JFrame {

    /**
     * Creates new form jfIgor
     */
    public jfIgor() {
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

        jPanel1 = new javax.swing.JPanel();
        jtfIdade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbCalcDias = new javax.swing.JButton();
        jtfResultado = new javax.swing.JTextField();
        jlResultado = new javax.swing.JLabel();
        jtfSomTexto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jrdbKm2m = new javax.swing.JRadioButton();
        jrdbM2Km = new javax.swing.JRadioButton();
        jbConverter = new javax.swing.JButton();
        jcbEstCivil = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jbEstCivil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtfIdade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfIdade.setName("jtfIdade"); // NOI18N
        jtfIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfIdadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIdadeKeyTyped(evt);
            }
        });

        jLabel1.setText("Idade:");
        jLabel1.setName(""); // NOI18N

        jbCalcDias.setText("Calcular Dias");
        jbCalcDias.setName("jbCalcDias"); // NOI18N
        jbCalcDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcDiasActionPerformed(evt);
            }
        });

        jtfResultado.setEditable(false);
        jtfResultado.setName("jtfResultado"); // NOI18N

        jlResultado.setText("Resultado:");

        jtfSomTexto.setName("jtfSomTexto"); // NOI18N
        jtfSomTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfSomTextoKeyTyped(evt);
            }
        });

        jLabel3.setText("Somente Texto");

        jtfValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfValorKeyTyped(evt);
            }
        });

        jLabel2.setText("Valor");

        jrdbKm2m.setSelected(true);
        jrdbKm2m.setText("de Km para Milhas");

        jrdbM2Km.setText("de Milhas para Km");

        jbConverter.setText("Converter");
        jbConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConverterActionPerformed(evt);
            }
        });

        jcbEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Solteiro (a)", "Casado (a)", "Divorciado (a)", "Viuvo (a)" }));

        jLabel4.setText("Estado Civil");

        jbEstCivil.setText("Estado Civil?");
        jbEstCivil.setName("jbCalcDias"); // NOI18N
        jbEstCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstCivilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEstCivil))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbCalcDias)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfSomTexto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jtfResultado, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfIdade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcbEstCivil, 0, 137, Short.MAX_VALUE))))))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfValor))
                    .addComponent(jrdbKm2m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrdbM2Km, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbConverter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlResultado)
                    .addComponent(jrdbKm2m))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSomTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jrdbM2Km))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCalcDias)
                    .addComponent(jbConverter))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jbEstCivil)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdadeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.jbCalcDias.doClick();
        }
    }//GEN-LAST:event_jtfIdadeKeyPressed

    private void jtfIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdadeKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Somente números!");
        }
    }//GEN-LAST:event_jtfIdadeKeyTyped

    private void jbCalcDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcDiasActionPerformed
        // TODO add your handling code here:
        if (jtfIdade.getText().equals("")) {
            jtfResultado.setForeground(Color.red);
            jtfResultado.setText("Idade vazia");
        } else {
            int idade = Integer.parseInt(jtfIdade.getText());
            int dias = idade * 365;

            jtfResultado.setForeground(Color.BLACK);
            jtfResultado.setText(Integer.toString(dias));
            jtfIdade.setText("");
        }
        jtfIdade.requestFocus();
    }//GEN-LAST:event_jbCalcDiasActionPerformed

    private void jtfSomTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSomTextoKeyTyped
        // Somonte Texto
        String caracteres = "0123456789";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfSomTextoKeyTyped

    private void jtfValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfValorKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfValorKeyTyped

    private void jbConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConverterActionPerformed
        // TODO add your handling code here:
        if (!jtfValor.getText().equals("")) {
            double result = 0;
            double valor = Double.parseDouble(jtfValor.getText());

            if (jrdbKm2m.isSelected()) {
                result = valor / 1.6;
            } else if (jrdbM2Km.isSelected()) {
                result = valor * 1.6;
            }
            JOptionPane.showMessageDialog(this, "O resulado é: " +
                NumberFormat.getInstance().format(result),
                "Conversão", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Valor não pode ser vazio");
            jtfValor.requestFocus();
        }
    }//GEN-LAST:event_jbConverterActionPerformed

    private void jbEstCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstCivilActionPerformed
        // TODO add your handling code here:
        if (jcbEstCivil.getSelectedItem().equals("Selecione")) {
        JOptionPane.showMessageDialog(this, "Selecione um estado civil !!!");
     }else{
        JOptionPane.showMessageDialog(this, "Seu estado civil é " +
                jcbEstCivil.getSelectedItem().toString());
     }
    }//GEN-LAST:event_jbEstCivilActionPerformed

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
            java.util.logging.Logger.getLogger(jfIgor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfIgor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfIgor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfIgor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfIgor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCalcDias;
    private javax.swing.JButton jbConverter;
    private javax.swing.JButton jbEstCivil;
    private javax.swing.JComboBox<String> jcbEstCivil;
    private javax.swing.JLabel jlResultado;
    private javax.swing.JRadioButton jrdbKm2m;
    private javax.swing.JRadioButton jrdbM2Km;
    private javax.swing.JTextField jtfIdade;
    private javax.swing.JTextField jtfResultado;
    private javax.swing.JTextField jtfSomTexto;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
