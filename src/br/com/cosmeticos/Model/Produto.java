package br.com.cosmeticos.Model;

public class Produto {

    private int idProduto;
    private int codigo;
    private String descricao;
    private int qntd;
    private float valorUni;

    public Produto() {
    }

    public Produto(int idProduto, int codigo, String descricao, int qntd, float valorUni) {
        this.idProduto = idProduto;
        this.codigo = codigo;
        this.descricao = descricao;
        this.qntd = qntd;
        this.valorUni = valorUni;
    }

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
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

    /**
     * @return the valorUni
     */
    public float getValorUni() {
        return valorUni;
    }

    /**
     * @param valorUni the valorUni to set
     */
    public void setValorUni(float valorUni) {
        this.valorUni = valorUni;
    }
    
    

}
