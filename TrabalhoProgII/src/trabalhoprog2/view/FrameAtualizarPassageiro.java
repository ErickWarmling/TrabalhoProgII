package trabalhoprog2.view;

import javax.swing.JOptionPane;
import trabalhoprog2.controladores.PassageiroController;
import trabalhoprog2.modelos.Passageiro;

public class FrameAtualizarPassageiro extends javax.swing.JFrame {
    private Passageiro passageiro;
   
    public FrameAtualizarPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jIdade = new javax.swing.JLabel();
        jTextIdade = new javax.swing.JTextField();
        JCpf = new javax.swing.JLabel();
        jTextCpf = new javax.swing.JTextField();
        jVoo = new javax.swing.JLabel();
        jTextVoo = new javax.swing.JTextField();
        jDestino = new javax.swing.JLabel();
        jTextDestino = new javax.swing.JTextField();
        jClasse = new javax.swing.JLabel();
        jPoltrona = new javax.swing.JLabel();
        jTextPoltrona = new javax.swing.JTextField();
        jBAtualizar = new javax.swing.JButton();
        jCBClasse = new javax.swing.JComboBox<>();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jNome.setText("Nome");

        jIdade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jIdade.setText("Idade");

        JCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JCpf.setText("CPF");

        jVoo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jVoo.setText("Voo");

        jDestino.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jDestino.setText("Destino");

        jClasse.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jClasse.setText("Classe");

        jPoltrona.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPoltrona.setText("Poltrona");

        jBAtualizar.setText("Atualizar");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jCBClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Econômica", "Executiva", "Primeira Classe" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDestino)
                    .addComponent(jPoltrona, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPoltrona, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jCBClasse, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextDestino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAtualizar)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jNome)
                .addGap(12, 12, 12)
                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jVoo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextVoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jClasse)
                .addGap(18, 18, 18)
                .addComponent(jCBClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPoltrona)
                .addGap(12, 12, 12)
                .addComponent(jTextPoltrona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAtualizar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTextNome.setText(passageiro.getNome());
        jTextIdade.setText(String.valueOf(passageiro.getIdade()));
        jTextCpf.setText(passageiro.getCpf());
        jTextVoo.setText(passageiro.getVoo());
        jTextDestino.setText(passageiro.getDestino());
        jCBClasse.setSelectedItem(passageiro.getClasse());
        jTextPoltrona.setText(String.valueOf(passageiro.getPoltrona()));
    }//GEN-LAST:event_formWindowOpened

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        try {
            passageiro.setNome(jTextNome.getText());
            passageiro.setIdade(Integer.parseInt(jTextIdade.getText()));
            passageiro.setCpf(jTextCpf.getText());
            passageiro.setVoo(jTextVoo.getText());
            passageiro.setDestino(jTextDestino.getText());
            passageiro.setClasse((String) jCBClasse.getSelectedItem());
            passageiro.setPoltrona(Integer.parseInt(jTextPoltrona.getText()));
            
            PassageiroController ctc = new PassageiroController();
            ctc.update(passageiro);
            JOptionPane.showMessageDialog(rootPane, "Passageiro atualizado com sucesso");
            
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        new FrameConsultaPassageiro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBAtualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JCpf;
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JComboBox<String> jCBClasse;
    private javax.swing.JLabel jClasse;
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
