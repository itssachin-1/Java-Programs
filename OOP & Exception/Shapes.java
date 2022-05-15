// We have to calculate the area of a rectangle, a square and a circle.
// Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
// The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius.
// Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively.
// Create an object of class 'Area' and call all the three methods.
package itssachin.assignments2;

abstract class Shape{
    abstract void rectangleArea(float length , float breadth);
    abstract void squareArea(float radius);
    abstract void circleArea(float side);
}

class Area extends Shape{
    double Area=0;

    @Override
    void rectangleArea(float length , float breadth){
        Area = length * breadth;
        System.out.println("Area of rectangle is: "+Area);
    }

    @Override
    void squareArea(float Side){
        Area = Side * Side;
        System.out.println("Area of Square is:  "+Area);
    }

    @Override
    void circleArea(float radius){
        Area = (radius * radius)*3.14;
        System.out.println("Area of Circle is:  "+Area);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Area a = new Area();

        a.rectangleArea(5.5f, 7f);
        a.squareArea(5f);
        a.circleArea(4);
    }
}