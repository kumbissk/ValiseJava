import java.nio.file.Path;
import java.util.Scanner;

public class TestValeur {
    static Scanner Scan = new Scanner(System.in);
    public static void main(String[] args) {
        int nbr1, nbr2, somm;
        System.out.println("Entrer un nombre : ");
        nbr1 = Scan.nextInt();
        System.out.println("Entrer un deuxieme nombre : ");
        nbr2 = Scan.nextInt();
        
        System.out.println("la somme est : " + (nbr1+nbr2));
        // System.out.println();

        // System.out.println("La somme est " + somm(nbr1+nbr2));
    }
}
