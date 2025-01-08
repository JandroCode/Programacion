public class Metodos {

    // Métodos sin retorno

    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        metodos.suma();
        System.out.println("El resultado de la resta: "+metodos.resta());
        metodos.multiplicacion(5,6);
        System.out.println("El resultado de la división es " + metodos.division(10,5));

        System.out.println(" ------------------------------------------ ");
        metodos.cuentaAtras(6);
        System.out.println(" ------------------------------------------ ");
        metodos.contarPalabras("Hola",7);



    }

    // Sin parámetros y sin retorno
    public void suma(){
        int resultado = 5+6;
        System.out.println("El resultado de la suma: " + resultado);
    }

    // Sin parámetros y con retorno
    public int resta(){
        int resta = 210 -10;
        return resta;
    }

    // Con parámetros y sin retorno
    public void multiplicacion(int num1, int num2){
        int resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    // Con parámetros y con retorno
    public int division(int num1, int num2){
        int resultado = num1 / num2;
        return resultado;
    }

    // Métodos recursivos
    public  void cuentaAtras(int numero){
        if(numero == 0){
            return;   // cuando el número llaga a 0 nos salimos del programa
        }

        System.out.print(numero+" ");

        cuentaAtras(numero-1);

        // cada vez que se llama al método el numero disminuye en una unidad
    }


    public void contarPalabras(String palabra, int numVeces){

        if(numVeces == 0){
            return;
        }

        System.out.println(palabra);
        contarPalabras(palabra, numVeces -1);


    }







}
