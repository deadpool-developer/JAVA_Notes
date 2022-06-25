package Chapter3.PracticSet;

public class fillTemplate {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, thanks alot!!";
        System.out.println(letter.replace("<|name|>", "Aditya"));
    }
}
