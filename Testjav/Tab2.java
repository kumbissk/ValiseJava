public class Tab2 {
    public static void main(String[] args) {
         
        // int[] tab = new int[5];

        int[] tab1 = {1,2,3};
        int[] tab2 = {1,2,3};

        if (tab1 == null || tab2 == null || tab1.length != tab2.length) {
            System.out.println("Different");
        } 
        else {
            int i = 0;
            while (i < tab1.length && tab1[i] == tab2[i]) {
                i++;
            }    

            if ( i >= tab1.length) {
                System.out.println("Egaux");
            } 
            else {
                System.out.println("Different");
            }
        }

     
       
    }
}
