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
public class FrameCadastroAeroporto extends javax.swing.JFrame {

    /**
     * Creates new form FrameCadastroAeroporto
     */
    public FrameCadastroAeroporto() {
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
        JCidade = new javax.swing.JLabel();
        jTextCidade = new javax.swing.JTextField();
        jEstado = new javax.swing.JLabel();
        jTextEstado = new javax.swing.JTextField();
        jPais = new javax.swing.JLabel();
        jTextPais = new javax.swing.JTextField();
        jBSalvarAeroporto = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();

        jNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jNome.setText("Nome");

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        JCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JCidade.setText("Cidade");

        jTextCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCidadeActionPerformed(evt);
            }
        });

        jEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jEstado.setText("Estado");

        jPais.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPais.setText("País");

        jBSalvarAeroporto.setText("Salvar");
        jBSalvarAeroporto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarAeroportoActionPerformed(evt);
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPais, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPais, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNome))
                        .addContainerGap(131, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBLimpar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jBSalvarAeroporto)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jEstado)
                .addGap(18, 18, 18)
                .addComponent(jTextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPais)
                .addGap(18, 18, 18)
                .addComponent(jTextPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvarAeroporto)
                    .addComponent(jBLimpar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jTextCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCidadeActionPerformed

    private void jBSalvarAeroportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarAeroportoActionPerformed
        if (!dadosValidos()){
            return;
        }
        
        try{
        Aeroporto aeroporto = new Aeroporto();
        
        aeroporto.setNome(jTextNome.getText());
        aeroporto.setCidade(jTextCidade.getText());
        aeroporto.setEstado(jTextEstado.getText());
        aeroporto.setPais(jTextPais.getText());
        
        AeroportoController aeroctc = new AeroportoController();
        aeroctc.salvar(aeroporto);
        JOptionPane.showMessageDialog(rootPane, "Aeroporto cadastrado com sucesso");
        }catch (RuntimeException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jBSalvarAeroportoActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTextNome.setText("");
        jTextCidade.setText("");
        jTextEstado.setText("");
        jTextPais.setText("");
    }//GEN-LAST:event_jBLimparActionPerformed
    private boolean dadosValidos(){
        if (jTextNome.getText().equals("") ||
            jTextCidade.getText().equals("") ||
            jTextEstado.getText().equals("") ||
            jTextPais.getText().equals("")){
            
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
            return false;
        }
        
        if (jTextEstado.getText().length() < 2 || jTextEstado.getText().length() > 2){
            JOptionPane.showMessageDialog(rootPane, "Informe a sigla do estado com 2 dígitos");
            return false;
        }
            return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JCidade;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvarAeroporto;
    private javax.swing.JLabel jEstado;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jPais;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JTextField jTextEstado;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPais;
    // End of variables declaration//GEN-END:variables
}
