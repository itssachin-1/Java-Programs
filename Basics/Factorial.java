// Write a Java program to calculate a Factorial of a number
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num, i,  result = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = s.nextInt();

        if (num == 0)
            System.out.println(1);
        else if(num<0)
            System.out.println("Sorry, factorial does not exist for negative number.");
        else
        {
            for (i = num; i > 0; i--) {
                result *= i;
            }
            System.out.println(result);
        }
    }
}