package Chapter2.Operatore_Expression.Practice_Set_Chapter2;

public class Encrypt_Decrypt_grade {
    public static void main(String[] args) {
        char grade = 'A';
        //Encrypting the grade by adding 8 to it
        grade = (char)(grade+8);  // We have to typecast the grade because char + integer gives integer
        System.out.println(grade);

        //Decrypting the garde

        grade = (char) (grade-8);
        System.out.println(grade);

    }
}
