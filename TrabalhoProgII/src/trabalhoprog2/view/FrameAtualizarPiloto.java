package trabalhoprog2.view;

import javax.swing.JOptionPane;
import trabalhoprog2.controladores.PilotoController;
import trabalhoprog2.modelos.Piloto;

public class FrameAtualizarPiloto extends javax.swing.JFrame {
    private Piloto piloto;
    
    public FrameAtualizarPiloto(Piloto piloto) {
        this.piloto = piloto;
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
        jLabel1 = new javax.swing.JLabel();
        jDestino = new javax.swing.JLabel();
        jTextDestino = new javax.swing.JTextField();
        jLicenca = new javax.swing.JLabel();
        jTextLicenca = new javax.swing.JTextField();
        jBAtualizar = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        jBAtualizar.setText("Atualizar");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
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
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextDestino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addComponent(jTextCpf, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLicenca, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLicenca, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAtualizar)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jIdade)
                .addGap(18, 18, 18)
                .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jCpf)
                .addGap(18, 18, 18)
                .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jVoo)
                .addGap(18, 18, 18)
                .addComponent(jTextVoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLicenca)
                .addGap(18, 18, 18)
                .addComponent(jTextLicenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAtualizar)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        try {
            piloto.setNome(jTextNome.getText());
            piloto.setIdade(Integer.parseInt(jTextIdade.getText()));
            piloto.setCpf(jTextCpf.getText());
            piloto.setVoo(jTextVoo.getText());
            piloto.setDestino(jTextDestino.getText());
            piloto.setLicenca(jTextLicenca.getText());
            
            PilotoController ctc = new PilotoController();
            ctc.update(piloto);
            JOptionPane.showMessageDialog(rootPane, "Piloto atualizado com sucesso");
            
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        new FrameConsultaPiloto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTextNome.setText(piloto.getNome());
        jTextIdade.setText(String.valueOf(piloto.getIdade()));
        jTextCpf.setText(piloto.getCpf());
        jTextVoo.setText(piloto.getVoo());
        jTextDestino.setText(piloto.getDestino());
        jTextLicenca.setText(piloto.getLicenca());
    }//GEN-LAST:event_formWindowOpened
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JLabel jCpf;
    private javax.swing.JLabel jDestino;
    private javax.swing.JLabel jIdade;
    private javax.swing.JLabel jLabel1;
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
