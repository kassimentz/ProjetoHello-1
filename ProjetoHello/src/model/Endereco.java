package model;

/**
 * Classe modelo que trabalha com endereco de uma pessoa.
 * @author lhries
 * @see Pessoa
 */
public class Endereco {
    private String rua;
    private int numero;
    /**
     * Construtor informativo.
     * @param rua indica a rua de uma pessoa.
     * @param numero indica o numero da casa de uma pessoa.
     */
    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }
    
    /**
     * Obtém a rua.
     * @return a rua de uma pessoa.
     */
    public String getRua() {
        return rua;
    }
    
    /**
     * Obtem numero
     * @return o numero da casa de uma pessoa.
     */
    public int getNumero() {
        return numero;
    }
    
    
}
