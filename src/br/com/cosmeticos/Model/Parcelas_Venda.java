/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cosmeticos.Model;

import java.util.Date;

/**
 *
 * @author ronal
 */
public class Parcelas_Venda {
    
    private int idParcelasVenda;
    private int quantidadeParcelas;
    private Date dataParcela;
    private double valorParcela;
    private String tipoPgt;
    private Venda venda;

    public Parcelas_Venda() {
    }

    public Parcelas_Venda(int idParcelasVenda, int quantidadeParcelas, Date dataParcela, double valorParcela, String tipoPgt, Venda venda) {
        this.idParcelasVenda = idParcelasVenda;
        this.quantidadeParcelas = quantidadeParcelas;
        this.dataParcela = dataParcela;
        this.valorParcela = valorParcela;
        this.tipoPgt = tipoPgt;
        this.venda = venda;
    }

 
        /**
     * @return the quantidadeParcelas
     */
    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    /**
     * @param quantidadeParcelas the quantidadeParcelas to set
     */
    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    /**
     * @return the dataParcela
     */
    public Date getDataParcela() {
        return dataParcela;
    }

    /**
     * @param dataParcela the dataParcela to set
     */
    public void setDataParcela(Date dataParcela) {
        this.dataParcela = dataParcela;
    }

    /**
     * @return the valorParcela
     */
    public double getValorParcela() {
        return valorParcela;
    }

    /**
     * @param valorParcela the valorParcela to set
     */
    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    /**
     * @return the tipoPgt
     */
    public String getTipoPgt() {
        return tipoPgt;
    }

    /**
     * @param tipoPgt the tipoPgt to set
     */
    public void setTipoPgt(String tipoPgt) {
        this.tipoPgt = tipoPgt;
    }

    /**
     * @return the idParcelasVenda
     */
    public int getIdParcelasVenda() {
        return idParcelasVenda;
    }

    /**
     * @param idParcelasVenda the idParcelasVenda to set
     */
    public void setIdParcelasVenda(int idParcelasVenda) {
        this.idParcelasVenda = idParcelasVenda;
    }

  
    
    
}
