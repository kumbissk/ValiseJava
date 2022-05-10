import java.util.ArrayList;

public class Wrappers {
    public static void main(String[] args) {
        
        ArrayList<Integer> tab = new ArrayList<Integer>();
        // tab.add(index, element);
        
        tab.add(5);  //5
        tab.set(0, 218);
        System.out.println(tab.get(0));
    }
}
