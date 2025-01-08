package jdbc.ejercicio4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

    /*
        Crea una aplicación Java que elimine un producto de la tabla productos en la base de datos tienda.
        El id del producto debe ser ingresado por el usuario.
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
            System.out.print("ID del producto a eliminar: ");
            int id = scanner.nextInt();

            // Sentencia SQL para eliminar el producto
            String sql = "DELETE FROM productos WHERE id = ?";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setInt(1, id);

            // Ejecutar la eliminación
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Producto eliminado con éxito");
            } else {
                System.out.println("No se encontró el producto con ID " + id);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
