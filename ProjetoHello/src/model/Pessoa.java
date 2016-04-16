package model;

/**
 * representa uma pessoa no sistema.
 * @author lhries
 */
public class Pessoa {
    //Atributo nome
    private String nome;
    //Atributo endereco
    private Endereco endereco;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome
     * @param nome nome de uma pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
