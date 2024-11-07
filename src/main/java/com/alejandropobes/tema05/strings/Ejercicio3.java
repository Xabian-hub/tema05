package com.alejandropobes.tema05.strings;
import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Esta actividad te cuenta el numero de palabas que hay en un texto que el usuario introduce a partir de un Scanner
     * Esta formado por un metodo para contar las palabras y un Main
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase o texto: ");
        String texto = scanner.nextLine();
        scanner.close();
        int numeroDePalabras = contarPalabras(texto);
        System.out.println("El número de palabras en la cadena es: " + numeroDePalabras);
    }

    /**
     *Este metodo calcula el numero de palabras que tiene texto.
     *
     */
    public static int contarPalabras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        String[] palabras = texto.split(" ");
        return palabras.length;
    }
}

