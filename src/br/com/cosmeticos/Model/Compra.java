
package br.com.cosmeticos.Model;

public class Compra {

    private int idCompra;
    private float valor;
    private Cliente cliente;
    private Itens itens;

    public Compra() {
    }

    public Compra(int idCompra, float valor, Cliente cliente, Itens itens) {
        this.idCompra = idCompra;
        this.valor = valor;
        this.cliente = cliente;
        this.itens = itens;
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
     * @return the itens
     */
    public Itens getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(Itens itens) {
        this.itens = itens;
    }

   

}
