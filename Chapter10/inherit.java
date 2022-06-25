//Parent class / super class / base class
class Base{
    int x;
     public int getX(){
         return x;
     }

     public void setX(int x){
         this.x = x;
     }

     public void printMe(){
         System.out.println("I am a Method of base class");
     }
}

//Derived class / subclass / child class --> inherit properties of the base class
class Derived extends Base{
    int y;

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }


}

public class inherit{
    public static void main(String[] args) {
        Derived parent = new Derived();  //Object of the derived class
        //Using derived class object to access data of the parent class
        parent.setX(3);
        System.out.println(parent.getX());
        parent.setY(4);
        System.out.println(parent.getY());
    }
}