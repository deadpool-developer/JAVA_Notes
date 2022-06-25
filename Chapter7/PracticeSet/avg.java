package PracticeSet;

public class avg {
    static int avge(int ...arr){
        int result = 0;
        for(int el:arr){
            result += el;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(avge(1,2,3,4,5,6,7));
    }
}
