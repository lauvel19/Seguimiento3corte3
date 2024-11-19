package Reduce;

import java.util.Arrays;
import java.util.List;
import Collect.Persona;

public class sumaEdad {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Ana", 25),
                new Persona("Luis", 35),
                new Persona("Marta", 28)
        );

        int sumaDeEdades = personas.stream()
                .map(Persona::getEdad)
                .reduce(0, Integer::sum);

        System.out.println("Suma de edades: " + sumaDeEdades);
    }
}

