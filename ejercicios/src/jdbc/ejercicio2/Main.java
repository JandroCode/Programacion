package jdbc.ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    /*
    Crea una aplicación Java que consulte todos los productos de la tabla productos y los muestre en consola.
     */

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/tienda";
        String usuario = "root";
        String contrasena = "root";

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);

            // Crear la sentencia SQL
            Statement stmt = conexion.createStatement();
            String sql = "SELECT * FROM productos";

            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery(sql);

            // Mostrar los resultados
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int cantidad = rs.getInt("cantidad");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
