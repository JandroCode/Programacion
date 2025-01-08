package evaluacion_inicial.ejercicio6;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Crea un programa en Java que a través de un menú de opciones se pueda seleccionar entre operaciones de cálculo
             si selecciona 1 estaría eligiendo una suma y si selecciona 2 estaría eligiendo una resta.
             Primero tendrás que pedir al usuario dos números a través de ventanas emergentes (JOptionPane), luego el
             menú de opciones por consola, y el resultado lo mostrarás en una ventana emergente.
         */


        int num1,num2,opcion;

        Scanner sc = new Scanner(System.in);


        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro número"));

        System.out.println("Elija una opción");
        System.out.println("1 - SUMAR");
        System.out.println("2 - RESTAR");

        opcion = sc.nextInt();

        if(opcion == 1){

            JOptionPane.showMessageDialog(null, num1 + num2);

        }else if (opcion == 2){
            JOptionPane.showMessageDialog(null, num1 - num2);
        }







    }
}
