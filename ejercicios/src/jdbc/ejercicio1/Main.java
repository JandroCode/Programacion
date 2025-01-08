package jdbc.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

    /*
       Crea una aplicación Java que inserte un producto en la tabla productos de la base de datos tienda.
       Los datos del producto (nombre, precio, cantidad) deben ser ingresados por el usuario.
     */



        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/tienda_swing";
            String usuario = "root";
            String contrasena = "";
            Scanner scanner = new Scanner(System.in);

            try {
                // Establecer la conexión
                Connection conexion = DriverManager.getConnection(url, usuario, contrasena);

                // Pedir datos al usuario
                System.out.print("Nombre del producto: ");
                String nombre = scanner.nextLine();
                System.out.print("Precio del producto: ");
                double precio = scanner.nextDouble();
                System.out.print("Cantidad del producto: ");
                int cantidad = scanner.nextInt();

                // Sentencia SQL para insertar
                String sql = "INSERT INTO productos (nombre, precio, cantidad) VALUES (?, ?, ?)";
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setString(1, nombre);
                stmt.setDouble(2, precio);
                stmt.setInt(3, cantidad);

                // Ejecutar la inserción
                stmt.executeUpdate();
                System.out.println("Producto insertado con éxito");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }

