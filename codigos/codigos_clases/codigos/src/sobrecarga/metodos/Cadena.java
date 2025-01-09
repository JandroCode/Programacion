package sobrecarga.metodos;

public class Cadena {

    public static void main(String[] args) {


        //length()
        // Devuelve la longitud de la cadena.

        String saludo = "Hola Mundo";
        int longitud = saludo.length(); // 10
        System.out.println("La longitud de la cadena es " + longitud);

        //charAt(int index)
        //Devuelve el carácter en la posición especificada (índice) de la cadena.
        char caracter =  saludo.charAt(2);
        System.out.println("El caracter seleccionado es:" +caracter);

        /*

        substring(int start) y substring(int start, int end)
        Devuelve una nueva cadena que es una subcadena de la original. El primer índice es inclusivo, y el segundo es exclusivo.

         */

        String subcadena1 = saludo.substring(0, 4); // "Hola"
        String subcadena2 = saludo.substring(1);    // "Mundo"
        System.out.println(subcadena1);
        System.out.println(subcadena2);

        /*
        * toLowerCase() y toUpperCase()
         Convierte la cadena a minúsculas o a mayúsculas, respectivamente.
        *
        * */

        String minusculas = saludo.toLowerCase(); // "hola mundo"
        String mayusculas = saludo.toUpperCase(); // "HOLA MUNDO"
        System.out.println(minusculas);
        System.out.println(mayusculas);

        /*
        *    trim()
             Elimina los espacios en blanco al principio y al final de la cadena.

        * */

        String saludoConEspacios = "  Hola Mundo  ";
        System.out.println("Saludo con espacios " + saludoConEspacios);
        String saludoSinEspacios = saludoConEspacios.trim(); // "Hola Mundo"
        System.out.println("Saludo con espacios " + saludoSinEspacios);

        /*

        equals(String otro)
        Compara si dos cadenas son iguales.




        *
        * */

        String str1 = "Holas";
        String str2 = "Hola";
        boolean iguales = str1.equals(str2); // true
        System.out.println(iguales);









    }
}
