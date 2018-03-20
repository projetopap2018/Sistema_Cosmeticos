package br.com.cosmeticos.DAO;

import Conexao.ConectaBanco;
import br.com.cosmeticos.Model.Produto;
import java.sql.*;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    public Connection c;

    public ProdutoDAO() {
        this.c = new ConectaBanco().getConnection();
    }

    public void adcionarProduto(Produto produto) {

        try {
            String sql = "insert into cosmetico.produto (codigo,descricao,qntd,valorUnitario) values (?,?,?,?)";
            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql

            pst.setInt(1, produto.getCodigo());
            pst.setString(2, produto.getDescricao());
            pst.setInt(3, produto.getQntd());
            pst.setFloat(4, produto.getValorUnitario());

            pst.executeUpdate();//executa query para inserção no BD
            pst.close();//fecha conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void excluirProduto(Produto produto) {

        try {
            String sqp = "delete from cosmetico.produto where idProduto = ?";
            PreparedStatement pst = c.prepareStatement(sqp);
            pst.setInt(1, produto.getIdProduto());//PASSA OS PARAMETROS DO ID PARA EXCLUSÃO
            pst.execute();

            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterarProduto(Produto produto) {

        try {
            String sql = "update cosmetico.produto set codigo=?,descricao=?,qntd=?,valorUnitario=? where idProduto = ?";

            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql
            pst.setInt(1, produto.getCodigo());
            pst.setString(2, produto.getDescricao());
            pst.setInt(3, produto.getQntd());
            pst.setFloat(4, produto.getValorUnitario());
            pst.setInt(5, produto.getIdProduto());

            pst.execute();
            pst.close();//fechar a conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
