package poo.ejercicio3;

public class Main {

    /*
rea una clase Producto que represente un producto en una tienda online. Debe tener:

Atributos:
nombre (String)
precio (double)
cantidadStock (int)
Métodos:
disminuirStock(int cantidad) que disminuya la cantidad en stock.
aumentarStock(int cantidad) que aumente la cantidad en stock.
mostrarInfoProducto() que muestre el nombre, precio y stock del producto.

Crea una clase CarritoDeCompras que permita agregar y eliminar productos, y calcule el total de la compra. Luego, en una clase Main, crea productos y agrega a un carrito.



     */

    public static void main(String[] args) {

        // Crear productos
        Producto prod1 = new Producto("Hilo Rojo", 5.99, 50);
        Producto prod2 = new Producto("Aguja", 2.49, 30);
        Producto prod3 = new Producto("Botones", 1.99, 100);

        // Crear el carrito de compras
        CarritoCompras carrito = new CarritoCompras();


        // Agregar productos al carrito
        carrito.agregarProducto(prod1, 5);  // 5 unidades de Hilo Rojo
        carrito.agregarProducto(prod2, 2);  // 2 unidades de Aguja
        carrito.agregarProducto(prod3, 3);  // 3 unidades de Botones

        // Mostrar productos en el carrito
        carrito.mostrarProductosEnCarrito();

        // Calcular y mostrar el total de la compra
        double total = carrito.calcularTotal();

    }
}
