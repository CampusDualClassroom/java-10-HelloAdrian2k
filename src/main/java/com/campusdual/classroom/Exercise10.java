package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    public static void main(String[] args) {
        byte contador = 0;
        while (contador < 2) {
            String colorBola = getBall();
            System.out.println("La bola es de color: " + colorBola);
            if (colorBola.equals("azul")) {
                contador++;
            }
        }
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