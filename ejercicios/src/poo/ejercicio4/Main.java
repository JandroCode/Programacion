package poo.ejercicio4;

public class Main {

    /*

    Crea una clase Libro con los siguientes atributos:

    Atributos:
    titulo (String)
    autor (String)
    precio (double)
    Métodos:
    mostrarInfo() que muestre el título, autor y precio del libro.
    aplicarDescuento(double porcentaje) que aplique un descuento al precio del libro.

    Crea una clase Biblioteca que contenga una lista de libros y que permita agregar y eliminar libros, así como buscar libros por autor.
     */

    public static void main(String[] args) {
// Crear libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 19.99);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 15.99);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", 9.99);

        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrar todos los libros en la biblioteca
        biblioteca.mostrarLibros();

        // Aplicar descuento al primer libro
        libro1.aplicarDescuento(10);  // Aplicar un 10% de descuento al libro "Cien años de soledad"

        // Buscar libros por autor
        biblioteca.buscarPorAutor("Miguel de Cervantes");

        // Eliminar un libro de la biblioteca
        biblioteca.eliminarLibro("El Principito");

        // Mostrar nuevamente los libros después de eliminar uno
        biblioteca.mostrarLibros();
    }
}
