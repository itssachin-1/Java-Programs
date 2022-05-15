// Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed.
// The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat;
// otherwise it should terminate.

package itssachin.assignments2;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        double sum=0, num1, num2;
        char options;
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Enter two numbers: ");
            num1= s.nextInt();
            num2= s.nextInt();
            sum= num1+num2;
            System.out.println(sum);
            System.out.println("Do want to do the sum again? Y/N?");
            options= s.next().charAt(0);
        }while(options == 'y'|| options== 'Y');
    }
}
