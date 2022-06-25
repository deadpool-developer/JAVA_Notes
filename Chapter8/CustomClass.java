//There can be only one public class in a java file
//OBJECTS IN OOPS --> Attributes + Methods


//CUSTOM CLASS
class Employee{
    int id;
    String name;
    int salary;
    //METHOD
    public void printDetails(){
        System.out.println("My ID is: " + id);
        System.out.println("and my name is: "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class CustomClass{
    public static void main(String[] args) {
        Employee aditya = new Employee(); //Instantiating a new Employee Object
        Employee john = new Employee();

        //Setting the Attributes
        aditya.id = 12;
        aditya.name = "Aditya Saini";
        aditya.salary = 344;

        john.id = 13;
        john.name = "John Wick";
        john.salary = 13;
        int adi_salary = aditya.getSalary();
        int john_salary = john.getSalary();

        //Prefer this to print the details
        aditya.printDetails();
        System.out.println("My Salary is : " + adi_salary);
        john.printDetails();
        System.out.println("My salary is: " + john_salary);
        
       

        /*
        Printing the Attributes

        System.out.println(Aditya.id);
        System.out.println(Aditya.name);
        */
    }
}