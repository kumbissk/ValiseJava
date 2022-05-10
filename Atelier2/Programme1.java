import java.util.Scanner;

public class Programme1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Entrer un entier : ");
        if (Scan.hasNextInt()) {
            int nbr1 = Scan.nextInt();
			System.out.println("Entrer un autre entier :");
            if (Scan.hasNextInt()) {
				int nbr2 = Scan.nextInt();
				int result = (nbr1 + nbr2);
				System.out.printf("le résultat de la somme est %d", result);
			}else {
				System.out.println("Vous devez entrer un entier corespondant ");
				System.exit(0);
			}
        } 
        else {
            System.out.println("Vous devez entrer un entier ");
			System.exit(0);
        }

        
        Scan.close();

    }
}
