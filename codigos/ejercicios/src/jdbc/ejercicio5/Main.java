package jdbc.ejercicio5;

import java.util.List;
import java.util.Scanner;

public class Main {
    /*
        Crea una aplicación de consola con Java que conecte a una base de datos de empleados.
        Desde la consola, introduciendo algún término de búsqueda debería listar todos
        los empleados que coincidiese con ese término de búsqueda
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();

        System.out.println("Ingrese las iniciales del nombre de los empleados que desea buscar:");
        String iniciales = scanner.nextLine();

        List<Empleado> empleados = empleadoDAO.buscarPorIniciales(iniciales);

        if (empleados.isEmpty()) {
            System.out.println("No se encontraron empleados con las iniciales proporcionadas.");
        } else {
            System.out.println("Resultados de la búsqueda:");
            System.out.println("---------------------------");
            for (Empleado empleado : empleados) {
                System.out.printf("ID: %d | Nombre: %s | Puesto: %s | Salario: %.2f%n",
                        empleado.getId(), empleado.getNombre(), empleado.getPuesto(), empleado.getSalario());
            }
        }




    }
}
