package PracticeSet;

class cylinder_param{
    private int radius;
    private int height;
    private float sur_area;
    private float vol;

    public void setRadius(int r){
        this.radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public int getHeight(){
        return height;
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

public class cylinder {
    public static void main(String[] args) {
        cylinder_param cy = new cylinder_param();
        cy.setRadius(12);
        System.out.format("The radius of the cylinder is: " + cy.getRadius() + "\n");
        cy.setHeight(10);
        System.out.format("The height of the cylinder is: " + cy.getHeight() + "\n");
        System.out.println(cy.surface_area());
        System.out.println(cy.volume());
    }
}
