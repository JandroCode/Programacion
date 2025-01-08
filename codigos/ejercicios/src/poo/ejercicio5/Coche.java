package poo.ejercicio5;

public class Coche  extends Vehiculo{
    // Atributo adicional específico para Coche
    private int numeroDePuertas;

    // Constructor de la clase Coche
    public Coche(String marca, String modelo, double velocidadMaxima, int numeroDePuertas) {
        super(marca, modelo, velocidadMaxima); // Llamada al constructor de la clase base
        this.numeroDePuertas = numeroDePuertas;
    }

    // Sobrecarga del método mostrarInfo() para mostrar información adicional de Coche
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la clase base
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}
