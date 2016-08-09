package br.edu.ifcriodosul.lp2.automovel;

/**
 * Created by welli on 09/08/2016.
 */
public class Carro {

    public Carro() {
        new Automovel("Estados Unidos", "America", "Detroit", "Ford", "Mustang");
        new Roda(4, "OZ", "Superlegera", 2, 22, 40);
        new Motor(5000, 8, 32, "Gasolina");
    }
}
