package Observer;

public class Main {
    public static void main(String[] args) {
        Sujeto sistemaNotificaciones = new Sujeto();

        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("María");
        Usuario usuario3 = new Usuario("Carlos");

        sistemaNotificaciones.suscribirse(usuario1);
        sistemaNotificaciones.suscribirse(usuario2);

        sistemaNotificaciones.notificar("¡Nueva alerta de seguridad!");

        sistemaNotificaciones.desuscribirse(usuario1);
        sistemaNotificaciones.suscribirse(usuario3);

        sistemaNotificaciones.notificar("¡Actualización de sistema disponible!");
    }
}
