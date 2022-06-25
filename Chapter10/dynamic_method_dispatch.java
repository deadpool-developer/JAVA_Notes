class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }

    public void name(){
        System.out.println("My name is Java!!");
    }
}

class Smartphone extends Phone{
    @Override
    public void name(){
        System.out.println("My name is Java in class Two");
    }

    public void swagat(){
        System.out.println("Apka Swagat hai!!");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj = new Phone();
        obj.name();

        //In java, if the reference is of superclass and the object is of subclass then it is allowed in java 
        // but vice versa is not true --> SmartPhone obj = new Phone; ---> Not allowed

        //DYNAMIC METHOD DISPATCH

        //This is known as ynamic method dispatch as the method is decided on the runtime that which method will be run
        // And this type of declaration creates the object in the runtime
        Phone newobj = new Smartphone(); //Allowed
        newobj.greet();
        newobj.name();  //Override method of subclass will be execute as the object is of subclass
        
        //newobj.swagat(); //Not Allowed
    }
}
