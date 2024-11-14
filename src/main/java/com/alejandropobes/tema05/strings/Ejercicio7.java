package com.alejandropobes.tema05.strings;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese una frase: ");
            String texto = scanner.nextLine();

            // Dividimos la frase en palabras usando el espacio como separador
            String[] palabras = texto.split("\\s+");

            // Imprimimos cada palabra en una línea diferente
            for (String palabra : palabras) {
                System.out.println(palabra);
            }
        }
    }
}

