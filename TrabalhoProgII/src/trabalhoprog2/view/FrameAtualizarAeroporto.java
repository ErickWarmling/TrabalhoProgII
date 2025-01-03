/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalhoprog2.view;

import javax.swing.JOptionPane;
import trabalhoprog2.controladores.AeroportoController;
import trabalhoprog2.modelos.Aeroporto;

/**
 *
 * @author warml
 */
public class FrameAtualizarAeroporto extends javax.swing.JFrame {
    private Aeroporto aeroporto;
    /**
     * Creates new form FrameAtualizarCadastro
     */
    public FrameAtualizarAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
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

        jNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jCidade = new javax.swing.JLabel();
        jTextCidade = new javax.swing.JTextField();
        jEstado = new javax.swing.JLabel();
        jTextEstado = new javax.swing.JTextField();
        jPais = new javax.swing.JLabel();
        jTextPais = new javax.swing.JTextField();
        jBAtualizar = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jNome.setText("Nome");

        jCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCidade.setText("Cidade");

        jEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jEstado.setText("Estado");

        jPais.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPais.setText("País");

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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPais)
                    .addComponent(jEstado)
                    .addComponent(jCidade)
                    .addComponent(jNome)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPais, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAtualizar)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jEstado)
                .addGap(18, 18, 18)
                .addComponent(jTextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBAtualizar)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTextNome.setText(aeroporto.getNome());
        jTextCidade.setText(aeroporto.getCidade());
        jTextEstado.setText(aeroporto.getEstado());
        jTextPais.setText(aeroporto.getPais());
    }//GEN-LAST:event_formWindowOpened

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        try {
            aeroporto.setNome(jTextNome.getText());
            aeroporto.setCidade(jTextCidade.getText());
            aeroporto.setEstado(jTextEstado.getText());
            aeroporto.setPais(jTextPais.getText());
            
            AeroportoController ctc = new AeroportoController();
            ctc.update(aeroporto);
            JOptionPane.showMessageDialog(rootPane, "Aeroporto atualizado com sucesso");
        } catch (RuntimeException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        new FrameConsultaAeroporto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBAtualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JLabel jCidade;
    private javax.swing.JLabel jEstado;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jPais;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JTextField jTextEstado;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPais;
    // End of variables declaration//GEN-END:variables
}
