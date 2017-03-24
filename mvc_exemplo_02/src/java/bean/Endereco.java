/**
 * Arquivo: Endereco.java
 * 
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author Edson Melo de Souza (prof.edson.melo@gmail.com)
 * @since 24/03/2017, 10:09:49
 * @version 1.0
 */
public class Endereco implements Serializable {

    // atributos da classe LETRAS MINÚSCULAS
    private String rua;
    private int numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    /**
     * método construtor vazio + classe serializada = Javabeans
     */
    public Endereco() {
    }

    /**
     * método construtor com parâmetros
     *
     * @param rua
     * @param numero
     * @param cep
     * @param bairro
     * @param cidade
     * @param estado
     */
    public Endereco(String rua, int numero, String cep, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    // métodos getters e setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
