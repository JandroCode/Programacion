package jdbc.ejercicio5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
    public List<Empleado> buscarPorIniciales(String iniciales) {
        List<Empleado> empleados = new ArrayList<>();
        String sql = "SELECT id, nombre, puesto, salario FROM empleados WHERE nombre LIKE ?";

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, iniciales + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Empleado empleado = new Empleado();
                    empleado.setId(rs.getInt("id"));
                    empleado.setNombre(rs.getString("nombre"));
                    empleado.setPuesto(rs.getString("puesto"));
                    empleado.setSalario(rs.getDouble("salario"));
                    empleados.add(empleado);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return empleados;
    }
}
