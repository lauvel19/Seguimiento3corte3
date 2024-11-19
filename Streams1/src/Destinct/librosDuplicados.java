package Destinct;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class librosDuplicados {
    public static void main(String[] args) {
        List<Libro> libros = Arrays.asList(
                new Libro("El Quijote", "Miguel de Cervantes"),
                new Libro("Cien Años de Soledad", "Gabriel García Márquez"),
                new Libro("El Quijote", "Miguel de Cervantes"),
                new Libro("Don Juan Tenorio", "José Zorrilla")
        );

        List<Libro> librosUnicos = libros.stream()
                .distinct()
                .collect(Collectors.toList());

        librosUnicos.forEach(System.out::println);
    }
}
