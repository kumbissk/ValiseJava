import java.util.ArrayList;
import java.util.Scanner;

public class TacheTableau1 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayNote = new ArrayList<Integer>();
        Scanner Scan = new Scanner(System.in);
        String info;

        do {
            System.out.println("Saisir un entier");
            arrayNote.add(Scan.nextInt());
            System.out.println("Entier enregistrer\n");
            Scan.nextLine();
            System.out.println("Voulez-vous continuer oui/non");
            info = Scan.nextLine();
        } 
        while (info.equalsIgnoreCase("oui"));
        System.out.println(arrayNote);

        Scan.close();
    }
}




