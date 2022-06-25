public class constructor {

    static class MyEmployee{
        private int id;
        private String name;

        public MyEmployee(){ //nmae of the constructor is same as of the name of the class and it do not have any return type
            id = 45;
            name = "Your_name_here";
        }

        public MyEmployee(String n, int i){  //Constructor with the parameter
            name = n;
            id = i;
        }

        public void setId(int i){
            this.id = i;
        }

        public int getId(){
            return id;
        }
        public void setName(String n){
            this.name = n;
        }
        public String getName(){
            return name;
        }
    }
    public static void main(String[] args) {
        //cONSTRUCTOR OVERLOADING AT LINE 33 & 34
        MyEmployee sc = new MyEmployee(); //The constructor of the class is invoked automatically when its object is made
        MyEmployee s = new MyEmployee("Aditya Saini",12); //The constructor can have arguments passed in it.

        //We do not need to set the value as sc.setName("Aditya") --> Simply we can make a constructor and it will make it easy
        System.out.println(sc.getName());
        System.out.println(sc.getId());
        System.out.println(s.getName());
        System.out.println(s.getId());
    }
}
