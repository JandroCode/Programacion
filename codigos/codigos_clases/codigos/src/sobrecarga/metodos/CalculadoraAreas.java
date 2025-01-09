package sobrecarga.metodos;

public class CalculadoraAreas {


    // Método para calcular el área de un cuadrado (lado * lado)
    public double calcularArea(double lado) {
        return lado * lado;
    }

    // Sobrecarga: Método para calcular el área de un rectángulo (base * altura)
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Sobrecarga: Método para calcular el área de un círculo (π * radio^2)
    public double calcularArea(double radio, boolean esCirculo) {
        return Math.PI * radio * radio;
    }



}


