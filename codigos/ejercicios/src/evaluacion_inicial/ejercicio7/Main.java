package evaluacion_inicial.ejercicio7;

public class Main {

    public static void main(String[] args) {
           /*Realizar un programa que muestre en pantalla los números del
        1 al 35 (uno abajo del otro). Utilizar para esto alguna estructura repetitiva.
        */

       /* for (int i=0; i<35;i++) {
            System.out.println(i+1);
        }*/

        int cont = 0;
        while (cont<35) {
            System.out.print(cont+1 + " ");
            cont ++;
        }

    }
}
