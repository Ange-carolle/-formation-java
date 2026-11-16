package tp05_heritage;

public final class Cercle extends Forme {
    private double rayon;

    public Cercle(String couleur, double rayon){
        super(couleur);
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return (3.14 * rayon * rayon);
    }
}
