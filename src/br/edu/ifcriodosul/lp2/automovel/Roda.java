package br.edu.ifcriodosul.lp2.automovel;

/**
 * Created by welli on 08/08/2016.
 */
public class Roda {

    private int quantidade;
    private String fabricante;
    private String modelo;
    private int perfil;
    private int tamanho;
    private int largura;

    public Roda(int quantidade, String fabricante, String modelo, int perfil, int tamanho, int largura) {
        this.quantidade = quantidade;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.perfil = perfil;
        this.tamanho = tamanho;
        this.largura = largura;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
}
