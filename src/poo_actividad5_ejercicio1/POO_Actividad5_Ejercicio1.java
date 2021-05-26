package poo_actividad5_ejercicio1;

import java.util.Scanner;

/**
 * @author Santiago Reynoso
 */
public class POO_Actividad5_Ejercicio1 {

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A, B;
        try {
            System.out.println("Primer numero");
            A = in.nextInt();
            System.out.println("Segundo numero");
            B = in.nextInt();

            System.out.println("El resultado: " + dividir(A, B));
        } catch (Exception e) {
            System.out.println("Es imposible dividir por '0' ");
        }
        //PODRIA PONER 2 CATCH, 1 PARA CUANDO SE DIVIDE POR 0 Y OTRO PARA CUANDO SE INGRESA UN VALOR INCORRECTO, pero no se como.
    }
}
