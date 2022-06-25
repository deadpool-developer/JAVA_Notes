package PracticeSet;

public class naturalNumberSum {

    static int sum(int a){
        if(a == 1){
            return 1;
        }
        else{
            return a + sum(a-1);
        }
    }
    public static void main(String[] args) {
        int c = sum(2);
        System.out.println(c);
    }
}
