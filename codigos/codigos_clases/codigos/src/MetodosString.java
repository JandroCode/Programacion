public class MetodosString {


    public static void main(String[] args) {


        /*

         length()
         Devuelve la longitud de la cadena (número de caracteres).

         */

        String cadena = "Hola Mundo";
        //System.out.println("Longitud de la cadena:"+cadena.length());


        /*
        charAt(int index)
        Devuelve el carácter en la posición especificada.
         */


        char caracter = cadena.charAt(2);  // devuelve 'l'
        //System.out.println("El caracter devuelto es:"+caracter);

        /*
        substring(int beginIndex)
        Devuelve una subcadena comenzando desde el índice dado hasta el final.
         */


        String substring = cadena.substring(5);  // Devuelve "Mundo"
        //System.out.println("La subcadena devuelta es:"+substring);

        /*
        *toLowerCase()
         Convierte todos los caracteres de la cadena a minúsculas.
         *
        */

        String cadenaEnMinuscualas = cadena.toLowerCase();
        //System.out.println("La cadena convertida a minúsculas es:"+ cadenaEnMinuscualas);

        /*
            trim()
            Elimina los espacios en blanco al principio y al final de la cadena.
            Ejemplo
         */

        String cadenaConEspacios = "  hola   ";

        String cadenaSinEspacios = cadenaConEspacios.trim();  // Devuelve "Hola Mundo"


        System.out.println("Cadena con espacios:" +cadenaConEspacios+"...");
        System.out.println("La cadena sin espacios es:"+cadenaSinEspacios+"...");


        /*
            replace(char oldChar, char newChar)
            Reemplaza todas las ocurrencias del carácter oldChar por newChar.
         */

        String saludo = "Hola Mundo";
        String cadenaReemplazada = saludo.replace('o', 'a');  // Devuelve "Hala Munda"
        System.out.println("Cadena reemplazada:"+cadenaReemplazada);









    }

}
