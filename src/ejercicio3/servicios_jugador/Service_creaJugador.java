import ejercicio3.Jugador;

public class Service_creaJugador {
    // Clase para crear un jugador
    private Jugador jugadorCreado;

    public Jugador creaUnJugador() {

        System.out.println("ingrese los datos del jugador");
        System.out.println("Aqui se pedirian todos los dato por teclado, utiliando gui interfaz");
        jugadorCreado = new Jugador();
        return jugadorCreado;

    }

}
