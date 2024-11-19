package sorted;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import filter.Producto;

public class ordenMenorMayor {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Manzana", 10),
                new Producto("Libro", 25),
                new Producto("Camiseta", 30)
        );

        List<Producto> productosOrdenados = productos.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()))
                .collect(Collectors.toList());

        productosOrdenados.forEach(System.out::println);
    }
}
