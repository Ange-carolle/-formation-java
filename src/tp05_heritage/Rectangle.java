package tp05_heritage;

public final class Rectangle extends Forme {
    private double longueur;
    private double largeur;

    public Rectangle(String couleur, double longueur, double largeur){
        super(couleur);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerAire() {
        return (longueur * largeur);
    }
}
