class Base1{
    Base1(){
        System.out.println("I am a constructor of the base class");
    }

    Base1(int x){
        System.out.println("I am an overloaded constructor with the value of x as: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super keyword calls the argumented constructor of the base class and without it default constructor is called
        //super(0);
        System.out.println("I am the constructor of the derived class");
    }

    Derived1(int x,int y){
        super(x);
        System.out.println("I am an overloaded constructor of a Derived with a value of y as: "+y);
    }

}

class childOfDerived extends Derived1{
    childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constuctor of the child of derived class z: " + z);
    }

}

public class construcr_inherit {
    public static void main(String[] args) {
        //Object of the base class invokes the constructor of the base class automatically
        //Base1 b = new Base1();
        
        // Object of the derived class first invokes the constructor of the base class then it invokes the constructor of the derived class
        // Derived1 d = new Derived1();  --> this will call the default constructor without the param

        Derived1 d = new Derived1(14,6);
        System.out.println(d);
        childOfDerived cd = new childOfDerived(23,21,11);
        System.out.println(cd);
    }
}
