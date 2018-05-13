
package br.com.cosmeticos.DAO;

import Conexao.ConectaBanco;
import br.com.cosmeticos.Model.Compra;
import java.sql.*;


public class CompraDAO {

    public Connection c;

    public CompraDAO() {//abre a conexao com o BD
        this.c = new ConectaBanco().getConnection();
    }

    public void adicionarCompra(Compra compra) {

        try {

            String sql = "insert into cosmetico.compra(valor,Cliente_idCliente,ItensCompra_idItensCompra)values(?,?,?)";

            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql

            pst.setFloat(1, compra.getValor());
            pst.setInt(2, compra.getCliente().getIdCliente());
            pst.setInt(3, compra.getItensCompra().getIdItensCompra());
            pst.executeUpdate();//executa a gravação no bd
            pst.close();//fecha conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void excluirCompra(Compra compra) {

        try {
            String sql = "delete from cosmetico.compra where idCompra = ?";
            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql
            pst.setInt(1, compra.getIdCompra());//PASSA OS PARAMETROS DO ID PARA EXCLUSÃO
            pst.executeUpdate();
            pst.close();//fechar a conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void alterarCompra(Compra compra) {

        try {
            String sql = "update cosmetico.compra set valor=?,Cliente_idCliente=?,ItensCompra_idItensCompra=? where idCompra=?";

            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql
            pst.setFloat(1, compra.getValor());
            pst.setInt(2, compra.getCliente().getIdCliente());
            pst.setInt(3, compra.getItensCompra().getIdItensCompra());

            pst.execute();
            pst.close();//fechar a conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
