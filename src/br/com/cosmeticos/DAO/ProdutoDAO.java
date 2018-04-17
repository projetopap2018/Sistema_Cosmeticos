package br.com.cosmeticos.DAO;

import Conexao.ConectaBanco;
import br.com.cosmeticos.Model.Produto;
import java.sql.*;

public class ProdutoDAO {

    public Connection c;

    public ProdutoDAO() {
        this.c = new ConectaBanco().getConnection();
    }

    public void adcionarProduto(Produto produto) {

        try {
            String sql = "insert into cosmetico.produto (codigo,descricao,valorUni,qntd) values (?,?,?,?)";
            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql

            pst.setInt(1, produto.getCodigo());
            pst.setString(2, produto.getDescricao());
            pst.setFloat(3, produto.getValorUni());
            pst.setInt(4, produto.getQntd());

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
            String sql = "update cosmetico.produto set codigo=?,descricao=?,valorUni=?,qntd=? where idProduto = ?";

            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql
            pst.setInt(1, produto.getCodigo());
            pst.setString(2, produto.getDescricao());
            pst.setFloat(3, produto.getValorUni());
            pst.setInt(4, produto.getQntd());
            pst.setInt(5, produto.getIdProduto());
            pst.execute();
            pst.close();//fechar a conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean buscaProduto(Produto produto) {

        boolean achou = false;

        try {
            String sql = "select * from cosmetico.produto where codigo = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, produto.getCodigo());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                achou = true;
            }

            rs.close();
            pst.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return achou;
    }

   
}
