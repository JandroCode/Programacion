package poo.ejercicio1;

public class Main {
/*


Crea una clase CuentaBancaria que permita gestionar una cuenta bancaria con las siguientes funcionalidades:

Atributos:
titular (String)
saldo (double)
Métodos:
depositar(double cantidad) que aumente el saldo en la cantidad indicada.
retirar(double cantidad) que reste la cantidad indicada si hay suficiente saldo.
mostrarSaldo() que muestre el saldo actual.
transferir(CuentaBancaria cuentaDestino, double cantidad) que transfiera dinero de una cuenta a otra si hay suficiente saldo.

Realiza una clase Main que simule varias operaciones bancarias entre cuentas.


 */

    public static void main(String[] args) {
        // Crear dos cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 500);
        CuentaBancaria cuenta2 = new CuentaBancaria("María García", 300);

        // Mostrar saldo inicial
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();

        // Realizar un depósito en la cuenta 1
        cuenta1.depositar(200);

        // Realizar una retirada en la cuenta 2
        cuenta2.retirar(50);

        // Transferir dinero de cuenta1 a cuenta2
        cuenta1.transferir(cuenta2, 100);

        // Mostrar el saldo final de ambas cuentas
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();
    }
}
