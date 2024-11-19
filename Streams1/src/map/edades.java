package map;
import filter.Empleado;
import filter.Producto;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class edades {
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Ana", 25, "Ventas"),
                new Empleado("Luis", 35, "IT"),
                new Empleado("Marta", 28, "Finanzas")
        );

        List<Integer> edadesFuturas = empleados.stream()
                .map(empleado -> empleado.getEdad() + 10)
                .collect(Collectors.toList());

        edadesFuturas.forEach(System.out::println);
    }
}
