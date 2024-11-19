package factory;

public class FabricaVehiculos {
    public static vehiculo crearVehiculo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "carro":
                return new carro();
            case "moto":
                return new Moto();
            case "bicicleta":
                return new Bicicleta();
            default:
                throw new IllegalArgumentException("Tipo de vehículo desconocido");
        }
    }
}
