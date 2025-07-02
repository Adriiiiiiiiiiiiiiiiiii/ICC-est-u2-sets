package Utils;

import java.util.Comparator;
import Models.Contacto;

// Ordena por apellido, luego por nombre
public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        int cmpApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        if (cmpApellido != 0) return cmpApellido;
        return c1.getNombre().compareToIgnoreCase(c2.getNombre());
    }
}
