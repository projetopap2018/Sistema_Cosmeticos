package br.com.cosmeticos.Model;

public class Itens {

    private int idItensCompra;
    private int qntd;
    private float valorTotal;
    private Produto produto;

    public Itens() {
    }

    public Itens(int idItensCompra, int qntd, float valorTotal,Produto produto) {
        this.idItensCompra = idItensCompra;
        this.qntd = qntd;
        this.valorTotal = valorTotal;
        this.produto = produto;
    }

    /**
     * @return the idItensCompra
     */
    public int getIdItensCompra() {
        return idItensCompra;
    }

    /**
     * @param idItensCompra the idItensCompra to set
     */
    public void setIdItensCompra(int idItensCompra) {
        this.idItensCompra = idItensCompra;
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

    /**
     * @return the valorTotal
     */
    public float getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    

}
