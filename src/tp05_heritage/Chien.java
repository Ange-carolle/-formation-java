package tp05_heritage;

public class Chien extends Animal{
    private String race;
    public Chien (String nom, int age, String race){
        super(nom, age);
        this.race = race;
    }

    public void aboyer(){
        System.out.println("Wouf Wouf");
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Race: " + race);
    }
}
