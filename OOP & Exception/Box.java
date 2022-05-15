// Create class box and box3d. box3d is extended class of box. The above two classes going to pull fill following requirement a)Include constructor.
// b)set value of length, breadth, height
// c)Find out area and volume.
package itssachin.assignments2;

public class Box {
    double length, breadth, height;
//    Box(){
//
//    }
    Box(double length, double breadth, double height){
        this.length= length;
        this.breadth= breadth;
        this.height= height;
    }
}
class Box3d extends Box{
    Box3d(double length, double breadth, double height) {
        super(length, breadth, height);
    }

    double area(){
        double l= length, b= breadth, h= height;
        return 2*(b*l + h*l + h*b);
    }

    double volume(){
        double l= length, b= breadth, h= height;
        return l*b*h;
    }
}
class Main{
    public static void main(String[] args) {
        Box3d b3= new Box3d(3.56, 5, 6.23);

        System.out.println("Length: 3.56, Breadth: 5, Height: 6.23");
        System.out.printf("Area of Box: %.2f\n",b3.area());
        System.out.printf("Volume of Box: %.2f\n",b3.volume());
    }
}