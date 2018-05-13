package br.com.cosmeticos.Views;

import Conexao.ConectaBanco;
import Conexao.TeclasPermitidas;
import br.com.cosmeticos.DAO.ProdutoDAO;
import br.com.cosmeticos.Model.Produto;
import java.awt.HeadlessException;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
//importa recursos da biblioteca rs2xml.jar, para mandar os dados para a tabela
import net.proteanit.sql.DbUtils;

public class TelaPesquisaProduto extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form TelaPesquisaProduto
     */
    public TelaPesquisaProduto() {
        initComponents();
        conexao = ConectaBanco.getConnection();
        txtDesc.setDocument(new TeclasPermitidas());
        txtPesq.setDocument(new TeclasPermitidas());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPesq = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltarTp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQntd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValorUni = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtPesq = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jtbPesq.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jtbPesq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbPesq.setRowHeight(60
        );
        jtbPesq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbPesqMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbPesq);
        if (jtbPesq.getColumnModel().getColumnCount() > 0) {
            jtbPesq.getColumnModel().getColumn(0).setMinWidth(50);
            jtbPesq.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtbPesq.getColumnModel().getColumn(0).setMaxWidth(50);
            jtbPesq.getColumnModel().getColumn(2).setMinWidth(250);
            jtbPesq.getColumnModel().getColumn(2).setPreferredWidth(250);
            jtbPesq.getColumnModel().getColumn(3).setMinWidth(450);
            jtbPesq.getColumnModel().getColumn(3).setPreferredWidth(450);
        }

        btnAlterar.setBackground(new java.awt.Color(0, 0, 0));
        btnAlterar.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(0, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltarTp.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltarTp.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnVoltarTp.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarTp.setText("VOLTAR");
        btnVoltarTp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTpActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setText("CÓDIGO");

        txtCodigo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setText("DESCRIÇÃO");

        txtDesc.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setText("QNTD");

        txtQntd.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtQntd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQntdKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel4.setText("VALOR UNITÁRIO");

        txtValorUni.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtValorUni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUniKeyTyped(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N

        txtPesq.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setText("DATA");

        txtData.setEditable(false);
        txtData.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtData.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblData.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblData.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(212, 212, 212)
                        .addComponent(btnVoltarTp)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtQntd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(91, 91, 91)
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtValorUni, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQntd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtValorUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVoltarTp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarProduto() {

        try {
            String sql = "select codigo as CÓDIGO,descricao as DESCRIÇÃO, valorUni as VALOR_UNITÁRIO,qntd as QNTD,"
                    + "data as DATA from cosmetico.Produto where  descricao like ?";
//            String sql = "select * from cosmetico.produto where  codigo =  ?";
            pst = conexao.prepareStatement(sql);

            //passando o conteudo da caixa de pesquisa para o ?
            //atencao ao % que e a continuação da string sql
            pst.setString(1, txtPesq.getText() + "%");
            rs = pst.executeQuery();//executa a query no banco
            //a linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela
            jtbPesq.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar");
        }
    }

    //metodo para setar os campos da tabela no formulario
    private void setarCampos() {
        int setar = jtbPesq.getSelectedRow();

        txtCodigo.setText(jtbPesq.getModel().getValueAt(setar, 0).toString());
        txtDesc.setText(jtbPesq.getModel().getValueAt(setar, 1).toString());
        txtValorUni.setText(jtbPesq.getModel().getValueAt(setar, 2).toString());
        txtQntd.setText(jtbPesq.getModel().getValueAt(setar, 3).toString());
        txtData.setText(jtbPesq.getModel().getValueAt(setar, 4).toString());

    }

    private void btnVoltarTpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTpActionPerformed
        //volta tela principal
        TelaProduto tpd = new TelaProduto();
        tpd.setVisible(true);
    }//GEN-LAST:event_btnVoltarTpActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // chama metodo pesquisarProduto
        pesquisarProduto();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jtbPesqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbPesqMouseClicked
        // seta os valores no formulario
        setarCampos();
    }//GEN-LAST:event_jtbPesqMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // chama metodo alterar
        try {
            Produto produto = new Produto();
            ProdutoDAO produtoDAO = new ProdutoDAO();
            produto.setCodigo(Integer.parseInt(txtCodigo.getText()));
            produto.setDescricao(txtDesc.getText());
            produto.setQntd(Integer.parseInt(txtQntd.getText()));
            produto.setValorUni(Float.parseFloat(txtValorUni.getText()));
            produto.setIdProduto(Integer.parseInt(txtId.getText()));

            produtoDAO.alterarProduto(produto);//chama metodo da classe produtoDAO
            JOptionPane.showMessageDialog(null, "PRODUTO ALTERADO!");

            //limpar campos
            txtCodigo.setText(null);
            txtDesc.setText(null);
            txtQntd.setText(null);
            txtValorUni.setText(null);

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR O PRODUTO!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // chama o metodo excluir

        try {
            Produto produto = new Produto();

            produto.setIdProduto(Integer.parseInt(txtId.getText()));//chama id para excluir
            ProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.excluirProduto(produto);//chama metodo da classe produtoDAO

            JOptionPane.showMessageDialog(null, "CLIENTE EXCLUÍDO COM SUCESSO!");
            //limpar campos
            //limpar campos
            txtCodigo.setText(null);
            txtDesc.setText(null);
            txtQntd.setText(null);
            txtValorUni.setText(null);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO NA EXCLUSÃO DOS DADOS!" + e);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //mostra data atual do sistema

        java.util.Date sysDate = new java.util.Date();
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

    private void txtQntdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQntdKeyTyped
        // digita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtQntdKeyTyped

    private void txtValorUniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUniKeyTyped
        // digita somente numeros
        String caracteres = "0987654321,.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtValorUniKeyTyped

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
            java.util.logging.Logger.getLogger(TelaPesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltarTp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbPesq;
    private javax.swing.JLabel lblData;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPesq;
    private javax.swing.JTextField txtQntd;
    private javax.swing.JTextField txtValorUni;
    // End of variables declaration//GEN-END:variables

}
