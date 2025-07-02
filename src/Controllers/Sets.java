package Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Sets () {
        
    }
    public static Set<String> contruirHashSet(){
        Set<String> palabras= new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }
    public static  Set<String> construirLinkedHashSet(){
        Set<String> palabras2= new LinkedHashSet<>();
        palabras2.add("Laptop");
        palabras2.add("Manzana");
        palabras2.add("Pera");
        palabras2.add("Celular");
        palabras2.add("Laptop");
        palabras2.add("Celular");
        return palabras2;
    }
     public static Set<String> contruirTreeSet(){
        Set<String> palabras3= new TreeSet<>();
        palabras3.add("Laptop");
        palabras3.add("Manzana");
        palabras3.add("Pera");
        palabras3.add("Celular");
        palabras3.add("Laptop");
        palabras3.add("Celular");
        return palabras3;
    }
    public static Set<String> contruirTreeSetConComparador(){
        //Implementacion de Comparator, para comparacion especifica
        Comparator<String>comparador = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                //PRimero comparamos por la longitud.
                int result= Integer.compare(s1.length(), s2.length());
                //Si son igual tamaño, comparo alfabeticamente
                if(result==0){
                    return result=s1.compareTo(s2);           
                }
                return result;
            }
            
        };

        Set<String> miTreeSetComparador= new TreeSet<>(comparador);
        miTreeSetComparador.add("Laptop");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Celular");
        miTreeSetComparador.add("Laptop");
        miTreeSetComparador.add("celular");
        miTreeSetComparador.add("Celulas");

        return miTreeSetComparador;
    }
    public static Set<String> contruirTreeSetConComparador2(){
    Comparator<String> comparador = new Comparator<String>(){
        @Override
        public int compare(String s1, String s2) {
            // Primero comparo por longitud DESCENDENTE
            int result = Integer.compare(s2.length(), s1.length()); // nota s2, s1 para descendente

            // Si la longitud es igual, comparo alfabéticamente ASCENDENTE
            if(result == 0){
                return s1.compareTo(s2);
            }
            return result;
        }
    };

    Set<String> miTreeSetComparador2 = new TreeSet<>(comparador);
    miTreeSetComparador2.add("Laptop");
    miTreeSetComparador2.add("Manzana");
    miTreeSetComparador2.add("Pera");
    miTreeSetComparador2.add("Celular");
    miTreeSetComparador2.add("Laptop");
    miTreeSetComparador2.add("Celular");
    miTreeSetComparador2.add("Celulas");

    return miTreeSetComparador2;
}
}
