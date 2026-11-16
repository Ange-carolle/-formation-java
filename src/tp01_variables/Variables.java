package tp01_variables;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la température");
        double c = scanner.nextDouble();
        scanner.nextLine();
        double F = (c * 9/5) + 32;

        System.out.println("La température en Fahrenheit est de " + F + " °F");
    }

}

