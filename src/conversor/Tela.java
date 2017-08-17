/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Francielly
 */
public class Tela extends javax.swing.JFrame {

    public int valorComboboxConversor;

    /**
     * Creates new form Tela
     */
    public Tela() {
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

        selecaoConversor = new javax.swing.JComboBox<>();
        conversor = new javax.swing.JToggleButton();
        entrada = new javax.swing.JTextField();
        saida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selecaoConversor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Binario para Decimal", "Binario para Hexadecimal", "Binario para Octal", "Decimal para Binario", "Decimal para Hexadecimal", "Decimal para Octal", "Hexadecimal para Binario", "Hexadecimal para Decimal", "Hexadecimal para Octal", "Octal para Binario", "Octal para Decimal", "Octal para Hexadecimal" }));
        selecaoConversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoConversorActionPerformed(evt);
            }
        });

        conversor.setText("Converter");
        conversor.setActionCommand("conversor");
        conversor.setName("conversor"); // NOI18N
        conversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selecaoConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(152, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saida, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entrada))
                        .addGap(18, 18, 18)
                        .addComponent(conversor)
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(selecaoConversor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conversor)
                    .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        conversor.getAccessibleContext().setAccessibleName("conversor");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecaoConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoConversorActionPerformed
        // TODO add your handling code here:
        valorComboboxConversor = selecaoConversor.getSelectedIndex();
        //System.out.println(valorComboboxConversor);
    }//GEN-LAST:event_selecaoConversorActionPerformed

    private void conversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversorActionPerformed
        // TODO add your handling code here:
        switch (valorComboboxConversor) {
            case 0:
                System.out.println(saida);
                saida.setText(String.valueOf(BinarioDecimal.converteBinarioParaDecimal(entrada.getText().trim())));
                
                break;
            case 1:
                saida.setText(String.valueOf(BinarioHexadecimal.converteBinarioParaHexadecimal(entrada.getText().trim())));
                break;
            case 2:
                saida.setText(String.valueOf(BinarioOctal.converteBinarioParaOctal(entrada.getText().trim())));
                break;
            case 3:
                saida.setText(String.valueOf(DecimalBinario.converteDecimalParaBinario(entrada.getText().trim())));
                break;
            case 4:
                saida.setText(String.valueOf(DecimalHexadecimal.converteDecimalParaHexadecimal(entrada.getText().trim())));
                break;
            case 5:
                saida.setText(String.valueOf(DecimalOctal.converteDecimalParaOctal(entrada.getText().trim())));
                break;
            case 6:
                saida.setText(String.valueOf(HexadecimalBinario.converteHexadecimalParaBinario(entrada.getText().trim())));
                break;
            case 7:
                saida.setText(String.valueOf(HexadecimalDecimal.converteHexadecimalParaDecimal(entrada.getText().trim())));
                break;
            case 8:
                saida.setText(String.valueOf(HexadecimalOctal.converteHexadecimalParaOctal(entrada.getText().trim())));
                break;
            case 9:
                saida.setText(String.valueOf(OctalBinario.converteOctalParaBinario(entrada.getText().trim())));
                break;
            case 10:
                saida.setText(String.valueOf(OctalDecimal.converteOctalParaDecimal(entrada.getText().trim())));
                break;
            case 11:
                saida.setText(String.valueOf(OctalHexadecimal.converteOctalParaHexadecimal(entrada.getText().trim())));
                break;
        }
    }//GEN-LAST:event_conversorActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton conversor;
    private javax.swing.JTextField entrada;
    private javax.swing.JTextField saida;
    private javax.swing.JComboBox<String> selecaoConversor;
    // End of variables declaration//GEN-END:variables
}
