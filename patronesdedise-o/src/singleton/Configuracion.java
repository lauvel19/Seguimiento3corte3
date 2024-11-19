package singleton;

public class Configuracion {
    private static Configuracion instancia;
    private String valor;

    private Configuracion() {

        this.valor = "Configuración por defecto";
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
