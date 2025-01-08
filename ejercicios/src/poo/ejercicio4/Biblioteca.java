package poo.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca { private List<Libro> libros;

    // Constructor de la clase Biblioteca
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' agregado a la biblioteca.");
    }

    // Método para eliminar un libro de la biblioteca
    public void eliminarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libros.remove(libro);
                System.out.println("Libro '" + titulo + "' eliminado de la biblioteca.");
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
    }

    // Método para buscar libros por autor
    public void buscarPorAutor(String autor) {
        boolean encontrado = false;
        System.out.println("Libros de autor: " + autor);
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros de " + autor + ".");
        }
    }

    // Método para mostrar todos los libros en la biblioteca
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        } else {
            System.out.println("Lista de libros en la biblioteca:");
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }
}
