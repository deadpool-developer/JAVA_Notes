package PracticeSet;

public class sumarray {
    public static void main(String[] args) {
        float sum = 0;
        float [] marks = {90,92,88,95,72};
        for(int i =0;i<marks.length;i++){
            sum += marks[i];
        }
        System.out.printf("The sum of all the elements in the array is: %f",sum);
    }
}
