package tp05_heritage;

public abstract sealed class Forme permits Cercle, Rectangle, Triangle {
    protected String couleur;
    public Forme(String couleur) {
        this.couleur = couleur;
    }
    public abstract double calculerAire();
}
