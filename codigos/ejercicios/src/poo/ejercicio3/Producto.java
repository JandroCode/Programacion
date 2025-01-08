package poo.ejercicio3;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidadStock;

    // Constructor de la clase Producto
    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    // Método para mostrar la información del producto
    public void mostrarInfoProducto() {
        System.out.println("Producto: " + nombre + ", Precio: " + precio + "€, Stock: " + cantidadStock);
    }

    // Método para disminuir el stock de un producto
    public void disminuirStock(int cantidad) {
        if (cantidad <= cantidadStock) {
            cantidadStock -= cantidad;
            System.out.println("Se han comprado " + cantidad + " unidades de " + nombre + ".");
        } else {
            System.out.println("No hay suficiente stock de " + nombre + ".");
        }
    }


}
