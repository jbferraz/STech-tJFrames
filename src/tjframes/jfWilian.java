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
 * @author wilian
 */
public class jfWilian extends javax.swing.JFrame {

    /**
     * Creates new form jfWilian
     */
    public jfWilian() {
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

        rdbKm2m = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();
        jbCalcDias = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfResultado = new javax.swing.JTextField();
        jtfidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtSoTexto = new javax.swing.JTextField();
        jrdbKm2m = new javax.swing.JRadioButton();
        jrdbM2km = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        ResultadoValor = new javax.swing.JTextField();
        jbConverter = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(90, 93, 95));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Idade:");

        labelResultado.setBackground(new java.awt.Color(255, 255, 255));
        labelResultado.setForeground(new java.awt.Color(255, 255, 255));
        labelResultado.setText("  Resultado: ");

        jbCalcDias.setBackground(new java.awt.Color(90, 90, 90));
        jbCalcDias.setForeground(new java.awt.Color(255, 255, 255));
        jbCalcDias.setText("Calcular Dias");
        jbCalcDias.setName("jbCalcDias"); // NOI18N
        jbCalcDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcDiasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Calcule sua idade");

        jtfResultado.setEditable(false);
        jtfResultado.setBackground(new java.awt.Color(255, 255, 255));
        jtfResultado.setName("jtfIdade"); // NOI18N
        jtfResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfResultadoActionPerformed(evt);
            }
        });

        jtfidade.setBackground(new java.awt.Color(255, 255, 255));
        jtfidade.setName("jtfIdade"); // NOI18N
        jtfidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfidadeActionPerformed(evt);
            }
        });
        jtfidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfidadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfidadeKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Só Texto:");

        jtSoTexto.setBackground(new java.awt.Color(255, 255, 255));
        jtSoTexto.setForeground(new java.awt.Color(0, 0, 0));
        jtSoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSoTextoActionPerformed(evt);
            }
        });
        jtSoTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSoTextoKeyTyped(evt);
            }
        });

        rdbKm2m.add(jrdbKm2m);
        jrdbKm2m.setForeground(new java.awt.Color(255, 255, 255));
        jrdbKm2m.setSelected(true);
        jrdbKm2m.setText("de Km para Milhas");
        jrdbKm2m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdbKm2mActionPerformed(evt);
            }
        });

        rdbKm2m.add(jrdbM2km);
        jrdbM2km.setForeground(new java.awt.Color(255, 255, 255));
        jrdbM2km.setText("de Milhas para Km");
        jrdbM2km.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdbM2kmActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor:");

        ResultadoValor.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoValor.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoValorActionPerformed(evt);
            }
        });
        ResultadoValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ResultadoValorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ResultadoValorKeyTyped(evt);
            }
        });

        jbConverter.setBackground(new java.awt.Color(90, 90, 90));
        jbConverter.setForeground(new java.awt.Color(255, 255, 255));
        jbConverter.setText("Converter");
        jbConverter.setToolTipText("");
        jbConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConverterActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Km para Milhas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelResultado))
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbCalcDias, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addComponent(jtfidade)
                                .addComponent(jtSoTexto)))))
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jrdbKm2m)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(ResultadoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jrdbM2km)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jbConverter))))
                .addGap(0, 56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(ResultadoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelResultado)
                    .addComponent(jrdbKm2m))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtSoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jrdbM2km))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCalcDias)
                    .addComponent(jbConverter))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCalcDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcDiasActionPerformed
        // TODO add your handling code here:

        if (jtfidade.getText().equals("")) {
            jtfResultado.setForeground(Color.red);
            jtfResultado.setText("Idade em branco!");
            JOptionPane.showMessageDialog(rootPane, "Idade não pode estár em branco!");
            jtfResultado.setText("");

        } else {
            int idade = Integer.parseInt(jtfidade.getText());
            int dias = idade * 365;
            if (dias < 1) {
                jtfResultado.setForeground(Color.red);
                jtfResultado.setText("Idade inválida!");
                jtfResultado.setText("");
            } else {
                jtfResultado.setForeground(Color.BLACK);
                jtfResultado.setText(NumberFormat.getInstance().format(dias));
                jtfidade.setText("");
            }
            jtfResultado.requestFocus();
        }
        //jtfResultado.setText(NumberFormat.getInstance().format(idade*365));
        //JOptionPane.showMessageDialog(this,"Sua idade em dias :"+ (idade *365));
    }//GEN-LAST:event_jbCalcDiasActionPerformed

    private void jtfResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfResultadoActionPerformed

    private void jtfidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfidadeActionPerformed

    private void jtfidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfidadeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            this.jbCalcDias.doClick();
        }
    }//GEN-LAST:event_jtfidadeKeyPressed

    private void jtfidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfidadeKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();

        }
    }//GEN-LAST:event_jtfidadeKeyTyped

    private void jtSoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSoTextoActionPerformed

    private void jtSoTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSoTextoKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();

        }
    }//GEN-LAST:event_jtSoTextoKeyTyped

    private void ResultadoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoValorActionPerformed

    private void jrdbKm2mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdbKm2mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdbKm2mActionPerformed

    private void jbConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConverterActionPerformed
        // TODO add your handling code here:
        if (!ResultadoValor.getText().equals("")) {
            double result = 0;
            double valor = Double.parseDouble(ResultadoValor.getText());
            if (jrdbKm2m.isSelected()) {
                result = valor / 1.6;
                ResultadoValor.setText("");
            } else if (jrdbM2km.isSelected()) {
                result = valor * 1.6;
                ResultadoValor.setText("");
            }
            JOptionPane.showMessageDialog(rootPane, "O resultado é: " + NumberFormat.getInstance().format(result), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Valor não pode ser vazio!");
            ResultadoValor.requestFocus();

        }
    }//GEN-LAST:event_jbConverterActionPerformed

    private void ResultadoValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResultadoValorKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();

        }
    }//GEN-LAST:event_ResultadoValorKeyTyped

    private void jrdbM2kmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdbM2kmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdbM2kmActionPerformed

    private void ResultadoValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResultadoValorKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            this.jbConverter.doClick();
        }
    }//GEN-LAST:event_ResultadoValorKeyPressed

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
            java.util.logging.Logger.getLogger(jfWilian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfWilian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfWilian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfWilian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfWilian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ResultadoValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCalcDias;
    private javax.swing.JButton jbConverter;
    private javax.swing.JRadioButton jrdbKm2m;
    private javax.swing.JRadioButton jrdbM2km;
    private javax.swing.JTextField jtSoTexto;
    private javax.swing.JTextField jtfResultado;
    private javax.swing.JTextField jtfidade;
    private javax.swing.JLabel labelResultado;
    private javax.swing.ButtonGroup rdbKm2m;
    // End of variables declaration//GEN-END:variables
}
