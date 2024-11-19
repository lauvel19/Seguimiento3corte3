package forEach;

import java.util.Arrays;
import java.util.List;

public class impuesto {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = Arrays.asList(
                new Vehiculo("Toyota", 20000),
                new Vehiculo("BMW", 40000),
                new Vehiculo("Ford", 30000)
        );

        vehiculos.stream()
                .forEach(vehiculo -> vehiculo.aplicarImpuesto(21));

        vehiculos.forEach(System.out::println);
    }
}
