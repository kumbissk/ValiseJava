import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int nbre1 = Scan.nextInt();

        System.out.println("Entrer un second nombre");
        int nbre2 = Scan.nextInt();

        System.out.printf("La multiplication de ces deux nombre est : %d", multiplication(nbre1, nbre2));
    }


    public static int addition(int ...items) {
        int somme = 0;
        for(int item:items) {
            somme+=item;
        }
        return somme;
    }

    public static int soustraction(int nbr1, int nbr2) {
        return nbr1 - nbr2;
    }

    public static int division(float nbr1, float nbr2) {
        if (nbr2 == 0) {
            System.out.println("La division est impossible");
        }
        else {
            float res = nbr1 / nbr2;
            System.out.printf("Le quotient est %.2f", res);
        }
    }

    public static int multiplication(int nbr1, int nbr2) {
        return nbr1 * nbr2;
    }
}
