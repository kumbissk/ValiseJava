import java.util.Scanner;

public class CategorieAge {
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        int age ;

        System.out.println("Entrer l'age d'un enfant: ");
        age = Scan.nextInt();

        if (age>=12) {
            System.out.println("categorie cadet ");
        }
        else if (age >= 10) {
            System.out.println("categorie minime ");
        }
        else if (age >= 8) {
            System.out.println("categorie pupille ");
        }
        else if (age >= 6) {
            System.out.println("categorie poussin ");
        }
            
    }
}
