import java.util.Scanner;

public class Programme99 {
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        String nom;
        int age, nb;

        System.out.println("Entre votre nom ");
        nom = Scan.nextLine();
        System.out.println("Entrer votre age ");
        age = Scan.nextInt();
        System.out.println("Entrer votre nb ");
        nb = Scan.nextInt();

        System.out.printf(nom + " est " + age + " ans " + nb);
    }
}
