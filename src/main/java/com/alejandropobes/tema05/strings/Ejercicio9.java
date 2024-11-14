package com.alejandropobes.tema05.strings;

public class Ejercicio9 {
    /**
     * Devuelve una cadena con los caracteres en posiciones impares.
     * @param texto el texto original
     * @return una nueva cadena con los caracteres en posiciones impares
     */
    public static String devuelveImpares(String texto) {
        StringBuilder resultado = new StringBuilder();

        // Recorremos solo las posiciones impares (índices 1, 3, 5, ...)
        for (int i = 1; i < texto.length(); i += 2) {
            resultado.append(texto.charAt(i));
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        String texto = "hoLa Que Tal";
        System.out.println("Resultado: " + devuelveImpares(texto));
    }
}

