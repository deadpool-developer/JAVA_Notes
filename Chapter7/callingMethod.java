// A method can be called by creating an obect of the class in which the method exists followed by the method call

/*
Calc obj = new Calc();  --> Object Creation
obj.mySum(a,b);  --> method call upon an object
*/

public class callingMethod {
    int add(int x, int y){
        int s = x+y;
        return s;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        callingMethod obj =  new callingMethod(); //--> creating the class object
        int sum = obj.add(a,b); //--> calling the add method with the object
        System.out.println(sum);
    }
}
