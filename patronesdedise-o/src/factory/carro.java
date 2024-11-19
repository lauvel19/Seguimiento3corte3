package factory;

public class carro implements vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un carro");
    }
}

