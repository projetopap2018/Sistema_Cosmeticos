
package br.com.cosmeticos.DAO;

import Conexao.ConectaBanco;
import br.com.cosmeticos.Model.Itens;
import java.sql.*;

public class ItensDAO {
    
    
    public Connection c;

    public ItensDAO() {//abre a conexao com o BD
        this.c = new ConectaBanco().getConnection();
    }

    public void adicionarItens(Itens itens) {            

        try {

            String sql = "insert into cosmetico.ItensCompra(qntd,valorTotal,Produto_idProduto)values(?,?,?)";

            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql

            pst.setInt(1, itens.getQntd());
            pst.setFloat(2, itens.getValorTotal());
            pst.setInt(3, itens.getProduto().getIdProduto());            

            pst.executeUpdate();//executa a gravação no bd
            pst.close();//fecha conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     public void excluirItens(Itens itens) {

        try {
            String sql = "delete from cosmetico.ItensCompra where idItensCompra = ?";
            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql
            pst.setInt(1, itens.getIdItensCompra());//PASSA OS PARAMETROS DO ID PARA EXCLUSÃO
            pst.executeUpdate();
            pst.close();//fechar a conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void alterarItens(Itens itens) {

        try {
            String sql = "update cosmetico.ItensCompra set qntd=?,valorTotal=?,Produto_idProduto=? where idItensCompra=?";

            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql
            pst.setInt(1, itens.getQntd());
            pst.setFloat(2, itens.getValorTotal());
            pst.setInt(3, itens.getProduto().getIdProduto());
    
            pst.execute();
            pst.close();//fechar a conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
