package evaluacion_inicial.ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         /*
           Crea un programa con Java que pida dos números por consola y compare dichos números.
           Si ambos número son iguales imprimir
           "Los números son iguales" caso contrario "Los número sos diferentes"
        */

        int num1,num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número");
        num1 = sc.nextInt();

        System.out.println("Introduzca el segundo número");
        num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Los números son iguales");
        }else{
            System.out.println("Los números son diferentes");
        }




    }
}
