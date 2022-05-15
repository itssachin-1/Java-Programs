// Write a program to throw a checked exception explicitly using 'throw' keyword and
// a) Handle the exception in same method.
// b) use throws clause and handle the exception in some other method (calling method)
// c) Don't either handle or use the throws' clause. Observe the result.
package itssachin.assignments2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CheckedException {
    void myMethod(int num)throws IOException, ClassNotFoundException{
        try{        // Handling exception in same method
            if(num == 1)
                throw new IOException("IOException Occurred");
            else
                throw new ClassNotFoundException("ClassNotFoundException");
        }
        catch (Exception ex){
            System.err.println(ex);
        }
        System.out.println("Code after..");
    }
    public static void main(String[] args) {
        CheckedException obj = new CheckedException();
        try {
            obj.myMethod(1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


class Example2 {
    private static final List<Integer> integers = new ArrayList<>();

    public static void addInteger(Integer value) throws IllegalArgumentException {
        if (integers.contains(value)) {
            throw new IllegalArgumentException("Integer already added.");   // throwing exception
        }
        integers.add(value);
    }

    public static void main(String[] args) {
//        addInteger(1);addInteger(1);
// Observation: If we don't handle exception then if exception occurs then the code after that didn't execute and program stops unexpectedly.
        try {
            addInteger(1);              // Handling exception
            addInteger(1);
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
        }
        System.out.println("Code after...");
    }
}