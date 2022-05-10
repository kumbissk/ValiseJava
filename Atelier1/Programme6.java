import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        System.out.print("Entrer un nombre: ");
        int nbr1 = sc.nextInt();

        System.out.print("Entrer un autre nombre: ");
        int nbr2 = sc.nextInt();

        System.out.print("Entrer un troisieme nombre: ");
        int nbr3 = sc.nextInt();

        System.out.println("La moyenne est : " + (nbr1+nbr2+nbr3)/3);
    }
}
