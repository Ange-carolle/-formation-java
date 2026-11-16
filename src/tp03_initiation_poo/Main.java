package tp03_initiation_poo;

public class Main {
    public static void main(String[] args){
        Livre livre1 = new Livre("Les poussins tetus", "Carolle", 50);
        Livre livre2 = new Livre("La foie inébranlabe de Rudolf Douala Manga Bell", "Ange", 100);

        livre1.afficherInfo();
        livre2.afficherInfo();
    }

}
