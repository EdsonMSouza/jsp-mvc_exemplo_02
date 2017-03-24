/**
 * Arquivo: Pessoa.java
 *
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author Edson Melo de Souza (prof.edson.melo@gmail.com)
 * @since 24/03/2017, 10:09:43
 * @version 1.0
 */
public class Pessoa implements Serializable {

    // atributos da classe LETRAS MINÚSCULAS
    private int id;
    private String nome;
    private String cpf;
    private Endereco endereco;

    // método construtor vazio + classe serializada = Javabeans
    public Pessoa() {
    }

    // métodos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
