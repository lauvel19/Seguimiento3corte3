package sorted;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import filter.Empleado;

public class ordenNombre{
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Ana", 25,null),
                new Empleado("Luis", 35,null),
                new Empleado("Marta", 28, null)
        );

        List<Empleado> empleadosOrdenados = empleados.stream()
                .sorted(Comparator.comparing(Empleado::getNombre))
                .collect(Collectors.toList());

        empleadosOrdenados.forEach(System.out::println);
    }
}

