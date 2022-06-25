package PracticeSet;

public class presentOrNot {
    public static void main(String[] args) {
        int target = 10;
        int [] num = {0,1,2,3,4,5,6,7,8,100};
        boolean isInArray = false;
        
        for (int el : num)
        {
            if(el == target){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.printf("Yes, target (%d) is present in the array num",target);
        }
        else{
            System.out.printf("No, target (%d) is not present in the array num",target);

        }

    }
}
