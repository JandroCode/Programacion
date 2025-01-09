package sobrecarga.constructores;

public class Coche {
    private String modelo;
    private String color;
    private int anio;

    // Constructor 1: Solo con el modelo
    public Coche(String modelo) {
        this.modelo = modelo;
        this.color = "Desconocido";  // Valor por defecto
        this.anio = 2025;            // Valor por defecto
        System.out.println("Constructor 1: Coche con modelo: " + modelo);
    }

    // Constructor 2: Con modelo y color
    public Coche(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
        this.anio = 2025;            // Valor por defecto
        System.out.println("Constructor 2: Coche con modelo: " + modelo + " y color: " + color);
    }

    // Constructor 3: Con modelo, color y año
    public Coche(String modelo, String color, int anio) {
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        System.out.println("Constructor 3: Coche con modelo: " + modelo + ", color: " + color + " y año: " + anio);
    }

    // Método para mostrar los detalles del coche
    public void mostrarDetalles() {
        System.out.println("Modelo: " + modelo + ", Color: " + color + ", Año: " + anio);
    }


    public static void main(String[] args) {



        Coche coche1 = new Coche("Tesla"); // Usa el Constructor 1
        coche1.mostrarDetalles();

        Coche coche2 = new Coche("BMW", "Rojo"); // Usa el Constructor 2
        coche2.mostrarDetalles();

        Coche coche3 = new Coche("Audi", "Azul", 2023); // Usa el Constructor 3
        coche3.mostrarDetalles();

    }
}
