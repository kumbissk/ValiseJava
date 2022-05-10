import java.util.Scanner;
public class Progrmme77 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int nbr = 0;
        System.out.println("Entrer un entier ");
        
        if (nbr==0) {
            System.out.println("l'entier est null");
        }
        else if (nbr>0) {
            System.out.println("l'entier saisi est positif");
        }
        else {
            System.out.println("L'entier est negatif");   
        }
    }
}
