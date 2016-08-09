package br.edu.ifcriodosul.lp2.automovel;

import java.util.Date;

public class Automovel extends Montadora{

    private Date dataFabricacao;
    private String marca;
    private String modelo;

    public Automovel(String nomePais, String continente, String cidade, String marca, Date dataFabricacao, String marca1, String modelo) {
        super(nomePais, continente, cidade, marca);
        this.dataFabricacao = dataFabricacao;
        this.marca = marca1;
        this.modelo = modelo;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
