package tp05_heritage;

public class Moto extends Vehicule{
    private int cylindre;

    public Moto(String marque, String modele, int annee, int cylindre){
        super(marque, modele, annee);
        this.cylindre = cylindre;
    }

    @Override
    public void demarrer() {
        System.out.println("La moto démare avec la clé");
    }

    public void faireCavalier(){
        //
    }
}
