
package br.com.cosmeticos.Model;

public class Compra {

    private int idCompra;
    private float valor;
    private Cliente cliente;
    private Itens itensCompra;

    public Compra() {
    }

    public Compra(int idCompra, float valor, Cliente cliente, Itens itensCompra) {
        this.idCompra = idCompra;
        this.valor = valor;
        this.cliente = cliente;
        this.itensCompra = itensCompra;
    }

    /**
     * @return the idCompra
     */
    public int getIdCompra() {
        return idCompra;
    }

    /**
     * @param idCompra the idCompra to set
     */
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the itensCompra
     */
    public Itens getItensCompra() {
        return itensCompra;
    }

    /**
     * @param itensCompra the itensCompra to set
     */
    public void setItensCompra(Itens itensCompra) {
        this.itensCompra = itensCompra;
    }

   

}
