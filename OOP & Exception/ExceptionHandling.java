// Write a program to demonstrate the use of try, catch, finally throw and throws keywords and demonstrate the following points in the program.
// a) Multiple catch blocks.
// b) try-catch-finally combination.
// c) try-finally combination.
// d) Exception propagation among many methods.
// e) Use of getMessage(), printStackTrace() function of Throwable class.
// f) Nested try blocks
package itssachin.assignments2;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {
    int x=6;
    int y;
    void divide(){
        try{
            System.out.println(x/y);
        }
        catch(ArithmeticException e){
//            e.printStackTrace();
            System.err.println(e);
        }
        finally{
            System.out.println("This must be print! NoMatterWhat.");
        }
        System.out.println("Code after handling divideByZero Exception...\n");
    }

    void  printArray(){
        try {
            int[] arr= {1, 2, 3, 'f', 5};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }
        catch (Exception e){
            e.getMessage();
        }
        System.out.println("Rest of code after handling ArrayIndexOutOfBoundsException...\n");
    }
    void sum(){
        double sum=0;
        Scanner s = new Scanner(System.in);

        try{
            System.out.println("Enter value of a and b: ");
            double a= s.nextInt();
            double b=s.nextInt();
            sum = a+b;
        }
        finally {
            System.out.println("The \"finally\" block is used to execute the necessary code of the program. \nIt is executed whether an exception is handled or not.\n");
        }
    }

    public static void main(String[] args) {
        ExceptionHandling eh= new ExceptionHandling();
        eh.divide();
        eh.printArray();
        eh.sum();

    }
}
class ExceptionPropagation{
        void m()
        {
            int data = 10 / 0; // unchecked exception occurred
            // exception propagated to n()
        }

        void n()
        {
            m();
            // exception propagated to p()
        }

        void p()
        {
            try {
                n(); // exception handled
            }
            catch (Exception e) {
                System.out.println("Exception handled!");
            }
        }

        public static void main(String args[])
        {
            ExceptionPropagation obj = new ExceptionPropagation();
            obj.p();
            System.out.println("Rest of code...");
        }
}
class ThrowException{
        void m() throws IOException
        {
            // checked exception occurred
            throw new IOException("Device error!");
        }

        public static void main(String args[])
        {
            ThrowException o = new ThrowException();
            try{
                o.m();
            }
            catch (IOException e){
                System.err.println(e);
            }
            System.out.println("normal flow of program...");
        }
}
class MultipleTry{
    static int[] arr= {1, 3, 5, 6};

    public static void main(String[] args) {
        try{
            try{
                System.out.println(arr[2]/0);
            }
            catch (ArithmeticException ae){
                System.err.println(ae.getMessage());
            }
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
        System.out.println("Code after handling exception..");
    }
}