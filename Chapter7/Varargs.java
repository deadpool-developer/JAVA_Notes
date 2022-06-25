public class Varargs {

    static int sum(int ...arr){ // this is how we use varargs in the parameter --> it allow us to create an array and the arguments are added in the array
        int result = 0;
        for(int el:arr){
            result += el;
        }
        return result;
    }

    static int sums(int x,int ...arr){ // this is how we use varargs in the parameter --> it allow us to create an array and the arguments are added in the array
        int result = x; // we have to pass one argument x in the method calling as if not passed then it will give error 
        for(int el:arr){
            result += el;
        }
        return result;
    }
    public static void main(String[] args) {
        //We can pass no or multiple arguments in the method calling
        System.out.format("The sum of the numbers 2,4,1,6,7 and 5 are: %d\n",sum(2,4,1,6,7,5));
        System.out.format("The sum of the numbers x,2,4,1,6,7 and 5 are: %d",sums(4,2,4,1,6,7,5));
    }
}
