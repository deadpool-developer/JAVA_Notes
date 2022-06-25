package Chapter2.Operatore_Expression.Practice_Set_Chapter2;

public class Solve_exp {
    public static void main(String[] args) {
        float a = 7/4 * 9/2;
        float b = 7/4.0f * 9/2.0f;
        System.out.println(a); // This  will give wrong result because int / int gives integer so we have to make it to floating point number
        System.out.println(b); // This will give the correct output of the expression
    }
}
