package map;

import filter.Producto;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class obtenerNombres {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Manzana", 10),
                new Producto("Libro", 25),
                new Producto("Camiseta", 30)
        );

        List<String> nombresDeProductos = productos.stream()
                .map(Producto::getNombre)
                .collect(Collectors.toList());

        nombresDeProductos.forEach(System.out::println);
    }
}
