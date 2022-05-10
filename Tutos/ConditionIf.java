import java.util.Scanner;

public class ConditionIf {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int nbr = 0 ;
        System.out.println("Entrer un nombre svp");
        nbr = clavier.nextInt();

        if (nbr > 0) {
            System.out.println("Le nombre entré est : positif");
        } else {
            System.out.println("Le nombre entré est negatif");
        }
    }
}
