import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Taches3 {
    public static void main(String[] args) {
        affichage(dataArray());
    }


    public static ArrayList<ArrayList<String>> dataArray() {
        ArrayList<ArrayList<String>>  datas = new ArrayList<>();

        String controle;
        do {
            datas.add(new ArrayList<>());
            Scanner Scan = new Scanner(System.in);

            System.out.println("Entrer un nom");
            datas.get(0).add(Scan.nextLine());

            System.out.println("Entrer un prenom");
            datas.get(0).add(Scan.nextLine());

            System.out.printf("Entrer le matricule%n");
            datas.get(0).add(Scan.nextLine());

            System.out.printf("Entrer l'adresse%n");
            datas.get(0).add(Scan.nextLine());

            System.out.printf("Entrer votre date de naissance%n");
            datas.get(0).add(Scan.nextLine());

            System.out.printf("Entrer votre lieu de naissance%n");
            datas.get(0).add(Scan.nextLine());

            System.out.printf("Entrer votre numéro de téléphone %n");
			datas.get(0).add(Scan.nextLine());
			System.out.println("Voulez-vous continuer Y/N ?");

            controle = Scan.nextLine();
        } 
        while (controle.equalsIgnoreCase("Yes"));

        return datas;

        public static void affichage(ArrayList<ArrayList<String>> arrayList) {
            for (ArrayList<String> arrayList2 : arrayList) {
                System.out.println(" Les informatons ");
                for (int i = 0; i < arrayList2.size(); i++) {
                    System.out.println(arrayList2.get(i));
                }
            }
        }
    }
}
