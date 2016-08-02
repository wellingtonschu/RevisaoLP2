package com.calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        operacoes op = new operacoes();
        fatorial fat = new fatorial();

        int opcao = 0;

        System.out.println("Calculadora");
        System.out.println("Informe a operação: ");
        System.out.println("01 - Adicionar - Int");
        System.out.println("02 - Adicionar - Long");
        System.out.println("03 - Adicionar - Float");
        System.out.println("04 - Adicionar - Double");
        System.out.println("\nSubtrair");
        System.out.println("11 - Subtrair - Int");
        System.out.println("12 - Subtrair - Long");
        System.out.println("13 - Subtrair - Float");
        System.out.println("14 - Subtrair - Double");
        System.out.println("\nMultiplicar");
        System.out.println("21 - Multiplicar - Int");
        System.out.println("22 - Multiplicar - Long");
        System.out.println("23 - Multiplicar - Float");
        System.out.println("24 - Multiplicar - Double");
        System.out.println("\nDividir");
        System.out.println("31 - Dividir - Int");
        System.out.println("32 - Dividir - Long");
        System.out.println("33 - Dividir - Float");
        System.out.println("34 - Dividir - Double");
        System.out.println("\nFatorial");
        System.out.println("41 - Fatorial");




    }

}
