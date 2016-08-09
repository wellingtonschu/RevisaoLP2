package br.edu.ifcriodosul.lp2.montadora;

/**
 * Created by welli on 09/08/2016.
 */
public abstract class Motor {

    private int potencia;
    private int nroCilindros;
    private float consumo;
    private String unidadeConsumo;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNroCilindros() {
        return nroCilindros;
    }

    public void setNroCilindros(int nroCilindros) {
        this.nroCilindros = nroCilindros;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public String getUnidadeConsumo() {
        return unidadeConsumo;
    }

    public void setUnidadeConsumo(String unidadeConsumo) {
        this.unidadeConsumo = unidadeConsumo;
    }
}
