package factory;

public class Main {
    public static void main(String[] args) {
        vehiculo carro = FabricaVehiculos.crearVehiculo("carro");
        carro.conducir();

        vehiculo moto = FabricaVehiculos.crearVehiculo("moto");
        moto.conducir();

        vehiculo bicicleta = FabricaVehiculos.crearVehiculo("bicicleta");
        bicicleta.conducir();
    }
}

