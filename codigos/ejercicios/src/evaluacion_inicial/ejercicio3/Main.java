package evaluacion_inicial.ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         /*
         Crea un programa en Java que pida un número por consola
         e imprima por consola si el número es par o impar
        */

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número");
        numero = sc.nextInt();

        // Si el resto de dividir el número entre 2 es 0 el número es par, caso contrario impar
        if(numero%2==0){
            System.out.println("El número es par");

        }else{
            System.out.println("El número es impar");
        }


    }
}
