package br.edu.ifcriodosul.lp2.automovel;

/**
 * Created by welli on 08/08/2016.
 */
public class Pais {

    private String nomePais;
    private String continente;
    private String cidade;

    public Pais(String nomePais, String continente, String cidade) {
        this.nomePais = nomePais;
        this.continente = continente;
        this.cidade = cidade;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
