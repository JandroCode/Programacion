package poo.ejercicio2;

public class Main {

    /*
    Crea una clase Empleado con los siguientes atributos y métodos:

    Atributos:
    nombre (String)
    salario (double)
    Métodos:
    aumentarSalario(double porcentaje) que aumente el salario según el porcentaje proporcionado.
    mostrarEmpleado() que muestre el nombre y el salario del empleado.
    Crea una clase Departamento con los siguientes atributos y métodos:

    Atributos:
    nombreDepartamento (String)
    empleados (ArrayList de objetos Empleado)
    Métodos:
    agregarEmpleado(Empleado empleado) que agregue un empleado al departamento.
    mostrarEmpleados() que muestre todos los empleados del departamento.

    Crea una clase Main donde puedas crear objetos Empleado y Departamento y agregar empleados a diferentes departamentos
     */

    public static void main(String[] args) {
        // Crear empleados
        Empleado emp1 = new Empleado("Juan Pérez", 1500);
        Empleado emp2 = new Empleado("María García", 1800);
        Empleado emp3 = new Empleado("Carlos Sánchez", 2000);

        // Crear un departamento
        Departamento departamento = new Departamento("Recursos Humanos");

        // Agregar empleados al departamento
        departamento.agregarEmpleado(emp1);
        departamento.agregarEmpleado(emp2);
        departamento.agregarEmpleado(emp3);

        // Mostrar todos los empleados del departamento
        departamento.mostrarEmpleados();

        // Aumentar el salario de un empleado
        emp1.aumentarSalario(10);  // Aumentar salario de Juan Pérez en un 10%

        // Mostrar los empleados después del aumento de salario
        System.out.println("\nDespués del aumento de salario:");
        departamento.mostrarEmpleados();
    }
}
