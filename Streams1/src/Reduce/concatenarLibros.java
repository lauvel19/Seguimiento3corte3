package Reduce;
import java.util.Arrays;
import java.util.List;
import Destinct.Libro;

public class concatenarLibros {
    public static void main(String[] args) {
        List<Libro> libros = Arrays.asList(
                new Libro("El Quijote", "Miguel De Cervantes"),
                new Libro("Cien Años de Soledad", "Gabo"),
                new Libro("Don Juan Tenorio", "José Zorrilla")
        );


        String titulosConcatenados = libros.stream()
                .map(Libro::getTitulo)
                .reduce("", (acumulador, titulo) -> acumulador + (acumulador.isEmpty() ? "" : ", ") + titulo);

        System.out.println("Títulos concatenados: " + titulosConcatenados);
    }
}
