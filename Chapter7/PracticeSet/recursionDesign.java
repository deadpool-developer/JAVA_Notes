package PracticeSet;
public class recursionDesign{

    static void design(int a){
        if(a>0){

            design(a-1);
            for(int i=0;i<a;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        design(4);
    }
}