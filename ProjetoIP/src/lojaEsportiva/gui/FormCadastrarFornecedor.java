package lojaEsportiva.gui;

import javax.swing.JOptionPane;
import lojaEsportiva.dados.Fornecedor;
import lojaEsportiva.exceptions.FornecedorJaCadastradoException;

public class FormCadastrarFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form FormCadastrarFornecedor
     */
    public FormCadastrarFornecedor() {
        initComponents();
    }
    
    private boolean validaCampos() {
        if (!((txtCNPJ.getText().length() > 0) && (txtCNPJ.getText() != null))) {
            JOptionPane.showMessageDialog(null, "O campo CNPJ deve ser informado!");
            txtCNPJ.requestFocus();
            return false;
        }
        if (!((txtNome.getText().length() > 0) && (txtNome.getText() != null))) {
            JOptionPane.showMessageDialog(null, "O campo Nome deve ser informado!");
            txtNome.requestFocus();
            return false;
        }
        if (!((txtContato.getText().length() > 0) && (txtContato.getText() != null))) {
            JOptionPane.showMessageDialog(null, "O campo Contato deve ser informado!");
            txtContato.requestFocus();
            return false;
        }
        if (!((txtEndereco.getText().length() > 0) && (txtEndereco.getText() != null))) {
            JOptionPane.showMessageDialog(null, "O campo Endereco deve ser informado!");
            txtEndereco.requestFocus();
            return false;
        }
        if (!((txtTipoProdutos.getText().length() > 0) && (txtTipoProdutos.getText() != null))) {
            JOptionPane.showMessageDialog(null, "O campo Tipo de Produtos deve ser informado!");
            txtTipoProdutos.requestFocus();
            return false;
        }
        return true;
    }
    
    private void limparCampos() {
        txtCNPJ.setText("");
        txtNome.setText("");
        txtContato.setText("");
        txtEndereco.setText("");
        txtTipoProdutos.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNome = new javax.swing.JLabel();
        lbContato = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbTipoProdutos = new javax.swing.JLabel();
        lbCNPJ = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtContato = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTipoProdutos = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();

        setTitle("Cadastro de Fornecedores");
        setResizable(false);

        lbNome.setText("Nome");

        lbContato.setText("Contato");

        lbEndereco.setText("Endereço");

        lbTipoProdutos.setText("Tipo de Produtos");

        lbCNPJ.setText("CNPJ");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbContato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtContato))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTipoProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTipoProdutos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCNPJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadastrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContato)
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoProdutos)
                    .addComponent(txtTipoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCNPJ)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        if (validaCampos()) {
            try{
                Fornecedor fornecedor = new Fornecedor(txtNome.getText(), txtEndereco.getText(), txtContato.getText(), txtTipoProdutos.getText(), txtCNPJ.getText());
                FormPrincipal.fachada.cadastrarFornecedor(fornecedor);
                JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!");
                limparCampos();
            } catch (FornecedorJaCadastradoException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                limparCampos();
            }    
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastrarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastrarFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JLabel lbCNPJ;
    private javax.swing.JLabel lbContato;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTipoProdutos;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTipoProdutos;
    // End of variables declaration//GEN-END:variables
}
