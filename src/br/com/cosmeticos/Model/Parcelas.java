package br.com.cosmeticos.Model;

import java.sql.Date;

public class Parcelas {

    private int idParcelas;
    private float valor;
    private Date data;
    private char qntd;
    private Compra compra;

    public Parcelas() {
    }

    public Parcelas(int idParcelas, float valor, Date data, char qntd, Compra compra) {
        this.idParcelas = idParcelas;
        this.valor = valor;
        this.data = data;
        this.qntd = qntd;
        this.compra = compra;
    }

    /**
     * @return the idParcelas
     */
    public int getIdParcelas() {
        return idParcelas;
    }

    /**
     * @param idParcelas the idParcelas to set
     */
    public void setIdParcelas(int idParcelas) {
        this.idParcelas = idParcelas;
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
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the qntd
     */
    public char getQntd() {
        return qntd;
    }

    /**
     * @param qntd the qntd to set
     */
    public void setQntd(char qntd) {
        this.qntd = qntd;
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
