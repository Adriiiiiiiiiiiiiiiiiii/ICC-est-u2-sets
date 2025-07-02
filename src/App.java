import java.util.Set;

import Controllers.ContactoController;
import Controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {

        ContactoController contacto = new ContactoController();
        Sets sets= new Sets();
        /*runHashSet(sets);
        runLinkedHashSet(sets);
        runLinkedTreeSet(sets);
        runLinkedTreeSetCompaere(sets);
        runLinkedTreeSetCompaere2(sets);*/
        contacto.runTreeContacto();
    }
        public static void runHashSet(Sets sets){
        Set<String> palabras= sets.contruirHashSet();
        System.out.println();
        System.out.println("---------|HashSet|---------");
        for (String palabra : palabras) {
            System.out.println(palabra);
            }
        }
        public static void runLinkedHashSet(Sets sets){
        Set<String> palabras2= sets.construirLinkedHashSet();
        System.out.println("---------|LinkedHashSet|---------");
        for (String palabra : palabras2) {
            System.out.println(palabra);
        }

    }
     public static void runLinkedTreeSet(Sets sets){
        Set<String> palabras3= sets.contruirTreeSet();
        System.out.println("---------|TreeSet|---------");
        for (String palabra : palabras3) {
            System.out.println(palabra);
        }
        
    }
    public static void runLinkedTreeSetCompaere(Sets sets){
        Set<String> palabras4= sets.contruirTreeSetConComparador();
        System.out.println("---------|LinkedTreeSetComparador|---------");
        for (String palabra : palabras4) {
            System.out.println(palabra);
        }
    }
       public static void runLinkedTreeSetCompaere2(Sets sets){
        Set<String> palabras5= sets.contruirTreeSetConComparador2();
        System.out.println("---------|LinkedTreeSetComparador2|---------");
        for (String palabra : palabras5) {
            System.out.println(palabra);
        }
    }
        
}
