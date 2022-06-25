package PracticeSet;

class cellPhone{
    public void ringing(){
        System.out.println("RINGING....");
    }

    public void vibrating(){
        System.out.println("VIBRATING....");
    }

    public void silent(){
        System.out.println("SILENT...");
    }
}

public class cellPhoneClass {
    public static void main(String[] args) {
        
        cellPhone asus = new cellPhone();
        asus.ringing();
        asus.vibrating();
        asus.silent();
    }


}
