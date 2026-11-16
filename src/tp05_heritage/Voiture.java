package tp05_heritage;

public class Voiture extends Vehicule{
    private int nombrePortes;

    public Voiture(String marque, String modele, int annee, int nombrePortes){
        super(marque, modele, annee);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démare");
    }

    public void klaxonner(){
        System.out.println("Bip Bip");
    }

}
