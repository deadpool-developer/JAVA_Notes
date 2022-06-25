public class MethodOverloading {
    static void foo(){
        System.out.println("Good Morning bro!!");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!!");
    }

    static void foo(int a,int b){
        System.out.println("Good Morning " + a + " bro!!");
        System.out.println("Good Morning " + b + " bro!!");
    }

    //Method overloading cannot be perfomed by changing the return type of the method

    /*
    static int foo(int a,int b){  //--> not acceptable
        System.out.println("Good Morning " + a + " bro!!");
        System.out.println("Good Morning " + b + " bro!!");
    }
    */

    public static void main(String[] args) {
        foo();
        foo(12);
        foo(3,1);

        //Argument are actual --> foo(12 --> this is argument)
        // paramter is passed in the method --> foo(int a ---> this is parameter)
    }
}
