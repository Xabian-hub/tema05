package com.alejandropobes.tema05.strings;

import java.util.Scanner;

public class Ejercicio5 {
    public static void palabraLarga(String mensaje) {
        System.out.println(mensaje);

        // Usamos try-with-resources para cerrar el Scanner automáticamente
        try (Scanner scanner = new Scanner(System.in)) {
            String texto = scanner.nextLine();

            String palabraMasLarga = "";
            int maxLongitud = 0;

            // Dividimos el texto en palabras usando split con espacios
            String[] palabras = texto.split("\\s+");

            for (String palabra : palabras) {
                int longitud = palabra.length();

                if (longitud > maxLongitud) {
                    maxLongitud = longitud;
                    palabraMasLarga = palabra;
                }
            }

            System.out.println("La palabra más larga es: '" + palabraMasLarga + "' y contiene: " + maxLongitud + " caracteres.");
        }
    }

    public static void main(String[] args) {
        palabraLarga("Escribe una frase:");
    }
}
