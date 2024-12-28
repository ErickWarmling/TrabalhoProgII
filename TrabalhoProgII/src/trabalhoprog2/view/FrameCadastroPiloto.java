package trabalhoprog2.view;

import javax.swing.JOptionPane;
import trabalhoprog2.controladores.PilotoController;
import trabalhoprog2.modelos.Piloto;

public class FrameCadastroPiloto extends javax.swing.JFrame {

    public FrameCadastroPiloto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jIdade = new javax.swing.JLabel();
        jTextIdade = new javax.swing.JTextField();
        jCpf = new javax.swing.JLabel();
        jTextCpf = new javax.swing.JTextField();
        jVoo = new javax.swing.JLabel();
        jTextVoo = new javax.swing.JTextField();
        jDestino = new javax.swing.JLabel();
        jTextDestino = new javax.swing.JTextField();
        jLicenca = new javax.swing.JLabel();
        jTextLicenca = new javax.swing.JTextField();
        jBSalvarPiloto = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();

        jNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jNome.setText("Nome");

        jIdade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jIdade.setText("Idade");

        jCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCpf.setText("CPF");

        jVoo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jVoo.setText("Voo");

        jDestino.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jDestino.setText("Destino");

        jLicenca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLicenca.setText("Licença");

        jBSalvarPiloto.setText("Salvar");
        jBSalvarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarPilotoActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBLimpar)
                .addGap(18, 18, 18)
                .addComponent(jBSalvarPiloto)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextDestino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(jTextCpf, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLicenca, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLicenca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jNome)
                .addGap(18, 18, 18)
                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jVoo)
                .addGap(18, 18, 18)
                .addComponent(jTextVoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLicenca)
                .addGap(18, 18, 18)
                .addComponent(jTextLicenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvarPiloto)
                    .addComponent(jBLimpar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarPilotoActionPerformed
        if(!dadosValidos()) {
            return;
        }
        
        try {
            
            Piloto piloto = new Piloto();
            
            piloto.setNome(jTextNome.getText());
            piloto.setIdade(Integer.parseInt(jTextIdade.getText()));
            piloto.setCpf(jTextCpf.getText());
            piloto.setVoo(jTextVoo.getText());
            piloto.setDestino(jTextDestino.getText());
            piloto.setLicenca(jTextLicenca.getText());
            
            PilotoController ctc = new PilotoController();
            ctc.salvar(piloto);
            JOptionPane.showMessageDialog(rootPane, "Piloto cadastrado com sucesso");
            
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jBSalvarPilotoActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTextNome.setText("");
        jTextIdade.setText("");
        jTextCpf.setText("");
        jTextVoo.setText("");
        jTextDestino.setText("");
        jTextLicenca.setText("");
    }//GEN-LAST:event_jBLimparActionPerformed

    private boolean dadosValidos() {
        if(jTextNome.getText().equals("") ||
           jTextIdade.getText().equals("") ||
           jTextCpf.getText().equals("") ||
           jTextVoo.getText().equals("") ||
           jTextDestino.getText().equals("") ||
           jTextLicenca.getText().equals("")) {
             
           JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
           return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvarPiloto;
    private javax.swing.JLabel jCpf;
    private javax.swing.JLabel jDestino;
    private javax.swing.JLabel jIdade;
    private javax.swing.JLabel jLicenca;
    private javax.swing.JLabel jNome;
    private javax.swing.JTextField jTextCpf;
    private javax.swing.JTextField jTextDestino;
    private javax.swing.JTextField jTextIdade;
    private javax.swing.JTextField jTextLicenca;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextVoo;
    private javax.swing.JLabel jVoo;
    // End of variables declaration//GEN-END:variables
}
