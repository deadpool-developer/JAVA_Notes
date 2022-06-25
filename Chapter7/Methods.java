/*
Sometimes our program grows in size and we want to seprate the logic of main 
method to other methods -:
FOR INSTANCE: if we are calculating average of a number pair 5 times, we can use
methods to avoid repeating the logic

DRY --> Dont Repeat Yourself
*/

/*
A method is a function written inside a class. Since Java is an object oriented language,
we need to write the method inside some class

SYNTAX
    datatype name(){
        Method body
    }
*/

public class Methods{
    static int average(int x, int y){
        int av = (x+y)/2;
        return av;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int avg = average(a, b);
        System.out.println(avg);
    }
}

// If we are calling a method without making its object inside the class then we can only call it if it is static method else we cannot call it

//CALLING A METHOD WITH OBJECT IS IN callingMethod.java file
