package poo.ejercicio6;

public class Main {
    /*

//        Crea una clase Producto con los atributos:
//
//        nombre (String)
//        precio (double)
//        cantidad (int)
//        Crea una clase Factura que contenga una lista de productos y realice lo siguiente:
//
//        Atributos:
//        productos (ArrayList de objetos Producto)
//        Métodos:
//        agregarProducto(Producto producto) que agregue un producto a la lista.
//        calcularTotal() que calcule y devuelva el total de la factura (precio * cantidad de cada producto).

//        Crea una clase Main que permita crear productos, agregarlos a una factura y calcular el total.


     */

    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("Camiseta", 20.5, 2);
        Producto producto2 = new Producto("Pantalón", 35.0, 1);
        Producto producto3 = new Producto("Zapatos", 50.0, 1);

        // Crear una factura
        Factura factura = new Factura();

        // Agregar productos a la factura
        factura.agregarProducto(producto1);
        factura.agregarProducto(producto2);
        factura.agregarProducto(producto3);

        // Mostrar la factura
        factura.mostrarFactura();
    }

}
