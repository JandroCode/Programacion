package evaluacion_inicial.ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         /*
         1.- Crea un programa con Java que pida introducir tres números por consola. Una vez introducidos,
         el programa debería imprimir por la consola el número mayor.
        */

        // Declaro tres variables de tipo entero para almacenar los valores introducidos por la consola
        int num1;
        int num2;
        int num3;



        // Creo un Scanner para poder leer datos de la consola
        Scanner entrada = new Scanner(System.in);

        // Informo al usuario de qué es lo que tiene que hacer en la aplicación
        System.out.println("Introduzca un numero");

        // Almaceno en la primera variable lo introducido por el usuario en la consola
        num1 = entrada.nextInt();

        // Informo al usuario de qué es lo que tiene que hacer en la aplicación
        System.out.println("Introduzca otro numero");
        // Almaceno en la segunda variable lo introducido por el usuario en la consola
        num2 = entrada.nextInt();

        // Informo al usuario de qué es lo que tiene que hacer en la aplicación
        System.out.println("Introduzca otro numero");
        // Almaceno en la tercera variable lo introducido por el usuario en la consola
        num3 = entrada.nextInt();

        // A través de un condicional verifico cuál es el número mayor de los tres
        if(num1 > num2 && num1 > num3){
            System.out.println("El primer número es el mayor ");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("El segundo número es el mayor ");
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("El tercer número es el mayor ");

        }


    }
}
