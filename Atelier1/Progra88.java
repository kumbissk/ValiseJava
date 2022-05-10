import java.util.Scanner;

public class Progra88 {
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        int nb = 0;
        System.out.println("Entrer un nombre entre 1 et 3 ");
            nb = Scan.nextInt();
        while (nb<1 || nb>3) {
            System.out.println(nb);

            if (nb<1 || nb>3) {
                System.out.println("saisi erroné. recommencer! ");
            }
        }

        
    }
}
