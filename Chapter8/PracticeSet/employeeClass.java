package PracticeSet;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

public class employeeClass {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setName("Vibhu");
        obj.salary = 1234;
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
    }

}
