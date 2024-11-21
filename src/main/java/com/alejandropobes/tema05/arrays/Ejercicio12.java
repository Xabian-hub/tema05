package com.alejandropobes.tema05.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] V = new int[50];
        Random aleatorio = new Random();

        // Rellenar el array V con números aleatorios del 1 al 50
        for (int i = 0; i < V.length; i++) {
            V[i] = aleatorio.nextInt(1, 51); // Números aleatorios entre 1 y 50
        }

        // Crear el array P donde cada elemento es la suma acumulada de V
        int[] P = new int[V.length];
        int sumaAcumulada = 0; // Variable para mantener la suma acumulada

        for (int i = 0; i < V.length; i++) {
            sumaAcumulada += V[i]; // Sumar el valor de V[i] a la suma acumulada
            P[i] = sumaAcumulada;  // Asignar la suma acumulada a P[i]
        }

        // Visualizar ambos arrays al final

        System.out.println("Array V: " + Arrays.toString(V));
        System.out.println("Array P: " + Arrays.toString(P));
    }
}
