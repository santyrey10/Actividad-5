package poo_actividad5_ejercicio3;

import java.util.Scanner;
import java.util.FullDataBagException;
import java.util.EmptyDataBagException;

/**
 * @author Santy Reynoso
 */
public class DataBag {

    String dato;
    String[] bolsa = new String[2];
    int i = 0;
    Scanner in = new Scanner(System.in);

    public void add() {
        try {
            dato = in.next();
            bolsa[i] = dato;
            i++;
        } catch (FullDataBagException e) {
            System.out.println("\n" + "La bolsa esta llena, no se puede agregar.");
        }
    }

    public void remove() {
        try {
            i--;
            bolsa[i] = "-1";

        } catch (EmptyDataBagException e) {
            System.out.println("\n" + "No se puede eliminar, porque no hay nada en la bolsa.");
        }
    }

}
