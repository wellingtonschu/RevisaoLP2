package br.edu.ifcriodosul.lp2.automovel;

/**
 * Created by welli on 08/08/2016.
 */
public class Montadora extends Pais {

    private String marca;

    public Montadora(String nomePais, String continente, String cidade, String marca) {
        super(nomePais, continente, cidade);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
