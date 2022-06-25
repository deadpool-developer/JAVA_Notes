//NOTE --> In case of Arrays, the reference is passed. Same is the case for object passing to methods


public class important {
    static void change(int x){
        x = 3;
    }

    static void change2(int [] arr){
        arr[0] = 1;
    }
    public static void main(String[] args) {
        //CASE1 --> The copy of the integer value is passed to the method change() and it do not change the original value of a
        int a = 23;
        change(a);
        System.out.println(a);

        //CASE2 --> The array arr contain the reference of the object and the reference is passed to the method change2() and that's why the original value get changed in array
        int [] arr = {23,123,421,32,45,33};
        change2(arr);
        System.out.println(arr[0]);
    }
}
