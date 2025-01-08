package poo.ejercicio5;

public class Moto extends Vehiculo{
    // Atributo adicional específico para Moto
    private String tipoDeManillar;

    // Constructor de la clase Moto
    public Moto(String marca, String modelo, double velocidadMaxima, String tipoDeManillar) {
        super(marca, modelo, velocidadMaxima); // Llamada al constructor de la clase base
        this.tipoDeManillar = tipoDeManillar;
    }

    // Sobrecarga del método mostrarInfo() para mostrar información adicional de Moto
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la clase base
        System.out.println("Tipo de manillar: " + tipoDeManillar);
    }
}
