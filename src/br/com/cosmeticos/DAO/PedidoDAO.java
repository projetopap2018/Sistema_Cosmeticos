
package br.com.cosmeticos.DAO;

import Conexao.ConectaBanco;
import br.com.cosmeticos.Model.Cliente;
import br.com.cosmeticos.Model.Pedido;
import br.com.cosmeticos.Model.Produto;
import java.sql.*;

public class PedidoDAO {
    
    public Connection c;

    public PedidoDAO() {//abre a conexao com o BD
        this.c = new ConectaBanco().getConnection();
    }

    public void adicionarPedido(Pedido pedido) {            

        try {

            String sql = "insert into cosmetico.pedido(codigo,descricao,qntd)values(?,?,?)";

            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql

            pst.setInt(1, pedido.getCodigo());
            pst.setString(2, pedido.getDescricao());
            pst.setInt(3, pedido.getQntd());            

            pst.executeUpdate();//executa a gravação no bd
            pst.close();//fecha conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     public void excluirPedido(Pedido pedido) {

        try {
            String sql = "delete from cosmetico.pedido where idPedido = ?";
            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql
            pst.setInt(1, pedido.getIdPedido());//PASSA OS PARAMETROS DO ID PARA EXCLUSÃO
            pst.executeUpdate();
            pst.close();//fechar a conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void alterarPedido(Pedido pedido) {

        try {
            String sql = "update cosmetico.pedido set codigo=?,descricao=?,qntd=? where idPedido=?";

            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql
            pst.setInt(1, pedido.getCodigo());
            pst.setString(2, pedido.getDescricao());
            pst.setInt(3, pedido.getQntd());
            pst.setInt(4, pedido.getIdPedido());            
            
            pst.execute();
            pst.close();//fechar a conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     public boolean buscaPedido(Pedido pedido) {

        boolean achou = false;

        try {
            String sql = "select * from cosmetico.pedido where codigo = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, pedido.getCodigo());
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
