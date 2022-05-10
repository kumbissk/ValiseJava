import java.util.Scanner;

public class Tableau {
    public Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
       affiche(dataArray());

    }

    public static String[] dataArray() {
        String [] data = new String[7];

        Scanner Scan = new Scanner(System.in);
        System.out.println("Entrer votre matricule");
        data[0] = Scan.nextLine();

        System.out.println("Entrer votre nom");
        data[1] =  Scan.nextLine();

        System.out.println("Entrer votre prenom");
        data[2] =  Scan.nextLine();

        System.out.println("Entrer votre adress");
        data[3] =  Scan.nextLine();

        System.out.println("Entrer votre date de naissance");
        data[4] =  Scan.nextLine();

        System.out.println("Entrer votre lieu de naissance");
        data[5] =  Scan.nextLine();

        System.out.println("Entrer votre numero de telephone");
        data[6] =  Scan.nextLine();

        Scan.close();
        return data;
    }

    public static void affiche(String [] dataa) {
        for(String data : dataa) {
            System.out.println(data);
        }
    }


     
}