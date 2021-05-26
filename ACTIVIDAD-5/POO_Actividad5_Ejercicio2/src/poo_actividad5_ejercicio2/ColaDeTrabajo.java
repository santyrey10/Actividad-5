package POO_Actividad5_Ejercicio2;

import java.util.ArrayList;

/**
 * @author Santiago Reynoso
 */
public class ColaDeTrabajo {

    String nombre;
    boolean lista = false;
    ArrayList<Trabajo> colaTrabajos = new ArrayList<Trabajo>();

    public ColaDeTrabajo(String nombre, boolean lista) {

        this.nombre = nombre;
        this.lista = lista;

    }

    public void sacar() throws SinTrabajoEnColaException, NoListaException {

        if (!lista) {
            throw new NoListaException(this.nombre, colaTrabajos.size());
        }
        if (colaTrabajos.isEmpty()) {
            throw new SinTrabajoEnColaException(this.nombre);
        }
        colaTrabajos.remove(colaTrabajos.size() - 1);
    }

    public void agregar(Trabajo t) {

        colaTrabajos.add(t);

    }

    public void setLista(boolean l) {
        this.lista = l;
    }
}
