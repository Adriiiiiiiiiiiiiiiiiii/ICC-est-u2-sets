import java.util.Set;

import Controllers.ContactoController;
import Controllers.Ejercicios;
import Controllers.Sets;

public class App {
        public static void main(String[] args) throws Exception {
        String textoo1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String textoo2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        String frase = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";
        ContactoController contacto = new ContactoController();
        System.out.println();
        System.out.println("-------------------|Ejercicio 1|-------------------");

        Sets sets= new Sets();
        Ejercicios ejercicios= new Ejercicios();
        System.out.println("-------------------|Ejercicio 2|-------------------");
        System.out.println("Cantidad de palabras unicas");
        System.out.println(ejercicios.contarPalabrasUnicas(frase));
        System.out.println("-------------------|Ejercicio 3|-------------------");
        System.out.println("murcielago");
        String texto="murcielago";
        ejercicios.esIsograma(texto);
        System.out.println("camaleon");

        String texto2="camaleon";
        ejercicios.esIsograma(texto2);
        System.out.println("-------------------|Ejercicio 4|-------------------");
        ejercicios.compararTextos(textoo1, textoo2);
        /*runHashSet(sets);
        runLinkedHashSet(sets);
        runLinkedTreeSet(sets);
        runLinkedTreeSetCompaere(sets);
        runLinkedTreeSetCompaere2(sets);*/
        //contacto.runTreeContacto();
    }
        public static void runHashSet(Sets sets){
        Set<String> palabras= sets.contruirHashSet();
        //System.out.println();
        //System.out.println("---------|HashSet|---------");
        for (String palabra : palabras) {
            System.out.println(palabra);
            }
        }
        public static void runLinkedHashSet(Sets sets){
        Set<String> palabras2= sets.construirLinkedHashSet();
       //  System.out.println("---------|LinkedHashSet|---------");
        for (String palabra : palabras2) {
            System.out.println(palabra);
        }

    }
     public static void runLinkedTreeSet(Sets sets){
        Set<String> palabras3= sets.contruirTreeSet();
     //    System.out.println("---------|TreeSet|---------");
        for (String palabra : palabras3) {
            System.out.println(palabra);
        }
        
    }
    public static void runLinkedTreeSetCompaere(Sets sets){
        Set<String> palabras4= sets.contruirTreeSetConComparador();
       //  System.out.println("---------|LinkedTreeSetComparador|---------");
        for (String palabra : palabras4) {
            System.out.println(palabra);
        }
    }
       public static void runLinkedTreeSetCompaere2(Sets sets){
        Set<String> palabras5= sets.contruirTreeSetConComparador2();
    //     System.out.println("---------|LinkedTreeSetComparador2|---------");
        for (String palabra : palabras5) {
            System.out.println(palabra);
        }
    }
        
}
