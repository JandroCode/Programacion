package poo.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {

    private List<Producto> productos;

    // Constructor de la clase CarritoDeCompras
    public CarritoCompras() {
        productos = new ArrayList<>();
    }

    // Método para agregar un producto al carrito
    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getCantidadStock() >= cantidad) {
            productos.add(producto);
            producto.disminuirStock(cantidad);
            System.out.println(cantidad + " unidades de " + producto.getNombre() + " agregadas al carrito.");
        } else {
            System.out.println("No hay suficiente stock de " + producto.getNombre() + " para agregar al carrito.");
        }
    }

    // Método para calcular el total de la compra
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    // Método para mostrar todos los productos del carrito
    public void mostrarProductosEnCarrito() {
        System.out.println("\nProductos en el carrito:");
        for (Producto producto : productos) {
            producto.mostrarInfoProducto();
        }
    }



}
