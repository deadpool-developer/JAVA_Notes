package PracticeSet;

public class maxNum {
    public static void main(String[] args) {
        int [] arr = {1,3,56,4,334,213,2345,3232,11234,5432};
        int max = Integer.MIN_VALUE;  //--> works for negative integer also
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else{
                continue;
            }
        }
        System.out.println(max);
    }
}


//TIP

/*
    In java we have something which contain maximum and minimum number 
        1. Integer.MIN_VALUE
        2. Integer.MAX_VALUE
*/