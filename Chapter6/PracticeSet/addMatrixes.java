package PracticeSet;

public class addMatrixes {
    public static void main(String[] args) {
        int [][] num1 = { {2,4,6} , {1,2,3}};
        int [][] num2 = {{2,4,6}, {1,2,3}};

        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num1[i].length;j++){
                num1[i][j] += num2[i][j];
                System.out.printf(num1[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
