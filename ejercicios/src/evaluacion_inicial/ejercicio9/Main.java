package evaluacion_inicial.ejercicio9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

           /* Realizar un programa que dado por teclado un límite numérico (por ejemplo 100)
            muestre en pantalla todos los números hasta ese límite (empezando por 1).
            */

        int numero;
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese por teclado el límite");
        numero = teclado.nextInt();

        for (int i=0; i<numero;i++) {
            System.out.print(i+1 + " ");
        }


    }
}
