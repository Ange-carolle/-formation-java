package tp05_heritage;

public abstract class Vehicule {
    protected String marque;
    protected String modele;
    protected int annee;

    public Vehicule(String marque, String modele, int annee){
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    public abstract void demarrer();

    public void afficherInfo(){
        System.out.println(marque + " " + modele + " " + "(" + annee + ")");
    }
}
