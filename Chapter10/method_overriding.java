class A{
    int x;

    public void method1(){
        System.out.println("I am method one of class A");
    
    }

    public void method2(){
        System.out.println("I am method two of class A");
    }
}

class B extends A{
    //Override in java means a method of the parent class in present in the sub class with the same parameter and name 

    //If the child class implements the same method present in the parent class again, it is known as method overriding
    @Override
    public void method2(){
        System.out.println("I am method two of class B");
    }

    public void method3(){
        System.out.println("I am method three of class B");
    }
}


public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();

        B b = new B();
        b.method2();
    }
}
