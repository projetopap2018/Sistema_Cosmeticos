package br.com.cosmeticos.DAO;

import Conexao.ConectaBanco;
import br.com.cosmeticos.Model.Cliente;
import java.sql.*;


public class ClienteDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Connection c;

    public ClienteDAO() {//abre a conexao com o BD
        this.c = new ConectaBanco().getConnection();
    }

    public void adicionarCliente(Cliente cliente) {

        try {
//instrução sql = BD
            String sql = "insert into cosmetico.cliente(nome,endereco,salao,numero,email,celular,cpf)values(?,?,?,?,?,?,?)";

            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql

            pst.setString(1, cliente.getNome().toUpperCase().trim());
            pst.setString(2, cliente.getEndereco().toUpperCase().trim());
            pst.setString(3, cliente.getSalao().toUpperCase().trim());
            pst.setInt(4, cliente.getNumero());
            pst.setString(5, cliente.getEmail().toUpperCase().trim());
            pst.setString(6, cliente.getCelular());
            pst.setString(7, cliente.getCpf());

            pst.executeUpdate();//executa a gravação no bd
            pst.close();//fecha conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public List<Cliente> buscaPorNome() {
//
//        List<Cliente> clientes = new ArrayList<>();
//        try {
//
//            String sql = "select * from cosmetico.cliente";
//            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql
//      
//            ResultSet rs = pst.executeQuery();
////           rs.beforeFirst();
//            while (rs.next()) {
//                Cliente cliente = new Cliente();
//
//                cliente.setIdCliente(rs.getInt("idCliente"));
//                cliente.setCodigo(rs.getInt("codigo"));
//                cliente.setNome(rs.getString("nome"));
//                cliente.setSalao(rs.getString("salao"));
//                cliente.setCpf(rs.getString("cpf"));
//                cliente.setEmail(rs.getString("email"));
//                cliente.setEndereco(rs.getString("endereco"));
//                cliente.setNumero(rs.getInt("numero"));
//                clientes.add(cliente);
//            }
//            pst.close();//fecha conexao
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return clientes;
//    }
    public void excluirCliente(Cliente cliente) {

        try {
            String sql = "delete from cosmetico.cliente where idCliente = ?";
            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql
            pst.setInt(1, cliente.getIdCliente());//PASSA OS PARAMETROS DO ID PARA EXCLUSÃO
            pst.executeUpdate();
            pst.close();//fechar a conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void alterarCliente(Cliente cliente) {

        try {
            String sql = "update cosmetico.cliente set nome=?,endereco=?,salao=?,numero=?,email=?,celular=? where idCliente=?";

            PreparedStatement pst = c.prepareStatement(sql);//prerapa a string sql
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEndereco());
            pst.setString(3, cliente.getSalao());
            pst.setInt(4, cliente.getNumero());
            pst.setString(5, cliente.getEmail());
            pst.setString(6, cliente.getCelular());
            pst.setInt(7, cliente.getIdCliente());

            pst.execute();
            pst.close();//fechar a conexao
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean buscaCpf(Cliente cliente) {

        boolean achou = false;

        try {
            String sql = "select * from cosmetico.cliente where cpf = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, cliente.getCpf());
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
