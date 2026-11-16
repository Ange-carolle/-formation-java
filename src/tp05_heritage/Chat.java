package tp05_heritage;

public class Chat extends Animal {
    private  String couleurPlage;
    public Chat(String nom, int age, String couleurPlage){
        super(nom, age);
        this.couleurPlage = couleurPlage;
    }

    public void miauler(){
        System.out.println("Miaou Miaou");
    }

    @Override
    public void manger() {
        super.manger();
        System.out.println("Le chat mange");
    }
}
