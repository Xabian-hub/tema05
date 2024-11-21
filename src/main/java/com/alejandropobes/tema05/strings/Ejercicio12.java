package com.alejandropobes.tema05.strings;

public class Ejercicio12 {
    /**
     * Reemplaza "es" por "no por" solo cuando "es" es una palabra completa.
     * @param texto el texto
     * @return el texto con las ocurrencias de "es" reemplazadas por "no por"
     */
    public static String sustituirEs(String texto){
        // Usamos \\bes\\b para que solo se reemplacen las ocurrencias de "es" como palabra completa.
        return texto.replaceAll("\\bes\\b", "no por");
    }

    /**
     * Reemplaza todos los grupos de dígitos por un único carácter '*'.
     * @param texto el texto
     * @return el texto con los números reemplazados por "*"
     */
    public static String remplazarNum(String texto){
        // Reemplazamos todas las secuencias de dígitos por un único "*"
        return texto.replaceAll("\\d+", "*");
    }

    public static void main(String[] args) {
        String texto = "esto1234 es 5678bueno900";

        // Imprimir el resultado después de reemplazar los números por "*"
        System.out.println(remplazarNum(texto)); // Esperado: "esto*es*bueno*"

        // Imprimir el resultado después de reemplazar "es" por "no por"
        System.out.println(sustituirEs(texto)); // Esperado: "no por1234 no por 5678bueno900"
    }
}
