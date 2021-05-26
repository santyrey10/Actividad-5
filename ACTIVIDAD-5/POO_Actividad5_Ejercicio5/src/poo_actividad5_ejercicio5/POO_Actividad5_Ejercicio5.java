package poo_actividad5_ejercicio5;

import java.util.Scanner;

/**
 * @author Santy Reynoso
 */
public class POO_Actividad5_Ejercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circulo c = new Circulo();

        System.out.println("Ingrece el Radio");
        c.setRadio(in.nextInt());
        System.out.println("El Area es: "+c.getArea());
        System.out.println("El Area es: "+c.getLongitud());
    }
}
