public class JuegoPersonajes {
    public static void main(String[] args) {
        // Instancias de personajes
        Espadachin espadachin = new Espadachin(900, 15000000); // Asigna un valor numérico adecuado al ataque y la salud del guerrero.
        Torre torre = new Torre(120000, 85); // Asigna un valor numérico adecuado al nivel y la salud de la torre
        Mago mago = new Mago(800, 18500); // Asigna un valor numérico adecuado a la magia y la salud del mago.

        // Stats de los personajes originales
        mostrarInformacionPersonajes(espadachin, torre, mago);

        // Entrenan todos menos el magogi
        espadachin.entrenar();
        torre.entrenar();

        // Información después del entrenamiento
        mostrarInformacionPersonajes(espadachin, torre, mago);

        // Figth!
        simularEnfrentamiento(espadachin, torre, mago);
    }

    // Información de los personajes
    public static void mostrarInformacionPersonajes(Espadachin espadachin, Torre torre, Mago mago) {
        System.out.println("Información de los personajes:");
        System.out.println("Espadachín - Salud: " + espadachin.getSalud() + ", Ataque: " + espadachin.getAtaque());
        System.out.println("Torre - Salud: " + torre.getSalud() + ", Nivel: " + torre.getNivel());
        System.out.println("Mago - Salud: " + mago.getSalud() + ", Magia: " + mago.getMagia());
        System.out.println();
    }

    // Enfrentamiento con todos los stats
    public static void simularEnfrentamiento(Espadachin espadachin, Torre torre, Mago mago) {
        System.out.println("Simulación de enfrentamientos:");

        // Comparar fuerzas de ataques
        if (espadachin.getAtaque() > torre.getNivel() && espadachin.getAtaque() > mago.getMagia()) {
            System.out.println("El Espadachín gana el enfrentamiento... Dicen que lo abrió como campera a su oponente");
        } else if (torre.getNivel() > espadachin.getAtaque() && torre.getNivel() > mago.getMagia()) {
            System.out.println("La Torre gana la pelea (Capaz que se derrumbó sobre de su adversario).");
        } else {
            System.out.println("El Mago gana el enfrentamiento, aunque nadie lo cree posible.");
        }
    }
}
