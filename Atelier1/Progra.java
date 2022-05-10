import java.util.Scanner;

public class Progra {
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        int nbre;
        System.out.println("Entrer un nombre ");
        nbre = Scan.nextInt();

        if (nbre==0) {
            System.out.println("Le nombre est null");
        }
        else if (nbre>0) {
            System.out.println("Le nombre est positif ");
        } 
        else {
            System.out.println("Le nombre est negatif");
        }

    }
}
