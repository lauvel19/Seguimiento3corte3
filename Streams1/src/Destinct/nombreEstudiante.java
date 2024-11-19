package Destinct;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class nombreEstudiante {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Juan", "Matemáticas"),
                new Estudiante("María", "Historia"),
                new Estudiante("Juan", "Matemáticas"), // Duplicado
                new Estudiante("Ana", "Ciencias"),
                new Estudiante("María", "Historia") // Duplicado
        );

        List<Estudiante> estudiantesUnicos = estudiantes.stream()
                .distinct()
                .collect(Collectors.toList());

        estudiantesUnicos.forEach(System.out::println);
    }
}

