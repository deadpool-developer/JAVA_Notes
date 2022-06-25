package Chapter4;

public class logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if(a && b && c){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        System.out.println("For Logical OR");
        if(a || b || c){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        System.out.println("For Logical NOT");
        System.out.print("Not(A) is ");
        System.out.println(!a);
        System.out.print("Not(B) is ");
        System.out.println(!b);

    }
}
