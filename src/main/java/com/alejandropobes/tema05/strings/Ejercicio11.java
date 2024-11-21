package com.alejandropobes.tema05.strings;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar las tres cadenas: nombre, primer apellido y segundo apellido
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine().trim();
        while (nombre.isEmpty()) {
            System.out.print("Por favor ingrese un nombre válido: ");
            nombre = leer.nextLine().trim();
        }

        System.out.print("Ingrese su primer apellido: ");
        String primerApellido = leer.nextLine().trim();
        while (primerApellido.isEmpty()) {
            System.out.print("Por favor ingrese un primer apellido válido: ");
            primerApellido = leer.nextLine().trim();
        }

        System.out.print("Ingrese su segundo apellido: ");
        String segundoApellido = leer.nextLine().trim();
        while (segundoApellido.isEmpty()) {
            System.out.print("Por favor ingrese un segundo apellido válido: ");
            segundoApellido = leer.nextLine().trim();
        }

        // Concatenamos las tres cadenas para formar el nombre completo
        String nombreCompleto = nombre + " " + primerApellido + " " + segundoApellido;

        // a) Nombre completo en minúsculas, mayúsculas y longitud
        System.out.println("a)");
        System.out.println("En minúsculas: " + nombreCompleto.toLowerCase());
        System.out.println("En mayúsculas: " + nombreCompleto.toUpperCase());
        System.out.println("Longitud: " + nombreCompleto.length());

        // b) Los 5 primeros caracteres (si la longitud es suficiente)
        System.out.println("b)");
        if (nombreCompleto.length() >= 5) {
            System.out.println("Primeros 5 caracteres: " + nombreCompleto.substring(0, 5));
        } else {
            System.out.println("Cadena demasiado corta.");
        }

        // c) Los 2 últimos caracteres (si la longitud es suficiente)
        System.out.println("c)");
        if (nombreCompleto.trim().length() >= 2) { // Usamos trim() para eliminar espacios en blanco
            System.out.println("Últimos 2 caracteres: " + nombreCompleto.substring(nombreCompleto.length() - 2));
        } else {
            System.out.println("Cadena demasiado corta.");
        }

        // d) Número de ocurrencias del último carácter
        System.out.println("d)");
        char ultimaLetra = nombreCompleto.charAt(nombreCompleto.length() - 1);
        int cuenta = 0;
        for (int i = 0; i < nombreCompleto.length(); i++) {
            if (nombreCompleto.charAt(i) == ultimaLetra) {
                cuenta++;
            }
        }
        System.out.println("Número de ocurrencias del último carácter: " + cuenta);

        // e) Reemplazar todas las ocurrencias del primer carácter en mayúscula
        System.out.println("e)");
        char primeraLetra = nombreCompleto.charAt(0);
        char primeraLetraMayuscula = Character.toUpperCase(primeraLetra);
        System.out.println("Reemplazar primera letra en mayúscula: " + nombreCompleto.replace(primeraLetra, primeraLetraMayuscula));

        // f) Cadena con tres asteriscos por delante y por detrás
        System.out.println("f)");
        String nombreCompletoConEstrellas = "***" + nombreCompleto + "***";
        System.out.println("Con asteriscos: " + nombreCompletoConEstrellas);

        // g) La cadena invertida
        System.out.println("g)");
        StringBuilder sb = new StringBuilder(nombreCompleto);
        System.out.println("Invertido: " + sb.reverse());
    }
}
