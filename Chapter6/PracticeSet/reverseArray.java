package PracticeSet;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        //we want to run the loop till half way of the array -> therefore we have Math.floorDiv(big number,2)
        int l = Math.floorDiv(arr.length, 2);
        for(int i=0; i<=l;i++){
            arr[i] = arr[i] ^ arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i] ^ arr[arr.length-1-i];
            arr[i] = arr[i] ^ arr[arr.length-1-i];
        }
        for(int el:arr){
            System.out.format(el + " ");
        }
    }
}
