package Utils;

import java.util.Comparator;
import Models.Contacto;

public class ContactoComparatorHash implements Comparator<Contacto> {
    public int compare(Contacto c1, Contacto c2) {
    return Integer.compare(c1.getNombre().hashCode(), c2.getNombre().hashCode());
    }
}