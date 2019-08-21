
package med_clase7;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Samuel
 */
public class PRINCIPAL7 extends javax.swing.JFrame {

    /**
     * Creates new form PRINCIPAL7
     */
    public PRINCIPAL7() {
        initComponents();
           
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        notas1 = new javax.swing.JLabel();
        Mostrar3 = new javax.swing.JButton();
        Mostrar1 = new javax.swing.JButton();
        tem1 = new javax.swing.JLabel();
        Mostrar2 = new javax.swing.JButton();
        temperatura1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        notas1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        notas1.setText(" Aqui apareseran los datos del vector");

        Mostrar3.setBackground(new java.awt.Color(255, 102, 204));
        Mostrar3.setText("Mostrar Matriz");
        Mostrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar3ActionPerformed(evt);
            }
        });

        Mostrar1.setBackground(new java.awt.Color(255, 102, 204));
        Mostrar1.setText("Mostrar Vector");
        Mostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar1ActionPerformed(evt);
            }
        });

        tem1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        tem1.setText(" Aqui apareseran los datos de la matriz");

        Mostrar2.setBackground(new java.awt.Color(255, 102, 204));
        Mostrar2.setText("Mostrar Uno");
        Mostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar2ActionPerformed(evt);
            }
        });

        temperatura1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        temperatura1.setText(" Aqui aparesera el dato de una posicion de  la matriz");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notas1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(temperatura1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tem1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(Mostrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(Mostrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(Mostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(notas1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(Mostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temperatura1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mostrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(tem1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mostrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Mostrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar3ActionPerformed
        // TODO add your handling code here:
        int[][] Temperatura = new int[2][3];
     
        Temperatura[0][0]=5;
        Temperatura[0][1]=10;
        Temperatura[0][2]=5;
        Temperatura[1][0]=10;
        Temperatura[1][1]=5;
        Temperatura[1][2]=10;
        
  tem1.setText("Las temperaturas en la matriz son = " +Temperatura[0][0]+","+Temperatura[0][1]
          +","+Temperatura[0][2]+","+Temperatura[1][0]+","+Temperatura[1][1]+","+Temperatura[0][2]);
    }//GEN-LAST:event_Mostrar3ActionPerformed

    private void Mostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar1ActionPerformed
        // TODO add your handling code here:
         float[] notas = new float[3];
     
        notas[0]=5;
        notas[1]=10;
        notas[2]=5;

       notas1.setText("Las notas = "+Float.toString(notas[0])+","+Float.toString(notas[1])
               +","+Float.toString(notas[2]));
    }//GEN-LAST:event_Mostrar1ActionPerformed

    private void Mostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar2ActionPerformed
        // TODO add your handling code here:
       int[][] Temperatura = new int[2][3];
       Temperatura[1][0]=10;
       temperatura1.setText("La temperatura [1][0] = "+Integer.toString(Temperatura[1][0]));
    }//GEN-LAST:event_Mostrar2ActionPerformed

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
            java.util.logging.Logger.getLogger(PRINCIPAL7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mostrar1;
    private javax.swing.JButton Mostrar2;
    private javax.swing.JButton Mostrar3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel notas1;
    private javax.swing.JLabel tem1;
    private javax.swing.JLabel temperatura1;
    // End of variables declaration//GEN-END:variables

  
}
