package PracticeSet;

class Square{
    int side;

    public int area(){
        return side * side;
    }
    public int perimter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int breadth;

    public int area(){
        return length*breadth;
    }

    public int perimter(){
        return 2*length*breadth;
    }
}

public class sqaure {
    public static void main(String[] args) {
        Square sq = new Square();
        Rectangle rc = new Rectangle();
        sq.side = 5;
        rc.length = 3;
        rc.breadth = 4;
        System.out.print("Area of square is: ");
        System.out.println(sq.area());
        System.out.print("Perimeter of square is: ");
        System.out.println(sq.perimter());
        System.out.print("Area of rectangle is: ");
        System.out.println(rc.area());
        System.out.print("Perimeter of rectangle is: ");
        System.out.println(rc.perimter());
    }
}
