package Ejemplo_02;

public class Vehiculo {
    String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println("🔑 El vehículo " + marca + " está encendido.");
    }
}
