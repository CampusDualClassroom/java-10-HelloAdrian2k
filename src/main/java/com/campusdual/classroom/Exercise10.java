package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    public static void main(String[] args) {
        byte contador = 0;
        do{
            String colorBola = getBall();
            System.out.println("La bola es de color: " + colorBola);
            if ("azul".equals(colorBola)) {
                contador++;
            }
        }while(contador < 2);
    }

    public static String getBall() {
        String color = "";
        switch (randomWithRange(1, 4)) {
            case 1:
                color = "rojo";
                break;
            case 2:
                color = "azul";
                break;
            default:
                color = "verde";
                break;
        }
        return color;
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}