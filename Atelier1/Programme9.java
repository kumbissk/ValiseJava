import java.util.Scanner;

public class Programme9 {
    static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args) {

        int nobr1 = 0, nobr2 = 0, nobr3;
        
        System.out.println("Entrer un reel: ");
            nobr1 = clavier.nextInt();

        System.out.println("Entrer un entier: ");
            nobr2 = clavier.nextInt();

        System.out.println("Entrer un chaine: ");
            nobr3 = clavier.nextInt();

        System.out.println("Le nombre reel saisi est " + nobr1);
        System.out.println("Le nombre entier saisi est " + nobr2);
        System.out.println("La chaine de caractere saisie est " + nobr3);

    }
}
