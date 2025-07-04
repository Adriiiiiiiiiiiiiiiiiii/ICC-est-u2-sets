package Controllers;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class Ejercicios {

    public Ejercicios() {
        System.out.println(tieneDuplicados(new int[] {1, 2, 3, 4, 5}));
        System.out.println(tieneDuplicados(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 45}));
    }

    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> numerosNoDuplicados = new TreeSet<>();
        for (int num : numeros) {
            if (!numerosNoDuplicados.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean esIsograma(String palabra) {
        Set<Character> letras = new HashSet<>();
        palabra = palabra.toLowerCase();
        for (char c : palabra.toCharArray()) {
            if (!letras.add(c)) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
    public int contarPalabrasUnicas(String frase) {
    Set<String> palabrasUnicas = new TreeSet<>();
    String[] palabras = frase.split(" ");

    for (String palabra : palabras) {
        if (!palabra.isEmpty()) {
            palabrasUnicas.add(palabra);
        }
    }

    return palabrasUnicas.size();
    }
    public void compararTextos(String texto1, String texto2) {
    // Paso 1: obtener sets de palabras únicas para cada texto
    Set<String> palabrasTexto1 = new TreeSet<>();
    for (String palabra : texto1.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "").split(" ")) {
        if (!palabra.equals("")) palabrasTexto1.add(palabra);
    }
    
    Set<String> palabrasTexto2 = new TreeSet<>();
    for (String palabra : texto2.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "").split(" ")) {
        if (!palabra.equals("")) palabrasTexto2.add(palabra);
    }
    
    // Paso 2: copia de palabrasTexto1 para calcular intersección
    Set<String> palabrasComunes = new TreeSet<>(palabrasTexto1);
    palabrasComunes.retainAll(palabrasTexto2); // solo las que están en ambos sets
    
    // Paso 3: palabras solo en texto 1
    Set<String> soloTexto1 = new TreeSet<>(palabrasTexto1);
    soloTexto1.removeAll(palabrasTexto2);
    
    // Paso 4: palabras solo en texto 2
    Set<String> soloTexto2 = new TreeSet<>(palabrasTexto2);
    soloTexto2.removeAll(palabrasTexto1);
    
    // Paso 5: calcular coincidencia léxica (porcentaje)
    double coincidencia = (double) palabrasComunes.size() / palabrasTexto1.size() * 100;
    
    // Imprimir resultado
    System.out.printf("Texto 1: %d palabras únicas, Texto 2: %d palabras únicas, Cuantas palabras comunes: %d, Coincidencia léxica: %.2f%%\n",
        palabrasTexto1.size(), palabrasTexto2.size(), palabrasComunes.size(), coincidencia);
    
    System.out.println("Solo en texto 1: " + soloTexto1);
    System.out.println("Solo en texto 2: " + soloTexto2);
}
}
