package factory;

public class Bicicleta implements vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo una bicicleta");
    }
}
