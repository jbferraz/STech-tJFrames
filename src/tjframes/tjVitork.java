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
 * @author admin
 */
public class tjVitork extends javax.swing.JFrame {

    /**
     * Creates new form tjVitork
     */
    public tjVitork() {
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

        grpConverte = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        JbfIdade = new javax.swing.JTextField();
        jLabell = new javax.swing.JLabel();
        jtfCalcDias = new javax.swing.JButton();
        jbfResultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jrdbKm2m = new javax.swing.JRadioButton();
        jrdbM2km = new javax.swing.JRadioButton();
        jtfConverter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfHacker = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        JbfIdade.setBackground(new java.awt.Color(255, 255, 255));
        JbfIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JbfIdadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JbfIdadeKeyTyped(evt);
            }
        });

        jLabell.setForeground(new java.awt.Color(204, 204, 0));
        jLabell.setText("idade:");

        jtfCalcDias.setBackground(new java.awt.Color(153, 153, 153));
        jtfCalcDias.setForeground(new java.awt.Color(255, 0, 0));
        jtfCalcDias.setText("Calcular Dias");
        jtfCalcDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCalcDiasActionPerformed(evt);
            }
        });

        jbfResultado.setEditable(false);
        jbfResultado.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Resultado:");

        jLabel2.setForeground(new java.awt.Color(204, 153, 0));
        jLabel2.setText("Valor");

        jtfValor.setBackground(new java.awt.Color(255, 255, 255));

        grpConverte.add(jrdbKm2m);
        jrdbKm2m.setForeground(new java.awt.Color(255, 153, 0));
        jrdbKm2m.setText("de Km para Milhas");
        jrdbKm2m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdbKm2mActionPerformed(evt);
            }
        });

        grpConverte.add(jrdbM2km);
        jrdbM2km.setForeground(new java.awt.Color(255, 153, 0));
        jrdbM2km.setText("de Milhas para km");

        jtfConverter.setBackground(new java.awt.Color(153, 153, 153));
        jtfConverter.setForeground(new java.awt.Color(255, 0, 0));
        jtfConverter.setText("Converter");
        jtfConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfConverterActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Pictures\\tenor.gif")); // NOI18N
        jLabel3.setText("jLabel3");

        jtfHacker.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Pictures\\pc-hack.gif")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCalcDias)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabell, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JbfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jrdbKm2m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrdbM2km, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(jtfValor)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jtfHacker))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrdbKm2m)
                    .addComponent(jLabell))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrdbM2km)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCalcDias)
                    .addComponent(jtfConverter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfHacker, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  

    private void jtfCalcDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCalcDiasActionPerformed
        // TODO add your handling code here:
        //jbfResultado.setText(Integer.toString(idade*365));
        
        if(JbfIdade.getText().equals("")){
            jbfResultado.setForeground(Color.red);
            jbfResultado.setText("Não tem valor");
            JbfIdade.requestFocus();
        }else{
            int idade = Integer.parseInt(JbfIdade.getText());
            int dias = idade*365;
        
            if (dias >=0){
                jbfResultado.setForeground(Color.BLACK);
            } else{
                jbfResultado.setForeground(Color.red);
            }
            jbfResultado.setText(Integer.toString(dias));
            JbfIdade.setText("");
            jbfResultado.requestFocus();
         jbfResultado.requestFocus();
        
    
        //jbfResultado.setText(NumberFormat.getInstance().format(idade*365));
        JOptionPane.showMessageDialog(null,"Sua idade em dias e: "+(idade*365));
        }
        
    }//GEN-LAST:event_jtfCalcDiasActionPerformed
        
    private void JbfIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JbfIdadeKeyTyped
    String caracteres="0123456789";
    if(!caracteres.contains(evt.getKeyChar()+"")){
    evt.consume();
     JOptionPane.showMessageDialog(this,"Somente numeros");
            }// TODO add your handling code here:
    }//GEN-LAST:event_JbfIdadeKeyTyped


private void jtfSomTextoKeyTyped(java.awt.event.KeyEvent evt){
String caracteres="0123456789";
    if(!caracteres.contains(evt.getKeyChar()+"")){
    evt.consume();
  }
}
    private void JbfIdadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JbfIdadeKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           this.jtfCalcDias.doClick();
    }//GEN-LAST:event_JbfIdadeKeyPressed
    }
    private void jtfConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfConverterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfConverterActionPerformed

    private void jrdbKm2mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdbKm2mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdbKm2mActionPerformed

              private void jrbMilhasParaKMActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }  
    private void jbConverterActionPerformed(java.awt.event.ActionEvent evt){
     if(!jtfValor.getText().equals("")){
       double result=0;
       double valor = Double.parseDouble(jtfValor.getText());
     
      if(jrdbKm2m.isSelected()){
          result= valor/ 1.6;
          
      }else if (jrdbM2km.isSelected()){
         result = valor*1.6; 
      
      JOptionPane.showMessageDialog(this,"O resultado e: " +
              NumberFormat.getInstance().format(result),
              "Conversão",JOptionPane.INFORMATION_MESSAGE);
       {
   JOptionPane.showMessageDialog(this,"Valor nao pode ser vazio");
      jtfValor.setText("");
   jtfValor.requestFocus();
        }
        }
    }

    /**
     * @param args the command line arguments
     */}
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
            java.util.logging.Logger.getLogger(tjVitork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tjVitork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tjVitork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tjVitork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tjVitork().setVisible(true);
}   
        });

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JbfIdade;
    private javax.swing.ButtonGroup grpConverte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabell;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jbfResultado;
    private javax.swing.JRadioButton jrdbKm2m;
    private javax.swing.JRadioButton jrdbM2km;
    private javax.swing.JButton jtfCalcDias;
    private javax.swing.JButton jtfConverter;
    private javax.swing.JLabel jtfHacker;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}

