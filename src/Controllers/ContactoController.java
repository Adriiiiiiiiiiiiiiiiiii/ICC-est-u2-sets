package Controllers;

import java.util.Set;
import java.util.TreeSet;

import Models.Contacto;
import Utils.ContactoComparator;
import Utils.ContactoComparatorHash;
import Utils.ContactoComparatorNum;


public class ContactoController {
    public ContactoController(){
    System.out.println("------------------|Agenda ordenada por Apellido - Nombre|------------------");
    runTreeContacto();
     System.out.println("------------------|Agenda ordenada por Apellido - Nombre - Telefono|------------------");
    runTreeContacto2();
    System.out.println("------------------|Agenda ordenada por Hash|------------------");
    runTreeContacto3();

    }
    public void runTreeContacto(){
    Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Gonzalez", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
            }
        }

    public void runTreeContacto2(){
    Set<Contacto> agenda2 = new TreeSet<>(new ContactoComparatorNum());

        agenda2.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda2.add(new Contacto("Luis", "Perez", "111111111"));
        agenda2.add(new Contacto("Ana", "Perez", "987654321"));
        agenda2.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda2.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda2.add(new Contacto("Pedro", "Gonzalez", "222222222"));
        agenda2.add(new Contacto("Pablo", "Lopez", "222222222"));
        for (Contacto contacto2 : agenda2) {
            System.out.println(contacto2);
        }


    }
    public void runTreeContacto3(){
        Set<Contacto> agenda3 = new TreeSet<>(new ContactoComparatorHash()); 
        agenda3.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda3.add(new Contacto("Luis", "Perez", "111111111"));
        agenda3.add(new Contacto("Ana", "Perez", "987654321"));
        agenda3.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda3.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda3.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda3.add(new Contacto("Pablo", "Lopez", "222222222"));

        for (Contacto contacto3 : agenda3) {
            System.out.println(contacto3);
        }


    }
    
    
}
