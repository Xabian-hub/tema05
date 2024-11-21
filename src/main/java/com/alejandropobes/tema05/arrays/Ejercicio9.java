package com.alejandropobes.tema05.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {

    /**
     * Rellenar array con números aleatorios entre 0 y 50
     * @param array Array que será rellenado
     */
    public static void crearArray(int[] array) {
        Random aleatorio = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(51); // Genera números del 0 al 50
        }
        System.out.println("Array rellenado con éxito.");
    }

    /**
     * Visualizar contenido completo del array
     * @param array Array a mostrar
     */
    public static void visualizarArray(int[] array) {
        System.out.println("Contenido del array: " + Arrays.toString(array));
    }

    /**
     * Mostrar elementos pares del array con sus posiciones
     * @param array Array a analizar
     */
    public static void visualizarPares(int[] array) {
        System.out.println("Elementos pares en el array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Posición: " + i + " - Valor: " + array[i]);
            }
        }
    }

    /**
     * Mostrar elementos múltiplos de 3 del array con sus posiciones
     * @param array Array a analizar
     */
    public static void visualizarMultiplos3(int[] array) {
        System.out.println("Elementos múltiplos de 3 en el array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println("Posición: " + i + " - Valor: " + array[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final int[] array = new int[10]; // Se crea el array
        int opcion;

        do {
            // Mostrar menú principal
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("==============");
            System.out.println("1.- Rellenar array");
            System.out.println("2.- Visualizar contenido del array");
            System.out.println("3.- Visualizar contenido par");
            System.out.println("4.- Visualizar contenido múltiplo de 3");
            System.out.println("0.- Salir del menú");
            System.out.print("Selecciona una opción: ");

            // Validar entrada del usuario
            try {
                opcion = Integer.parseInt(leer.nextLine());

                // Manejar opciones del menú
                switch (opcion) {
                    case 1 -> crearArray(array);
                    case 2 -> visualizarArray(array);
                    case 3 -> visualizarPares(array);
                    case 4 -> visualizarMultiplos3(array);
                    case 0 -> System.out.println("Pos me voy!");
                    default -> System.err.println("Opción no válida. Intenta de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
                opcion = -1; // Para que el bucle continúe en caso de error
            }
        } while (opcion != 0);
    }
}

