package br.com.cosmeticos.Views;

import Conexao.TeclasPermitidas;
import br.com.cosmeticos.DAO.ProdutoDAO;
import br.com.cosmeticos.Model.Produto;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaProduto
     */
    public TelaProduto() {
        initComponents();
        //   setExtendedState(MAXIMIZED_BOTH);
        txtDescriProd.setDocument(new TeclasPermitidas());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblDescri = new javax.swing.JLabel();
        txtDescriProd = new javax.swing.JTextField();
        lblValorUniProd = new javax.swing.JLabel();
        lblQntProd = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtQntProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnPesqProd = new javax.swing.JButton();
        btnVoltarProd = new javax.swing.JButton();
        txtValorUni = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setText("CADASTRO DE PRODUTO");

        lblDescri.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblDescri.setText("DESCRIÇÃO");

        txtDescriProd.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N

        lblValorUniProd.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblValorUniProd.setText("VALOR UNITÁRIO");

        lblQntProd.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblQntProd.setText("QUANTIDADE");

        txtCodigo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        txtQntProd.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtQntProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQntProdKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setText("CÓD");

        btnSalvar.setBackground(new java.awt.Color(0, 0, 0));
        btnSalvar.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnPesqProd.setBackground(new java.awt.Color(0, 0, 0));
        btnPesqProd.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnPesqProd.setForeground(new java.awt.Color(255, 255, 255));
        btnPesqProd.setText("PESQUISA");
        btnPesqProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqProdActionPerformed(evt);
            }
        });

        btnVoltarProd.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltarProd.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnVoltarProd.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarProd.setText("VOLTAR");
        btnVoltarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarProdActionPerformed(evt);
            }
        });

        txtValorUni.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtValorUni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUniKeyTyped(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(289, 289, 289)
                        .addComponent(btnPesqProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltarProd))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(lblDescri))
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescriProd)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValorUniProd)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorUni, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196)
                                .addComponent(lblQntProd)
                                .addGap(18, 18, 18)
                                .addComponent(txtQntProd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 261, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblData))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescriProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescri))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorUniProd)
                    .addComponent(lblQntProd)
                    .addComponent(txtQntProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesqProd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarProdActionPerformed
        // chama tela principal
        TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible(true);
    }//GEN-LAST:event_btnVoltarProdActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // chama metodo adicionarProduto
        try {
            Produto produto = new Produto();//INSTANCIA O PRODUTO
//PEGA OS VALORES DO FORMULARIO E GRAVA NO BD
            produto.setCodigo(Integer.parseInt(txtCodigo.getText()));
            produto.setDescricao(txtDescriProd.getText());
            produto.setQntd(Integer.parseInt(txtQntProd.getText()));
            produto.setValorUni(Float.parseFloat(txtValorUni.getText().replace(",", ".")));//replace - substitui a virgula pelo ponto

            ProdutoDAO produtoDAO = new ProdutoDAO();//CHAMA A CLASSE PRODUTO DAO E ACESSA O METODO PARA ADICIONAR NO BD
            produtoDAO.adcionarProduto(produto);

            JOptionPane.showMessageDialog(null, "PRODUTO CADASTRADO!");

            //LIMPAR OS CAMPOS DEPOIS DE SALVAR
            txtCodigo.setText(null);
            txtDescriProd.setText(null);
            txtQntProd.setText(null);
            txtValorUni.setText(null);
            
            txtCodigo.requestFocus();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR O PRODUTO !");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesqProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqProdActionPerformed
        // chama tela pesquisaProduto
        TelaPesquisaProduto tpp = new TelaPesquisaProduto();
        tpp.setVisible(true);
    }//GEN-LAST:event_btnPesqProdActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //mostra data atual do sistema

        Date sysDate = new Date();
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        lblData.setText(dt.format(sysDate));
    }//GEN-LAST:event_formWindowActivated

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        // digita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtValorUniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUniKeyTyped
         // digita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtValorUniKeyTyped

    private void txtQntProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQntProdKeyTyped
         // digita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtQntProdKeyTyped

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
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesqProd;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltarProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescri;
    private javax.swing.JLabel lblQntProd;
    private javax.swing.JLabel lblValorUniProd;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescriProd;
    private javax.swing.JTextField txtQntProd;
    private javax.swing.JTextField txtValorUni;
    // End of variables declaration//GEN-END:variables
}
