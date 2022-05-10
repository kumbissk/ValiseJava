import java.util.Scanner;

public class Programme2 {
   public static void main(String[] args) {
        
    Scanner produit= new Scanner(System.in);
 
    System.out.print("Entrer un nombre: ");
    int nbr1 = produit.nextInt();

    System.out.print("Entrer un deuxieme nombre: ");
    int nbr2 = produit.nextInt();

    System.out.println(nbr1 + "x" + nbr2 + "=" + nbr1*nbr2);
    }
}
