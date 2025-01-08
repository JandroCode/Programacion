package poo.ejercicio4;

public class Libro {

    private String titulo;
    private String autor;
    private double precio;

    // Constructor de la clase Libro
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    // Método para mostrar la información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Precio: " + precio + "€");
    }

    // Método para aplicar un descuento al precio del libro
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0) {
            precio -= precio * (porcentaje / 100);
            System.out.println("Descuento aplicado. El nuevo precio es: " + precio + "€");
        } else {
            System.out.println("El porcentaje de descuento debe ser positivo.");
        }
    }


}
