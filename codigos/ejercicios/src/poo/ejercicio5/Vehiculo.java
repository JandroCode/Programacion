package poo.ejercicio5;

public class Vehiculo {
    // Atributos comunes
    protected String marca;
    protected String modelo;
    protected double velocidadMaxima;

    // Constructor de la clase Vehiculo
    public Vehiculo(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para mostrar la información básica del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
