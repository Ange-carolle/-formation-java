package tp05_heritage;

public class VoitureElectrique extends Voiture{
    private int autonomieBatterie;

    public VoitureElectrique(String marque, String modele, int annee, int nombrePortes, int autonomieBatterie){
        super(marque, modele, annee, nombrePortes);
        this.autonomieBatterie = autonomieBatterie;
    }

    public  void  recharger(){
        //
    }

    @Override
    public void demarrer() {
        super.demarrer();
        System.out.println("Je démarre comme une viture éléctrique");
    }
}
