package filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterProductos {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Manzana", 10),
                new Producto("Libro", 25),
                new Producto("Camiseta", 30)
        );

        List<Producto> productosCaros = productos.stream()
                .filter(producto -> producto.getPrecio() > 20)
                .collect(Collectors.toList());

        productosCaros.forEach(System.out::println);
    }
}
