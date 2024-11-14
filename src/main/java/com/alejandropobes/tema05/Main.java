package com.alejandropobes.tema05;

public class Main {

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        String vocales = "aàáeéèiíìoóòuúù";
        return vocales.indexOf(c) >= 0;
    }
    public static int contarVocales(String texto) {
        int vocales = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (esVocal(texto.charAt(i))) {
                vocales++;
            }
    }
        return vocales;
    }
}
