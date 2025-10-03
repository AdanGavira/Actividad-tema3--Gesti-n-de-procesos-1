package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        // Leer números de la entrada estándar
        while (scanner.hasNextInt()) {
            numeros.add(scanner.nextInt());
        }
        scanner.close();

        // Ordenar lista
        Collections.sort(numeros);

        // Mostrar resultado ordenado
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}