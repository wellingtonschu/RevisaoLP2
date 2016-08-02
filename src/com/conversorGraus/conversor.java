package com.conversorGraus;

public class conversor {

    public static float converteCparaF(int valor){

        float convertido;

        convertido = 32 + ((valor / 5) * 9);

        return convertido;
    }

    public static float converteFparaC(int valor){

        float convertido;

        convertido = 5 * ((valor - 32) / 9);

        return convertido;
    }

}
