package forEach;

public class Vehiculo {
    private String marca;
    private double precio;

    public Vehiculo(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void aplicarImpuesto(double porcentaje) {
        this.precio += this.precio * (porcentaje / 100);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}

