// Write a JAVA program for computing sum of two integers and floats using abstract classes.
package itssachin.assignments2;
import java.util.Scanner;

abstract class SumInt {
    abstract void sumInt(int a, int b);
}

abstract class SumFloat{
    abstract void sumFloat(float f1, float f2);
}

class AbtMain{
    static Scanner s= new Scanner(System.in);

    public static void main(String[] args) {
        SumInt si= new SumInt() {
            @Override
            void sumInt(int a, int b) {
               int c = a+b;
                System.out.println("Sum of numbers is: "+c);
            }
        };
        SumFloat sf= new SumFloat() {
            @Override
            void sumFloat(float f1, float f2) {
                float f3 = f1 + f2;
                System.out.printf("Sum of numbers is: %.2f", f3);
            }
        };
        System.out.println("Enter two integer numbers: ");
        int a= s.nextInt();
        int b= s.nextInt();
        si.sumInt(a, b);

        System.out.println("Enter two floating type numbers: ");
        float f1 = s.nextFloat();
        float f2= s.nextFloat();
        sf.sumFloat(f1,f2);
    }
}