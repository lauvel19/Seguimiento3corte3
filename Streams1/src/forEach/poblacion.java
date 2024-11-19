package forEach;

import java.util.Arrays;
import java.util.List;

public class poblacion {
    public static void main(String[] args) {
        List<Ciudad> ciudades = Arrays.asList(
                new Ciudad("Madrid", 3223000),
                new Ciudad("Barcelona", 1620000),
                new Ciudad("Valencia", 791000),
                new Ciudad("Sevilla", 684000)
        );

        ciudades.stream()
                .filter(ciudad -> ciudad.getPoblacion() > 1000000)
                .forEach(System.out::println);
    }
}
