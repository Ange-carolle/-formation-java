package tp05_heritage;

public class Oiseau extends Animal{
    private double envergure;
    public Oiseau(String nom, int age, double envergure){
        super(nom, age);
        this.envergure = envergure;
    }

    public void voler(){
        System.out.print(nom + " vole");
    }

    @Override
    public void manger() {
        super.manger();
        System.out.println("et picore des graines");
    }
}
