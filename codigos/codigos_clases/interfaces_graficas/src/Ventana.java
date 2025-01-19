import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana  extends JFrame {


    // Componentes de la interfaz
    private JTextField campoNumero1;
    private JTextField campoNumero2;
    private JTextArea areaResultado;
    private JLabel etiquetaNumero1;
    private JLabel etiquetaNumero2;
    private JButton botonCalcular;

    public Ventana(){

        // Configuración básica de la ventana
        setTitle("Calculadora de Suma");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Crear y configurar el panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        colocarComponentes(panel);
    }

    private void colocarComponentes(JPanel panel){

        // Dimensiones del panel
        int anchoPanel = 400;
        int anchoEtiqueta = 100;
        int altoEtiqueta = 25;

        // Etiqueta para el primer número
        etiquetaNumero1 = new JLabel("Número 1:");
        etiquetaNumero1.setBounds(50, 50, anchoEtiqueta, altoEtiqueta);
        panel.add(etiquetaNumero1);

        // Campo de texto para el primer número
        campoNumero1 = new JTextField();
        campoNumero1.setBounds(150, 50, 150, 25);
        panel.add(campoNumero1);

        // Etiqueta para el segundo número
        etiquetaNumero2 = new JLabel("Número 2:");
        etiquetaNumero2.setBounds(50, 100, anchoEtiqueta, altoEtiqueta);
        panel.add(etiquetaNumero2);

        // Campo de texto para el segundo número
        campoNumero2 = new JTextField();
        campoNumero2.setBounds(150, 100, 150, 25);
        panel.add(campoNumero2);


        // Botón para calcular la suma
        botonCalcular = new JButton("Calcular");
        botonCalcular.setBounds(150, 150, 150, 30);
        panel.add(botonCalcular);

        // JTextArea para mostrar el resultado (solo lectura)
        areaResultado = new JTextArea();
        areaResultado.setBounds(150, 200, 150, 50);
        areaResultado.setEditable(false); // No permite escribir en él

        Font nuevaFuente = new Font("Arial", Font.BOLD, 20); // Fuente Arial, estilo negrita, tamaño 20
        areaResultado.setFont(nuevaFuente);


        panel.add(areaResultado);


        botonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumar(e);
            }
        });

    }


    public void sumar(ActionEvent e){
        try{
            // Obtener los números ingresados
            double numero1 = Double.parseDouble(campoNumero1.getText());
            double numero2 = Double.parseDouble(campoNumero2.getText());

            System.out.println(numero1 +" "+numero2);
            double suma = numero1+numero2;

            areaResultado.setText(String.valueOf(suma));

        }catch (NumberFormatException ex){
            System.out.println("Error en la introducción de datos " + ex.getCause().getMessage());
        }
    }
}
