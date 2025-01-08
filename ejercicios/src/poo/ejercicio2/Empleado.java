package poo.ejercicio2;

public class Empleado {

    private String nombre;
    private double salario;

    // Constructor de la clase Empleado
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Getter para el salario
    public double getSalario() {
        return salario;
    }

    // Método para aumentar el salario
    public void aumentarSalario(double porcentaje) {
        if (porcentaje > 0) {
            salario += salario * (porcentaje / 100);
            System.out.println("El salario de " + nombre + " ha sido aumentado.");
        } else {
            System.out.println("El porcentaje debe ser positivo.");
        }
    }

    // Método para mostrar la información del empleado
    public void mostrarEmpleado() {
        System.out.println("Empleado: " + nombre + ", Salario: " + salario + "€");
    }


}
