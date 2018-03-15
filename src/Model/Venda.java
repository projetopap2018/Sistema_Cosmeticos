/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author ronal
 */
public class Venda {
    
    private int idVenda;
    private double valorTotal;
    private Date dataVenda;
    private Cliente cliente;
    private Produto produto;
    private Itens_Venda itens_Venda;

    public Venda() {
    }

    public Venda(int idVenda, double valorTotal, Date dataVenda, Cliente cliente, Produto produto, Itens_Venda itens_Venda) {
        this.idVenda = idVenda;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.produto = produto;
        this.itens_Venda = itens_Venda;
    }


   
    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
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

    /**
     * @return the idVenda
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
}
