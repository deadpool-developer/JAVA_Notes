package PracticeSet;

class cons{
    private int radius;
    private int height;
    private float sur_area;
    private float vol;

    //constructor
    cons(int r,int h){
        this.radius = r;
        this.height = h;
    }

    //surface area of cylinder
    public float surface_area(){
        sur_area = ((2f*3.14f*radius*height) + 2f*3.14f*(radius*radius));
        return sur_area;
    }

    //volume of cylinder
    public float volume(){
        vol = (3.14f*(radius*radius)*height);
        return vol;
    }


}

public class cylinderConstruc {
    public static void main(String[] args) {
        cons cy = new cons(12,10);
        System.out.println(cy.surface_area());
        System.out.println(cy.volume());
    }
}
