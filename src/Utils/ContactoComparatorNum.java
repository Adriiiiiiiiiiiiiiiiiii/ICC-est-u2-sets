package Utils;

import java.util.Comparator;
import Models.Contacto;

// Ordena por apellido, nombre, y teléfono (permite duplicados si solo cambia el número)
public class ContactoComparatorNum implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        int cmpApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        if (cmpApellido != 0) return cmpApellido;

        int cmpNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        if (cmpNombre != 0) return cmpNombre;

        return c1.getTelefono().compareToIgnoreCase(c2.getTelefono());
    }
}
