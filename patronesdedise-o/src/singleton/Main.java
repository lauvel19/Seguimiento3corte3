package singleton;

public class Main {
    public static void main(String[] args) {
        Configuracion config1 = Configuracion.getInstancia();
        System.out.println("Config 1: " + config1.getValor());

        Configuracion config2 = Configuracion.getInstancia();
        config2.setValor("Nueva configuración");
        System.out.println("Config 1 después del cambio: " + config1.getValor());
    }
}

