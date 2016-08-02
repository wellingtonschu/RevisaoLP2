package com.calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        operacoes op = new operacoes();
        fatorial fat = new fatorial();

        int opcao = 0;

        int valorInt01 = 0;
        int valorInt02 = 0;
        long valorLong01 = 0;
        long valorLong02 = 0;
        float valorFloat01 = 0;
        float valorFloat02 = 0;
        double valorDouble01 = 0;
        double valorDouble02 = 0;

        int resultadoInt = 0;
        long resultadoLong = 0;
        float resultadoFloat = 0;
        double resultadoDouble = 0;

        System.out.println("Calculadora");
        System.out.println("Informe a operação: ");
        System.out.println("11 - Adicionar - Int");
        System.out.println("12 - Adicionar - Long");
        System.out.println("13 - Adicionar - Float");
        System.out.println("14 - Adicionar - Double");
        System.out.println("\nSubtrair");
        System.out.println("21 - Subtrair - Int");
        System.out.println("22 - Subtrair - Long");
        System.out.println("23 - Subtrair - Float");
        System.out.println("24 - Subtrair - Double");
        System.out.println("\nMultiplicar");
        System.out.println("31 - Multiplicar - Int");
        System.out.println("32 - Multiplicar - Long");
        System.out.println("33 - Multiplicar - Float");
        System.out.println("34 - Multiplicar - Double");
        System.out.println("\nDividir");
        System.out.println("41 - Dividir - Int");
        System.out.println("42 - Dividir - Long");
        System.out.println("43 - Dividir - Float");
        System.out.println("44 - Dividir - Double");
        System.out.println("\nFatorial");
        System.out.println("51 - Fatorial");

        opcao = input.nextInt();

        switch (opcao){

            case 11 :

                System.out.println("Informe o primeiro valor: ");
                valorInt01 = input.nextInt();
                System.out.println("Informe o segundo valor: ");
                valorInt02 = input.nextInt();

                resultadoInt = op.adicionarInt(valorInt01, valorInt02);

                System.out.println("Resultado Adicionar - Int: " + resultadoInt);

                break;

            case 12 :

                System.out.println("Informe o primeiro valor: ");
                valorLong01 = input.nextLong();
                System.out.println("Informe o segundo valor: ");
                valorLong02 = input.nextLong();

                resultadoLong = op.adicionarLong(valorLong01, valorLong02);

                System.out.println("Resultado Adicionar - Long: " + resultadoInt);

                break;

            case 13 :

                System.out.println("Informe o primeiro valor: ");
                valorFloat01 = input.nextLong();
                System.out.println("Informe o segundo valor: ");
                valorFloat02 = input.nextLong();

                resultadoFloat = op.adicionarFloat(valorFloat01, valorFloat02);

                System.out.println("Resultado Adicionar - Float: " + resultadoInt);

                break;

            case 14 :

                System.out.println("Informe o primeiro valor: ");
                valorDouble01 = input.nextDouble();
                System.out.println("Informe o segundo valor: ");
                valorDouble02 = input.nextDouble();

                resultadoDouble = op.adicionarDouble(valorDouble01, valorDouble02);

                System.out.println("Resultado Adicionar - Double: " + resultadoInt);

                break;

            case 21 :

                System.out.println("Informe o primeiro valor: ");
                valorInt01 = input.nextInt();
                System.out.println("Informe o segundo valor: ");
                valorInt02 = input.nextInt();

                resultadoInt = op.subtrairInt(valorInt01, valorInt02);

                System.out.println("Resultado Subtrai - Int: " + resultadoInt);

                break;

            case 22 :

                System.out.println("Informe o primeiro valor: ");
                valorLong01 = input.nextLong();
                System.out.println("Informe o segundo valor: ");
                valorLong02 = input.nextLong();

                resultadoLong = op.subtrairLong(valorLong01, valorLong02);

                System.out.println("Resultado Subtrai - Long: " + resultadoInt);

                break;

            case 23 :

                System.out.println("Informe o primeiro valor: ");
                valorFloat01 = input.nextLong();
                System.out.println("Informe o segundo valor: ");
                valorFloat02 = input.nextLong();

                resultadoFloat = op.subtrairFloat(valorFloat01, valorFloat02);

                System.out.println("Resultado Subtrai - Float: " + resultadoInt);

                break;

            case 24 :

                System.out.println("Informe o primeiro valor: ");
                valorDouble01 = input.nextDouble();
                System.out.println("Informe o segundo valor: ");
                valorDouble02 = input.nextDouble();

                resultadoDouble = op.subtrairDouble(valorDouble01, valorDouble02);

                System.out.println("Resultado Subtrai - Double: " + resultadoInt);

                break;

            case 31 :

                System.out.println("Informe o primeiro valor: ");
                valorInt01 = input.nextInt();
                System.out.println("Informe o segundo valor: ");
                valorInt02 = input.nextInt();

                resultadoInt = op.multiplicarInt(valorInt01, valorInt02);

                System.out.println("Resultado Multiplica - Int: " + resultadoInt);

                break;

            case 32 :

                System.out.println("Informe o primeiro valor: ");
                valorLong01 = input.nextLong();
                System.out.println("Informe o segundo valor: ");
                valorLong02 = input.nextLong();

                resultadoLong = op.multiplicarLong(valorLong01, valorLong02);

                System.out.println("Resultado Multiplica - Long: " + resultadoInt);

                break;

            case 33 :

                System.out.println("Informe o primeiro valor: ");
                valorFloat01 = input.nextLong();
                System.out.println("Informe o segundo valor: ");
                valorFloat02 = input.nextLong();

                resultadoFloat = op.multiplicarFloat(valorFloat01, valorFloat02);

                System.out.println("Resultado Multiplica - Float: " + resultadoInt);

                break;

            case 34 :

                System.out.println("Informe o primeiro valor: ");
                valorDouble01 = input.nextDouble();
                System.out.println("Informe o segundo valor: ");
                valorDouble02 = input.nextDouble();

                resultadoDouble = op.multiplicatrDouble(valorDouble01, valorDouble02);

                System.out.println("Resultado Multiplica - Double: " + resultadoInt);

                break;

        }

    }

}
