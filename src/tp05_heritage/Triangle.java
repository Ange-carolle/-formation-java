package tp05_heritage;

public final class Triangle extends Forme {
    private double base;
    private double hauteur;

    public Triangle(String couleur, double base, double hauteur){
        super(couleur);
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public double calculerAire() {
        return (base * hauteur)/2;
    }
}
