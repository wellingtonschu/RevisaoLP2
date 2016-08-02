package com.calculadora;

public class fatorial {

    public static double fatorial (double numero){

        if (numero < 1){

            return 1;

        } else {

            return numero * fatorial(numero - 1);

        }

    }

}
