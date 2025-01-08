package evaluacion_inicial.ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         *   Crea un programa con Java que pida tres nombres por consola y los
         *   imprima en una misma línea (Cada nombre separado por un espacio en blanco)
         */

        // Declaro dos variables de tipo cadena de texto para almacenar los dos nombres
        String nombreUno,nombreDos;


        // Creo un Scanner para la entrada de datos por consola
        Scanner entradaPorConsola = new Scanner(System.in);

        // Le informo al usuario de la aplicación de lo que tiene que hacer
        System.out.println("Introduzca un nombre");
        // Almaceno el valor introducido por el usuario en la primera variable
        nombreUno = entradaPorConsola.next();

        // Le informo al usuario de la aplicación de lo que tiene que hacer
        System.out.println("Introduzca otro nombre");
        // Almaceno el valor introducido por el usuario en la segunda variable
        nombreDos = entradaPorConsola.next();

        // Imprimo las variables por consola separadas por un espacio en blanco
        System.out.println(nombreUno+" "+ nombreDos);

    }
}
