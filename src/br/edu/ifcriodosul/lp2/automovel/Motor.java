package br.edu.ifcriodosul.lp2.automovel;

/**
 * Created by welli on 08/08/2016.
 */
public class Motor {

    private int cilindrada;
    private int numCilindros;
    private int qtdeValvulas;
    private String combustivel;

    public Motor(int cilindrada, int numCilindros, int qtdeValvulas, String combustivel) {
        this.cilindrada = cilindrada;
        this.numCilindros = numCilindros;
        this.qtdeValvulas = qtdeValvulas;
        this.combustivel = combustivel;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    public int getQtdeValvulas() {
        return qtdeValvulas;
    }

    public void setQtdeValvulas(int qtdeValvulas) {
        this.qtdeValvulas = qtdeValvulas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
