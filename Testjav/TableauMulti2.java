public class TableauMulti2 {
    
    public static void main(String[] args) {
        int [][] scores = {
            {5,3,8,15,6} ,
            {3,8,4} ,
            {18,14,2,9}
        };

        for (int i = 0; nbRows = scores.length; i < nbRows;  i++) {
            for(int j =0; nbColumns = scores[i].length;  j < nbColumns;  ++j) {
                System.out.print(scores[i][j] + " ");
            }

            System.out.println();
        }
    }
}
