package com.alejandropobes.tema05.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {

    /**
     *Metodo que permite introducir un array de enteros.
     * @param longitud Tamaño del array.
     * @return El array rellenado por el usuario.
     */
    public static int[] introducirArray(int longitud) {
        Scanner leer = new Scanner(System.in);
        int[] array = new int[longitud];
        System.out.println("Introduce " + longitud + " números para llenar el array:");
        for (int i = 0; i < longitud; i++) {
            while (true) {
                try {
                    System.out.print("Elemento " + (i + 1) + ": ");
                    array[i] = Integer.parseInt(leer.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Entrada no válida. Por favor, introduce un número entero.");
                }
            }
        }
        return array;
    }

    /**
     * Crea un nuevo array con los elementos mayores a 10 o -1 si no lo son.
     * @param original Array original.
     * @return Nuevo array con la transformación aplicada.
     */
    public static int[] transformarArray(int[] original) {
        int[] transformado = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            transformado[i] = (original[i] > 10) ? original[i] : -1;
        }
        return transformado;
    }

    /**
     * Visualiza el contenido de un array.
     * @param array Array a visualizar.
     * @param mensaje Mensaje a mostrar antes del contenido del array.
     */
    public static void visualizarArray(int[] array, String mensaje) {
        System.out.println(mensaje + Arrays.toString(array));
    }

    public static void main(String[] args) {
        // Crear y rellenar el array P
        int[] P = introducirArray(10);

        // Visualizar el contenido de P
        visualizarArray(P, "Contenido del array P:");

        // Crear el array S transformado a partir de P
        int[] S = transformarArray(P);

        // Visualizar el contenido de S
        visualizarArray(S, "Contenido del array S:");
    }
}

