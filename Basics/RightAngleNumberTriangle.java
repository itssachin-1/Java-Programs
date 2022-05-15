// Write a Java program to Print Right Triangle Number Pattern
package itssachin.assignments2;
import java.util.Scanner;

public class RightAngleNumberTriangle {
    static void rightAngle(int size) {
        int row= size;
        for (int i = 0; i < row; i++) {
            for (int j =0; j < size; j++) {
                System.out.print((int)(Math.random()*10));
            }
            size--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of the pattern: ");
        size= s.nextInt();
        rightAngle(size);
    }
}
