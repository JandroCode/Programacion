package poo.ejercicio1;

public class CuentaBancaria {

    // Atributos de la clase
    private String titular;
    private double saldo;

    // Constructor de la clase
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para obtener el titular
    public String getTitular() {
        return titular;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado " + cantidad + "€.");
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Se han retirado " + cantidad + "€.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    // Método para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("El saldo actual de la cuenta de " + titular + " es: " + saldo + "€.");
    }

    // Método para transferir dinero a otra cuenta
    public void transferir(CuentaBancaria cuentaDestino, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            cuentaDestino.depositar(cantidad);
            System.out.println("Se han transferido " + cantidad + "€ a la cuenta de " + cuentaDestino.getTitular() + ".");
        } else {
            System.out.println("No se puede realizar la transferencia. Verifique el saldo y la cantidad.");
        }
    }



}
