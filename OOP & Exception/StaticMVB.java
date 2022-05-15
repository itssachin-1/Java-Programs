// Write a program to demonstrate static variables, methods, and blocks.

package itssachin.assignments2;

public class StaticMVB {
    static int x=10;                // static variable
    static int y;
    static void fun(int z){         // static method
        System.out.println("X= "+x);
        System.out.println("Y= "+y);
        System.out.println("Z= "+z);
    }
    static {                         // static block
        x=x+7;
        System.out.println("Printing from static block");
    }

    public static void main(String[] args) {
        fun(5);
    }
}
