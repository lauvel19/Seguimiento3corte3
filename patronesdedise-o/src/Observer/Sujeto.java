package Observer;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {
    private List<Observador> observadores = new ArrayList<>();

    public void suscribirse(Observador observador) {
        observadores.add(observador);
    }

    public void desuscribirse(Observador observador) {
        observadores.remove(observador);
    }

    public void notificar(String mensaje) {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }
}
