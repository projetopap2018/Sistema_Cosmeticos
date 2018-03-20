package br.com.cosmeticos.Model;

public class Cliente {

    private int idCliente;
    private String nome;
    private String endereco;
    private String salao;
    private int numero;
    private String email;
    private String celular;
    private String cpf;

    public Cliente() {
    }

    public Cliente(int idCliente, String nome, String endereco, String salao, int numero, String email, String celular, String cpf) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.endereco = endereco;
        this.salao = salao;
        this.numero = numero;
        this.email = email;
        this.celular = celular;
        this.cpf = cpf;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the salao
     */
    public String getSalao() {
        return salao;
    }

    /**
     * @param salao the salao to set
     */
    public void setSalao(String salao) {
        this.salao = salao;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   

}
