class First{
    int x ; // here x is the instance variable 

    //local variable over shadow the instance variable therefore we use this keyword to differentiate both the variables
    First(int x){ //here x is the local variable 
        //this keyword is the reference to the object created to the class
        //this keyword is the reference variable to the current object

        //x = x; // here both are the local variable --> this will gives value as 0
        this.x = x;
        System.out.println(x);
    }

    public int getX(int x){
        return x;
    }


}

class Second extends First{
    Second(int c){
        //super keyword is used to call the constructor of the parent class having param
        super(c);
        System.out.println("I am a constructor of second class");
    }
}

public class this_super {
    public static void main(String[] args) {
        Second s = new Second(23);
        System.out.println(s.getX(34));
    }
}
