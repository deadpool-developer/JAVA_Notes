package Chapter3;

 //Strings are immutable that means original string cannot be changed
public class Strings {
    public static void main(String[] args) {
        String name_using_class = new String("Adi");  //we can make class of the string
        String name_without_class = "Aditya";  //java allow us to declare string like this also
        System.out.println(name_using_class);
        System.out.println(name_without_class);

        //Different form of print in Java

        System.out.print("Do not give next line: ");
        System.out.println(name_using_class);
        System.out.println("Gives the next Line");
        System.out.println(name_using_class);

        //printf is same as of the C and C++ language

        int a = 5;
        float b = 4.53245f;
        System.out.printf("The value of integer is %d and value float is %f \n",a,b); //same as of C language

        //System.out.format() works same as of System.out.printf()
        System.out.format("The value of integer is %d and value float is %f \n",a,b); //same as of C language

        //spacing and .2f use --> we can use .3f or till which we want to print the decimal digits
        System.out.printf("The value of integer is %d and value float is %.2f \n",a,b); //Prints the decimal point upto 2 digit
        System.out.printf("The value of integer is %d and value float is %8.2f \n",a,b); //take 8 spaces including the numbers




    }
}
