class MyEmployee{

    //When we make private variables than we have make the getter and setter of that class as they are accessible only within that class methods only
    private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }

    public int getId(){
        return id;
    }
}

public class accessModifier {
    public static void main(String[] args) {
        MyEmployee sc = new MyEmployee();
        sc.setName("Aditya Saini");
        System.out.println(sc.getName());
        sc.setId(12);
        System.out.println(sc.getId());
    }
}
