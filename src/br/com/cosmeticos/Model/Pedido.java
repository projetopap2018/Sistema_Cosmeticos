package br.com.cosmeticos.Model;

public class Pedido {

    private int idPedido;
    private int codigo;
    private String descricao;
    private int qntd;

    public Pedido() {
    }

    public Pedido(int idPedido, int codigo, String descricao, int qntd) {
        this.idPedido = idPedido;
        this.codigo = codigo;
        this.descricao = descricao;
        this.qntd = qntd;
    }

    /**
     * @return the idPedido
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the qntd
     */
    public int getQntd() {
        return qntd;
    }

    /**
     * @param qntd the qntd to set
     */
    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

}
