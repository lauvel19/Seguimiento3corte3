package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterVentas {
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Ana", 25, "Ventas"),
                new Empleado("Luis", 35, "Ventas"),
                new Empleado("Pedro", 28, "IT"),
                new Empleado("Marta", 40, "Ventas")
        );

        List<Empleado> mayoresDeVentas = empleados.stream()
                .filter(empleado -> empleado.getEdad() > 30 && empleado.getDepartamento().equals("Ventas"))
                .collect(Collectors.toList());

        mayoresDeVentas.forEach(System.out::println);
    }
}

