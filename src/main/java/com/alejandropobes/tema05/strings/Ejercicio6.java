package com.alejandropobes.tema05.strings;

import java.util.Scanner;

public class Ejercicio6 {
    public static void repetirFrase(String frase, int factor) {
        for (int i = 0; i < factor; i++) {
            System.out.println(frase);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese una frase: ");
            String frase = scanner.nextLine();

            System.out.print("Ingrese el factor de multiplicación: ");
            int factorMultiplicar = scanner.nextInt();

            repetirFrase(frase, factorMultiplicar);
        }
    }
}
