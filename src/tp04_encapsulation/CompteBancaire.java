package tp04_encapsulation;

public class CompteBancaire {
    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double solde){
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public double getSolde(){
        return this.solde;
    }
    public void deposer (double montant){
        if (montant > 0){
            this.solde += montant;
        } else {
            System.out.println("Impossible");
        }
    }

    public void retirer (double montant){
        if (montant > 0 && montant <= solde){
            this.solde -= montant;
        } else {
            System.out.println("Solde insuffisant");
        }
    }

}
