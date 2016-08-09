package br.edu.ifcriodosul.lp2.montadora;

import br.edu.ifcriodosul.lp2.automovel.*;
import br.edu.ifcriodosul.lp2.automovel.Montadora;

import java.util.List;

/**
 * Created by welli on 09/08/2016.
 */
public abstract class Automovel {

    private List<Roda> rodas;
    private Motor motor;
    private Montadora montadora;

    public List<Roda> getRodas() {
        return rodas;
    }

    public void setRodas(List<Roda> rodas) {
        this.rodas = rodas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
}
