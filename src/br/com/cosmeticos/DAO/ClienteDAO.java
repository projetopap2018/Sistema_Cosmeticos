package br.com.cosmeticos.DAO;

import br.com.cosmeticos.Model.Cliente;
import javax.swing.JOptionPane;
import java.sql.*;

public class ClienteDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void inserirCliente(Cliente cliente) {

        String sql = "insert into cliente(Email,CodigoCliente,NomeCliente,NomeSalao,CNPJ,InscEstadual,CPF) VALUES(?,?,?,?,?,?,?,?)";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getEmail());
            pst.setString(2, String.valueOf(cliente.getCodigoCliente()));
            pst.setString(3, cliente.getNome());
            pst.setString(4, cliente.getSalao());
            pst.setString(5, cliente.getCnpj());
            pst.setString(6, cliente.getIsnsEstadual());
            pst.setString(7, cliente.getDataNasc());
            pst.setString(8, cliente.getCpf());
          


            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro Salvo!");
            //validação dos campos obrigatorios
            /*   if (cliente.getEmail().isEmpty() || (txtEndCli.getText().isEmpty()) || (txtTelCli.getText().isEmpty()) || (txtEmailCli.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {

                //atualiza a tabela de usuarios, com os dados do formulario
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!");
                    //limpam os campos
                    txtNomeCli.setText(null);
                    txtEndCli.setText(null);
                    txtTelCli.setText(null);
                    txtEmailCli.setText(null);
                }
            }*/

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!");
        }
    }

}
