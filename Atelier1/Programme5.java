import java.util.Scanner;

public class Programme5 {
    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        int m = 0, n = 0;
        System.out.println("Entrez un nombre: ");
        m = sc.nextInt();
        System.out.println("Entrez un autre nombre: ");
        n = sc.nextInt();

        if (m==0||n==0) {
            System.out.println("Le produit est null");
        }
        else if (m < 0 && n < 0 || m > 0 && n > 0) {
            System.out.println("Le produit est positif");
        }
        
         else {
            System.out.println("Le produit est negatif");
        }

    }
}
