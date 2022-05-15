// Define a class of type Distance that has Feet and Inches as members.
// Define a function that adds two Distances passed as argument and returns the sum as another Distance object.
package itssachin.assignments2;
import java.util.Scanner;

public class Distance {
    double feet;
    double inches;

    void setDistance(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter distance in feet: ");
        feet= s.nextDouble();
        System.out.println("Enter distance in inches: ");
        inches= s.nextDouble();
    }

    void sumDistances(Distance d1, Distance d2){
        feet = d1.feet+d2.feet;
        inches = d1.inches+ d2.inches;
    }

    void getSum(){
        System.out.println("Sum of feets: "+feet);
        System.out.println("Sum of inches: "+inches);
    }

    public static void main(String[] args) {
        Distance d1, d2, d3;
        d1= new Distance();
        d2= new Distance();
        d3= new Distance();

        d1.setDistance();
        System.out.println("--- For 2nd distance ---");
        d2.setDistance();

        d3.sumDistances(d1, d2);
        d3.getSum();

    }
}
