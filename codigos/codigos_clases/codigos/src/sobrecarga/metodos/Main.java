package sobrecarga.metodos;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {


        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        CalculadoraAreas calculadora = new CalculadoraAreas();
        String opcion = "";


        opcion = JOptionPane.showInputDialog(
                null, // Ventana padre (null para centrar en pantalla)
                "Seleccione una figura geométrica:\n1.- Cuadrado\n2.- Rectángulo\n3.- Círculo", // Mensaje
                "Selector de Figuras", // Título de la ventana
                JOptionPane.QUESTION_MESSAGE // Tipo de ventana
        );


        switch (opcion){
            case "1":
                double lado = Double.parseDouble(JOptionPane.showInputDialog("Cuanto mide el lado del cuadrado"));
                JOptionPane.showMessageDialog(null, "El área del cuadrado es " + decimalFormat.format(calculadora.calcularArea(lado)));

                break;
            case "2":
                double base = Double.parseDouble(JOptionPane.showInputDialog("Cuanto mide la base del del rectángulo"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Cuanto mide la altura del del rectángulo"));
                JOptionPane.showMessageDialog(null, "El área del rectángulo es " + calculadora.calcularArea(base,altura));
                break;

            case "3":
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Cuanto mide el radio del círculo"));
                JOptionPane.showMessageDialog(null, "El área del círculos  es " + decimalFormat.format(calculadora.calcularArea(radio, true)));
                break;

        }



    }
}
