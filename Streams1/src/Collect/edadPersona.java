package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class edadPersona {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Ana", 25),
                new Persona("Luis", 35),
                new Persona("Marta", 25),
                new Persona("Carlos", 35),
                new Persona("María", 28)
        );

        Map<Integer, List<Persona>> personasPorEdad = personas.stream()
                .collect(Collectors.groupingBy(Persona::getEdad));

        personasPorEdad.forEach((edad, grupo) -> {
            System.out.println("Edad: " + edad);
            grupo.forEach(System.out::println);
        });
    }
}

