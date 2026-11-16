package tp05_heritage;

public class Animal {
    protected String nom;
    protected int age;
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }
    public void dormir() {
        System.out.println(nom + " dort paisiblement.");
    }
    public void afficherInfos() {
        System.out.println("Nom: " + nom + ", Age: " + age + " ans");
    }
}
