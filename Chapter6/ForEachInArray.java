public class ForEachInArray {
    public static void main(String[] args) {

        //This is how we can make an integer array
        int [] marks = {100,200,300,400};
        System.out.println(marks.length); //---> this returns the length of the array

        //This is how we make the floating array
        float [] marks_float = {90.1f, 40.2f,45,32,11.5f};
        System.out.println(marks_float.length);

        //THis is how we make string array
        String [] students = {"Harry", "Rohan", "Aditya","Shubham"};
        System.out.println(students.length);


        //TO DISPLAY THE ELEMENT OF THE ARRAY
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }


        //FOREACH IN JAVA --> another way to traverse the array
        for(int el : marks){
            System.out.println(el);
        }
        
    }
}
