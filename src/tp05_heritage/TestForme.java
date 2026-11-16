package tp05_heritage;

public class TestForme {
    public static void main(String[] args){
        Cercle cercle = new Cercle("Rouge", 20.5);
        Rectangle rectangle = new Rectangle("Bleue", 10, 5);
        Triangle triangle = new Triangle("Verte", 15, 7.2);

        //Afficher les surfaces des différentes formes
        System.out.println(cercle.calculerAire());
        System.out.println(rectangle.calculerAire());
        System.out.println(triangle.calculerAire());
    }
}
