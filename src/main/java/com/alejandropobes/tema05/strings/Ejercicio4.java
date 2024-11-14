package com.alejandropobes.tema05.strings;

import java.util.Scanner;

/**
 * Este programa cuenta el número de vocales y consonantes de cada palabra en una frase.
 * Utiliza un escáner para leer la frase y luego procesa cada palabra de la frase.
 * Tiene 2 Metodos a parte del MAIN.
 */
public class Ejercicio4 {
    /**
     * Metodo principal que se ejecuta al iniciar el programa.
     * Pide al usuario que introduzca una frase y luego muestra el número de vocales y consonantes de cada palabra.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        // Dividie la frase en palabras
        String[] palabras = frase.split(" ");

        // Contamos las vocales y consonantes
        for (String palabra : palabras) {
            int numeroVocales = contarVocales(palabra);
            int numeroConsonantes = contarConsonantes(palabra);
            System.out.println("La palabra '" + palabra + "' tiene " + numeroVocales + " vocales y " + numeroConsonantes + " consonantes.");
        }
    }
    /**
     * Cuenta el número de vocales en una palabra.
     *
     * @param palabra La palabra en la que se contarán las vocales.
     * @return El número de vocales en la palabra.
     */
    public static int contarVocales(String palabra) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < palabra.length(); i++) {
            if (vocales.indexOf(palabra.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }
    /**
     * Cuenta el número de consonantes en una palabra.
     *
     * @param palabra La palabra en la que se contarán las consonantes.
     * @return El número de consonantes en la palabra.
     */
    public static int contarConsonantes(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1) {
                contador++;
            }
        }
        return contador;
    }
}
