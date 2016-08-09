package br.edu.ifcriodosul.lp2.montadora;

import br.edu.ifcriodosul.lp2.automovel.*;

/**
 * Created by welli on 09/08/2016.
 */
public class Carro extends Automovel{

    private int nroPortas;
    private int capacidadeTanque;
    private String placa;

    public int getNroPortas() {
        return nroPortas;
    }

    public void setNroPortas(int nroPortas) {
        this.nroPortas = nroPortas;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
