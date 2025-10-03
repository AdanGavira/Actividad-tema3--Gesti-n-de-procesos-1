package Ejercicio1_2;

import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        int cantidad = 40; // mínimo 40 números

        for (int i = 0; i < cantidad; i++) {
            int numero = rand.nextInt(101); // genera entre 0 y 100
            System.out.print(numero + " ");
        }
    }
}

