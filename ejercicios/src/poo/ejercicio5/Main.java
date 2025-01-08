package poo.ejercicio5;

public class Main {
    /*

        Crea una clase base llamada Vehículo con los siguientes atributos y métodos:

        Atributos:
        marca (String)
        modelo (String)
        velocidadMaxima (double)
        Métodos:
        mostrarInfo() que muestre la marca, modelo y velocidad máxima.
        Luego, crea dos subclases que hereden de Vehículo:

        Coche (con atributo adicional numeroDePuertas)
        Moto (con atributo adicional tipoDeManillar)
        En cada subclase, sobrecarga el método mostrarInfo() para incluir información adicional específica de cada tipo de vehículo.

        Crea una clase Main que cree objetos de tipo Coche y Moto y los muestre.


     */

    public static void main(String[] args) {
        // Crear un objeto Coche
        Coche coche = new Coche("Toyota", "Corolla", 180, 4);

        // Crear un objeto Moto
        Moto moto = new Moto("Yamaha", "MT-09", 200, "Deportivo");

        // Mostrar información del Coche
        System.out.println("Información del Coche:");
        coche.mostrarInfo();

        System.out.println("\n-------------------------------\n");

        // Mostrar información de la Moto
        System.out.println("Información de la Moto:");
        moto.mostrarInfo();

    }
}
