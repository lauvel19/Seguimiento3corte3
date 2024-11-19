package factory;

public class Moto implements vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo una moto");
    }
}
