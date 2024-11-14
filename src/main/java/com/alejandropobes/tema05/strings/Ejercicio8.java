package com.alejandropobes.tema05.strings;

import java.util.Scanner;

public class Ejercicio8 {

    public static int cuentaChar(String texto) {
        // Retorna directamente el número de caracteres de la palabra
        return texto.length();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese una frase: ");
            String texto = scanner.nextLine();

            String[] palabras = texto.split("\\s+");
            System.out.println("Palabra      N° Caracteres");
            System.out.println("-------------------------");

            for (String palabra : palabras) {
                System.out.printf("%-12s %d\n", palabra, cuentaChar(palabra));
            }
        }
    }
}

