package tp05_heritage;

public class Aigle extends Oiseau{
    private  int vitesseMax;
    public Aigle (String nom, int age, double envergure, int vitesseMax){
        super(nom, age, envergure);
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void voler() {
        super.voler();
        System.out.println(" à " + vitesseMax + " km/h");
    }

    @Override
    public void manger() {
        super.manger();
    }
}
