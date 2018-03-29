package br.com.cosmeticos.Model;

public class ItensCompra {

    private int idItensCompra;
    private int qntd;
    private float valorTotal;
    private Compra compra;

    public ItensCompra() {
    }

    public ItensCompra(int idItensCompra, int qntd, float valorTotal, Compra compra) {
        this.idItensCompra = idItensCompra;
        this.qntd = qntd;
        this.valorTotal = valorTotal;
        this.compra = compra;
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
     * @return the compra
     */
    public Compra getCompra() {
        return compra;
    }

    /**
     * @param compra the compra to set
     */
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

}
