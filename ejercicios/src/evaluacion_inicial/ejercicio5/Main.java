package evaluacion_inicial.ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         Crea una aplicación de consola con Java que permita introducir 5 números por consola entre el 1 y el 10
         y que los compare con el número 5. Si se introduce más de una vez el número 5 se debería contar el número
         de veces que se repite (si aparece dos veces se repite 1, si aparece tres se repite dos,...)
         Si no se repite ninguna vez imprimir "El número 5 no se repite";
        */

        int num = 5;
        int numIntroducido;
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Introduce un número");
            numIntroducido = sc.nextInt();{

                if(numIntroducido == num){
                    contador++;
                }
            }

        }

        if(contador == 0 || contador ==1){
            System.out.println("El número 5 no se repite");
        }else{
            System.out.println("El número 5 se repite  " + --contador+" "+"veces");
        }


    }


}
