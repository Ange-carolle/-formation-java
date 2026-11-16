package tp03_initiation_poo;

public class Livre {
    private String titre;
    private String auteur;
    private int pages;

    public Livre(String titre, String auteur, int pages){
        this.titre = titre;
        this.auteur = auteur;
        this.pages = pages;
    }

    public void afficherInfo(){
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Nombre de pages : " + pages);
    }
}
