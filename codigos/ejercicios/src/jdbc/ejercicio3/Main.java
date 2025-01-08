package jdbc.ejercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

    /*
        Crea una aplicación Java que consulte todos los productos de la tabla productos y los muestre en consola.
     */

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tienda";
        String usuario = "root";
        String contrasena = "root";
        Scanner scanner = new Scanner(System.in);

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);

            // Pedir datos al usuario
            System.out.print("ID del producto a actualizar: ");
            int id = scanner.nextInt();
            System.out.print("Nuevo precio del producto: ");
            double nuevoPrecio = scanner.nextDouble();

            // Sentencia SQL para actualizar el precio
            String sql = "UPDATE productos SET precio = ? WHERE id = ?";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setDouble(1, nuevoPrecio);
            stmt.setInt(2, id);

            // Ejecutar la actualización
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Producto actualizado con éxito");
            } else {
                System.out.println("No se encontró el producto con ID " + id);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
