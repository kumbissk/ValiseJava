import java.util.Scanner;

public class Progra89 {
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        int var = 0;
        System.out.println("Entrer un nombre entre 10 et 20 ");
        var = Scan.nextInt();
        while (var<10 || var>20) {
            System.out.println(var);

            if (var<10) {
                System.out.println("plus grand !");
            }
            else if (var>20) {
                System.out.println("plus petit !");
            }

        }
    }
}
