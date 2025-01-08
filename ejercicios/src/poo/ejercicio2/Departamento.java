package poo.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nombreDepartamento;
    private List<Empleado> empleados;

    // Constructor de la clase Departamento
    public Departamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        this.empleados = new ArrayList<>();
    }

    // Método para agregar un empleado al departamento
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado " + empleado.getNombre() + " agregado al departamento " + nombreDepartamento + ".");
    }

    // Método para mostrar todos los empleados del departamento
    public void mostrarEmpleados() {
        System.out.println("Empleados del departamento " + nombreDepartamento + ":");
        for (Empleado empleado : empleados) {
            empleado.mostrarEmpleado();
        }
    }
}
