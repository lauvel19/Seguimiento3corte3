package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class nombrePersona {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Ana", 25),
                new Persona("Luis", 35),
                new Persona("Marta", 28)
        );


        List<String> nombres = personas.stream()
                .map(Persona::getNombre)
                .collect(Collectors.toList());

        System.out.println("Nombres: " + nombres);
    }
}
