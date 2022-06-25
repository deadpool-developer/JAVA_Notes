public class arrays {
    public static void main(String[] args) {
        /*
        To enter the marks of 500 students -> You have two options
            1. Create 500 variable
            2. Use Arrays (recommended)
        */

        int [] marks = new int[5]; //declares the array
        marks[0] = 1;
        System.out.println(marks[0]);

        //THREE WAYS TO DECLARE THE ARRAY ARE AS FOLLOWS:
        int [] first_type;         // --> declaration
        first_type = new int[5];  // Memory Allocation
        System.out.println(first_type);

        int [] second_type = new int[5]; //Declaration + memory allocation
        System.out.println(second_type);

        int [] third_type = {100,200,300,400,500};  //declaration + intialization
        System.out.println(third_type);



    }
}
