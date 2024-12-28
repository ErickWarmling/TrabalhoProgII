
package trabalhoprog2.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trabalhoprog2.controladores.PilotoController;
import trabalhoprog2.modelos.Piloto;

public class FrameConsultaPiloto extends javax.swing.JFrame {

    public FrameConsultaPiloto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePilotos = new javax.swing.JTable();
        jPilotos = new javax.swing.JLabel();
        jBExcluir = new javax.swing.JButton();
        jBAtualizar = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTablePilotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Idade", "CPF", "Voo", "Destino", "Licença"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePilotos);

        jPilotos.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jPilotos.setText("Pilotos");

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBExcluir)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addComponent(jPilotos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPilotos)
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
        DefaultTableModel modelo = (DefaultTableModel)jTablePilotos.getModel();
        
        PilotoController ctc = new PilotoController();
        List<Piloto> pilotos = ctc.consultarTodos();
        for (Piloto piloto : pilotos){
            modelo.addRow(new String[]{
                String.valueOf(piloto.getId()),
                    piloto.getNome(),
                    String.valueOf(piloto.getIdade()),
                    piloto.getCpf(),
                    piloto.getVoo(),
                    piloto.getDestino(),
                    piloto.getLicenca()
            });
        }
    }//GEN-LAST:event_formWindowOpened

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        try {
            PilotoController ctc = new PilotoController();
            int linha = jTablePilotos.getSelectedRow();
            int id = Integer.parseInt(jTablePilotos.getValueAt(linha, 0).toString());
            ctc.excluir(id);
            
            DefaultTableModel modelo = (DefaultTableModel)jTablePilotos.getModel();
            modelo.removeRow(linha);
            JOptionPane.showMessageDialog(rootPane, "Piloto excluído com sucesso");
            
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um piloto para excluir");
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        try {
            int linha = jTablePilotos.getSelectedRow();
            int id = Integer.parseInt(jTablePilotos.getValueAt(linha, 0).toString());
            String nome = jTablePilotos.getValueAt(linha, 1).toString();
            int idade = Integer.parseInt(jTablePilotos.getValueAt(linha, 2).toString());
            String cpf = jTablePilotos.getValueAt(linha, 3).toString();
            String voo = jTablePilotos.getValueAt(linha, 4).toString();
            String destino = jTablePilotos.getValueAt(linha, 5).toString();
            String licenca = jTablePilotos.getValueAt(linha, 6).toString();
            
            Piloto piloto = new Piloto(nome, idade, cpf, voo, destino, licenca, id);
            new FrameAtualizarPiloto(piloto).setVisible(true);
            this.dispose();
            
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um piloto para atualizar");
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JLabel jPilotos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePilotos;
    // End of variables declaration//GEN-END:variables
}
