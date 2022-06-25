public class multidim{
    public static void main(String[] args) {
        /*
        Multidimensional arrays are array of array. Each element of a M-D array is an array itself.
        */

        int [][] flats = new int [2][3];
                              //row col
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 104;
        flats[1][1] = 105;
        flats[1][2] = 106;

        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.printf(flats[i][j] + " ");
            }
            System.out.println("");
        }

    }
}