package poo.ejercicio6;

import java.util.ArrayList;

public class Factura {
    // Lista de productos
    private ArrayList<Producto> productos;

    // Constructor
    public Factura() {
        productos = new ArrayList<>();
    }

    // Método para agregar un producto a la factura
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para calcular el total de la factura
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }

    // Método para mostrar los productos y su precio total
    public void mostrarFactura() {
        System.out.println("Productos en la factura:");
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() +
                    " | Precio: " + producto.getPrecio() +
                    " | Cantidad: " + producto.getCantidad());
        }
        System.out.println("Total de la factura: " + calcularTotal() + " €");
    }
}
