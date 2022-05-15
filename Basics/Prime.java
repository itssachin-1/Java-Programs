// Write a Java code to get a number and find whether it is prime number or not.
// (note:Prime number is the number divisible by 1 and itself only)
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int num;
        boolean result=false;
        System.out.println("Enter a number");
        Scanner s= new Scanner(System.in);
        num = s.nextInt();
        if(num==2)
            result=true;
        else{
            for (int i=2; i<num; i++){
                if (num%i==0){
                    result = false;
                    break;
                }
                else
                    result = true;
            }
        }
//        (!result) ? System.out.println(num + " is not a prime number.") : System.out.println(num + " is a prime number.");
        System.out.println((!result) ? num + " is not a prime number." : num + " is a prime number.");

    }
}
