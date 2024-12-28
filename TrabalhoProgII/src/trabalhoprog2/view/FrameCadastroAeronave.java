package trabalhoprog2.view;

import javax.swing.JOptionPane;
import trabalhoprog2.controladores.AeronaveController;
import trabalhoprog2.modelos.Aeronave;

public class FrameCadastroAeronave extends javax.swing.JFrame {

    public FrameCadastroAeronave() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCompanhia = new javax.swing.JLabel();
        jTextCompanhia = new javax.swing.JTextField();
        jCapacidade = new javax.swing.JLabel();
        jTextCapacidade = new javax.swing.JTextField();
        jModelo = new javax.swing.JLabel();
        jTextModelo = new javax.swing.JTextField();
        jTextCodigo = new javax.swing.JTextField();
        jCodigo = new javax.swing.JLabel();
        jBSalvarAeronave = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();

        jCompanhia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCompanhia.setText("Companhia");

        jCapacidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCapacidade.setText("Capacidade");

        jModelo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jModelo.setText("Modelo");

        jCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCodigo.setText("Código");

        jBSalvarAeronave.setText("Salvar");
        jBSalvarAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarAeronaveActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(jTextModelo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextCapacidade, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(179, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalvarAeronave)
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jCompanhia)
                .addGap(18, 18, 18)
                .addComponent(jTextCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCapacidade)
                .addGap(18, 18, 18)
                .addComponent(jTextCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvarAeronave)
                    .addComponent(jBLimpar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarAeronaveActionPerformed
        if (!dadosValidos()){
            return;
        }
        
        try {
            Aeronave aeronave = new Aeronave();
            
            aeronave.setCompanhia(jTextCompanhia.getText());
            aeronave.setCapacidade(Integer.parseInt(jTextCapacidade.getText()));
            aeronave.setModelo(jTextModelo.getText());
            aeronave.setCodigo(Integer.parseInt(jTextCodigo.getText()));
            
            
            AeronaveController ctc = new AeronaveController();
            ctc.salvar(aeronave);
            JOptionPane.showMessageDialog(rootPane, "Aeronave cadastrada com sucesso");
       
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jBSalvarAeronaveActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTextCompanhia.setText("");
        jTextCapacidade.setText("");
        jTextModelo.setText("");
        jTextCodigo.setText("");
    }//GEN-LAST:event_jBLimparActionPerformed
    private boolean dadosValidos(){
    if (jTextCompanhia.getText().equals("") || 
        jTextCapacidade.getText().equals("") || 
        jTextModelo.getText().equals("") || 
        jTextCodigo.getText().equals("")){
        
        JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
        return false;
    }
    return true;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvarAeronave;
    private javax.swing.JLabel jCapacidade;
    private javax.swing.JLabel jCodigo;
    private javax.swing.JLabel jCompanhia;
    private javax.swing.JLabel jModelo;
    private javax.swing.JTextField jTextCapacidade;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextCompanhia;
    private javax.swing.JTextField jTextModelo;
    // End of variables declaration//GEN-END:variables
}
