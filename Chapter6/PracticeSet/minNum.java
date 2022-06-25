package PracticeSet;

public class minNum {
    public static void main(String[] args) {
        int [] arr = {11,3,56,4,334,213,2345,3232,11234,5432};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else{
                continue;
            }
        }
        System.out.println(min);
    }
}
