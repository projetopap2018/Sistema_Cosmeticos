/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ronal
 */
public class Itens_Venda {

  
    private int quantidade;
    private double valorUnitario;

    public Itens_Venda() {
    }

    public Itens_Venda(int quantidade, double valorUnitario) {
       
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorUnitario
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

 
}
