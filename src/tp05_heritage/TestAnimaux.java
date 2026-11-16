package tp05_heritage;

public class TestAnimaux {
    public static void main(String[] args){
        Chien chien = new Chien("Medor", 9, "Bulldog");
        Chat chat = new Chat("Minou", 2, "noire");
        Aigle aigle = new Aigle("Le grand aigle", 10, 5.2, 10);
        chien.afficherInfos();
        chien.manger();
        chien.aboyer();
        chien.dormir();


        chat.manger();
        chat.dormir();
        chat.miauler();
        chat.afficherInfos();

        aigle.manger();
    }
}
