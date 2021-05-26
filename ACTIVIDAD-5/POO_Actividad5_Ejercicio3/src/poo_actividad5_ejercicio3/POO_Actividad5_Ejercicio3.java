package poo_actividad5_ejercicio3;

import java.util.Scanner;

/**
 * @author Santy Reynoso
 */
public class POO_Actividad5_Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataBag db = new DataBag();
        int num;
        boolean test = false;

        do {
            System.out.println("\n" + "¿Que accione decea realizar?  -(Ingrece el numero correspondiente)-");
            System.out.println("- (0) ||Agregar elemento|| "
                    + "\n" + "- (1) ||Eliminar Elemento|| "
                    + "\n" + "- (Cualquier numero) ||No hacer nada||");
            num = in.nextInt();

            if (num == 0) {
                System.out.println("\n" + "¿Que decea Agregar?");
                db.add();
            } else {
                if (num == 1) {
                    System.out.println("\n" + "Eliminado ultimo elemento");
                    db.remove();
                } else {
                    System.out.println("\n" + "No se realizo ninguna opcion");
                    test = true;
                }
            }
        } while (test != true);
    }

}
