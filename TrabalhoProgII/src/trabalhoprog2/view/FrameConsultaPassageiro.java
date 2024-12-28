package trabalhoprog2.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trabalhoprog2.controladores.PassageiroController;
import trabalhoprog2.modelos.Passageiro;

public class FrameConsultaPassageiro extends javax.swing.JFrame {

    public FrameConsultaPassageiro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePassageiros = new javax.swing.JTable();
        jPassageiros = new javax.swing.JLabel();
        jBExcluir = new javax.swing.JButton();
        jBAtualizar = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTablePassageiros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Idade", "CPF", "Voo", "Destino", "Classe", "Poltrona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePassageiros);

        jPassageiros.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jPassageiros.setText("Passageiros");

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAtualizar)
                .addGap(18, 18, 18)
                .addComponent(jBExcluir)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(jPassageiros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPassageiros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExcluir)
                    .addComponent(jBAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel modelo = (DefaultTableModel)jTablePassageiros.getModel();
        
        PassageiroController ctc = new PassageiroController();
        List<Passageiro> passageiros = ctc.consultarTodos();
        for (Passageiro passageiro : passageiros){
            modelo.addRow(new String[]{
                String.valueOf(passageiro.getId()),
                        passageiro.getNome(),
                        String.valueOf(passageiro.getIdade()),
                        passageiro.getCpf(),
                        passageiro.getVoo(),
                        passageiro.getDestino(),
                        passageiro.getClasse(),
                        String.valueOf(passageiro.getPoltrona())
            });
        }
    }//GEN-LAST:event_formWindowOpened

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        try {
            PassageiroController ctc = new PassageiroController();
            int linha = jTablePassageiros.getSelectedRow();
            int id = Integer.parseInt(jTablePassageiros.getValueAt(linha, 0).toString());
            ctc.excluir(id);
            
            DefaultTableModel modelo = (DefaultTableModel)jTablePassageiros.getModel();
            modelo.removeRow(linha);
            JOptionPane.showMessageDialog(rootPane, "Passageiro excluído com sucesso");
            
        }catch (RuntimeException e) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um passageiro para excluir");
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        try {
            int linha = jTablePassageiros.getSelectedRow();
            int id = Integer.parseInt(jTablePassageiros.getValueAt(linha, 0).toString());
            String nome = jTablePassageiros.getValueAt(linha, 1).toString();
            int idade = Integer.parseInt(jTablePassageiros.getValueAt(linha, 2).toString());
            String cpf = jTablePassageiros.getValueAt(linha, 3).toString();
            String voo = jTablePassageiros.getValueAt(linha, 4).toString();
            String destino = jTablePassageiros.getValueAt(linha, 5).toString();
            String classe = jTablePassageiros.getValueAt(linha, 6).toString();
            int poltrona = Integer.parseInt(jTablePassageiros.getValueAt(linha, 7).toString());
            
            Passageiro passageiro = new Passageiro(nome, idade, cpf, voo, destino, classe, poltrona, id);
            new FrameAtualizarPassageiro(passageiro).setVisible(true);
            this.dispose();
            
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um passageiro para atualizar");
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JLabel jPassageiros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePassageiros;
    // End of variables declaration//GEN-END:variables
}
