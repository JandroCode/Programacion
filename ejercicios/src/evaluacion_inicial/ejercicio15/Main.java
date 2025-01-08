package evaluacion_inicial.ejercicio15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaración de variables
        int edad;
        int grupo = 0; // Variable para identificar el grupo
        Scanner teclado = new Scanner(System.in);

        System.out.println("****** BIENVENIDO A ENGLISH SCHOOL ******");
        System.out.println("Ingrese la edad del alumno");
        edad = teclado.nextInt();

        // Normalizar el rango de edades a un identificador único
        if (edad >= 4 && edad <= 6) {
            grupo = 1; // Grupo KINDER
        } else if (edad >= 7 && edad <= 8) {
            grupo = 2; // Grupo 1st year
        } else if (edad >= 9 && edad <= 10) {
            grupo = 3; // Grupo 2nd year
        } else if (edad >= 11 && edad <= 13) {
            grupo = 4; // Grupo 3rd year
        }

        // Usar switch para determinar el mensaje según el grupo
        switch (grupo) {
            case 1:
                System.out.println("El horario del grupo KINDER, es Lunes y Miércoles de 16 a 17hs");
                break;
            case 2:
                System.out.println("El horario del grupo 1st year, es Martes y Jueves de 16:30 a 17:30hs");
                break;
            case 3:
                System.out.println("El horario del grupo 2nd year, es Martes y Jueves de 17:30 a 19hs");
                break;
            case 4:
                System.out.println("El horario del grupo 3rd year, es Lunes y Miércoles de 17 a 18:30hs");
                break;
            default:
                System.out.println("Ingresó una edad que no corresponde");
                break;
        }
    }
}
