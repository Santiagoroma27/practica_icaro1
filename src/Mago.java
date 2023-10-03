public class Mago extends Personaje {
    private int magia;

    public Mago(int salud, int magia) {
        super(salud);
        this.magia = magia;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    @Override
    public void entrenar() {
        // Los magos no obtienen ningún beneficio al entrenar ... Salvo que estén estudiando, ahí te recomiendo correr.

    }
}
