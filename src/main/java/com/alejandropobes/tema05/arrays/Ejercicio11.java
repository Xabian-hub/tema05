package com.alejandropobes.tema05.arrays;

import java.util.Arrays;

public class Ejercicio11 {

    /**
     * Invierte el contenido de un array.
     * @param original Array original.
     * @return Nuevo array con los elementos en orden inverso.
     */
    public static int[] invertirArray(int[] original) {
        int[] invertido = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];
        }
        return invertido;
    }

    public static void main(String[] args) {
        final int LONGITUD = 10; // Tamaño del array
        int[] V = new int[LONGITUD];

        // Inicializar el array con valores de ejemplo
        int[] valoresEjemplo = {-1, 30, 20, 1, 5, 100, -5, 7, -100, 1000};
        System.arraycopy(valoresEjemplo, 0, V, 0, LONGITUD);

        System.out.println("Array original (V): " + Arrays.toString(V));

        // Generar array P con los elementos de V en orden inverso
        int[] P = invertirArray(V);

        // Visualizar ambos arrays
        System.out.println("Array invertido (P): " + Arrays.toString(P));
    }
}
