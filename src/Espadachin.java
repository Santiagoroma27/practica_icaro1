public class Espadachin extends Personaje {
    private int ataque;

    public Espadachin(int salud, int ataque) {
        super(salud);
        this.ataque = ataque;
    }

    public int getAtaque(){
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override //Anotación personal, eliminar después, en este ejemplo, @Override se utiliza antes del método para sobreescribir.
    public void entrenar() {
        this.ataque +=10; //Esto nos incrementa el ataque en 10 cuando entrene.
    }


}
