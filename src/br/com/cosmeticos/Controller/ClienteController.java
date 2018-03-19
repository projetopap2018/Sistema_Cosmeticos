package br.com.cosmeticos.Controller;

import br.com.cosmeticos.Controller.ClienteController;
import br.com.cosmeticos.DAO.ModuloConexao;
import javax.swing.JOptionPane;
import java.sql.*;

public class ClienteController {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public ClienteController() {

        conexao = ModuloConexao.conector();
    }

    public void inserirCliente() {

        String sql = "insert into cliente(Email,CodigoCliente,NomeCliente,NomeSalao,CNPJ,InscEstadual,DataNasc,CPF,) VALUES(?,?,?,?,?,?,?,?)";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "Email");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        }
    }

}
