package trabalhoprog2.view;

import javax.swing.JOptionPane;
import trabalhoprog2.controladores.PassageiroController;
import trabalhoprog2.modelos.Passageiro;

public class FrameCadastroPassageiro extends javax.swing.JFrame {

    public FrameCadastroPassageiro() {
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
        jClasse = new javax.swing.JLabel();
        jPoltrona = new javax.swing.JLabel();
        jTextPoltrona = new javax.swing.JTextField();
        jBSalvar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jCBClasse = new javax.swing.JComboBox<>();

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

        jClasse.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jClasse.setText("Classe");

        jPoltrona.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPoltrona.setText("Poltrona");

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jCBClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Econômica", "Executiva", "Primeira Classe" }));
        jCBClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBClasseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextDestino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(jTextVoo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jPoltrona, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPoltrona, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(212, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSalvar)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jNome)
                .addGap(18, 18, 18)
                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jIdade)
                .addGap(18, 18, 18)
                .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCpf)
                .addGap(18, 18, 18)
                .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jVoo)
                .addGap(18, 18, 18)
                .addComponent(jTextVoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jClasse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jCBClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPoltrona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextPoltrona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBLimpar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        if(!dadosValidos()) {
            return;
        }
        
        try {
            Passageiro passageiro = new Passageiro();
            
            passageiro.setNome(jTextNome.getText());
            passageiro.setIdade(Integer.parseInt(jTextIdade.getText()));
            passageiro.setCpf(jTextCpf.getText());
            passageiro.setVoo(jTextVoo.getText());
            passageiro.setDestino(jTextDestino.getText());
            passageiro.setClasse((String) jCBClasse.getSelectedItem());
            passageiro.setPoltrona(Integer.parseInt(jTextPoltrona.getText()));
            
            PassageiroController ctc = new PassageiroController();
            ctc.salvar(passageiro);
            JOptionPane.showMessageDialog(rootPane, "Passageiro cadastrado com sucesso");
        
        } catch (RuntimeException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTextNome.setText("");
        jTextIdade.setText("");
        jTextCpf.setText("");
        jTextDestino.setText("");
        jCBClasse.setSelectedItem("Econômica");
        jTextPoltrona.setText("");
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jCBClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBClasseActionPerformed

    }//GEN-LAST:event_jCBClasseActionPerformed
       private boolean dadosValidos(){
           if (jTextNome.getText().equals("") ||
               jTextIdade.getText().equals("") ||
               jTextCpf.getText().equals("") ||
               jTextDestino.getText().equals("") ||
               jTextPoltrona.getText().equals("")){
               
               JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
               return false;
           }
           return true;
       }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCBClasse;
    private javax.swing.JLabel jClasse;
    private javax.swing.JLabel jCpf;
    private javax.swing.JLabel jDestino;
    private javax.swing.JLabel jIdade;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jPoltrona;
    private javax.swing.JTextField jTextCpf;
    private javax.swing.JTextField jTextDestino;
    private javax.swing.JTextField jTextIdade;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPoltrona;
    private javax.swing.JTextField jTextVoo;
    private javax.swing.JLabel jVoo;
    // End of variables declaration//GEN-END:variables
}
