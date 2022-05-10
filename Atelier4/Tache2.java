import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

public class Tache2 {
    public static void main(String[] args) {
        affichage(dataArray(nbr: 2));
    }

    public static String[][] dataArray(int nbr) {
        String[][] data = new String[nbr][7];

        for (int i = 0; i < nbr; i++) {
            Scanner Scan = new Scanner(System.in);

            System.out.println("Entrer un nom");
            data[i][1] = Scan.nextLine();

            System.out.println("Entrer un prenom");
            data[i][2] = Scan.nextLine();

            System.out.printf("Entrer le matricule de %s%n", data[i][1])
            data[i][0] = Scan.nextLine();

            System.out.printf("Entrer l'adress de %s%n", data[i][1])
            data[i][3] = Scan.nextLine();

            System.out.printf("Entrer votre date de naissance de %s%n", data[i][1])
            data[i][4] = Scan.nextLine();

            System.out.printf("Entrer votre lieu de naissance de %s%n", data[i][1])
            data[i][5] = Scan.nextLine();

            System.out.printf("Entrer votre numero de telephone de %s%n", data[i][1])
            data[i][6] = Scan.nextLine();

            System.out.println(" ");
        }
        return data;
    }

    public static void affichage(String [][] mDataa) {
        for (String[] mData : mDataa) {
            System.out.println("----information d'une personne-----");
            for (String item : mData) {
                System.out.println(item);
            }
        }
    }
      

}
