package br.edu.ifcriodosul.lp2.automovel;

import java.util.Date;

public class Automovel extends Montadora{

    private String modelo;

    public Automovel(String nomePais, String continente, String cidade, String marca, String modelo) {
        super(nomePais, continente, cidade, marca);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
