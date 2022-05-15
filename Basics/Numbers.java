// Create a demo class in Java to demonstrate these methods with minimum of 3 objects
// Using loop statement write a program that prompts the user to enter 5 integer values:
// i. Find and display the Largest and Smallest number
// ii. Display whether the number is Even or Odd
// iii. Display whether the number is negative, positive or zero
// iv. Calculate the Sum and Average of the Even numbers

import java.util.Scanner;
public class Numbers {
    static int[] numbers= new int[5];

    static void largestSmallest(){
//        int tmp = 0;
//        for (int i = 0, j = i+1; i < 5 && j<5; i++, j++) {
//           if (numbers[i] >= numbers[j]){
//               // swapping numbers to short
//               tmp= numbers[j];
//               numbers[j]= numbers[i];
//               numbers[i]=tmp;
//           }
//        }
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("Largest number: "+numbers[4]);
//        System.out.println("Smallest number: "+numbers[0]);

//      Another way:
        //initialize min and max = arr[0]
        int min = numbers[0], max = numbers[0];
        for (int number : numbers) {
            if (number < min)
                min = number;

            if (number > max)
                max = number;
        }
        System.out.println("Largest number: "+max);
        System.out.println("Smallest number: "+min);
        System.out.println("__________________________");
    }
    static void evenOdd(){
        for (int i = 0; i < 5; i++) {
            if(numbers[i]%2==0)
//              zero is considered as an even number. It is also an integer that is divisible by  2.
                System.out.println(numbers[i]+" is an even number.");
            else
                System.out.println(numbers[i]+" is an odd number.");
        }
        System.out.println("__________________________");
    }
    static void npz(){
        for (int i = 0; i < 5; i++) {
            if(numbers[i]>0)
                System.out.println(numbers[i]+" is a positive number.");
            else if(numbers[i]==0)
                System.out.println(numbers[i]+" is Zero.");
            else
                System.out.println(numbers[i]+" is a negative number.");
        }
        System.out.println("__________________________");
    }
    static void sumAvg(){
        int sum=0, avg=0;
        for (int i = 0; i < 5; i++) {
            sum+=numbers[i];
        }
        avg= sum/5;
        System.out.println("The sum of numbers is: "+sum);
        System.out.println("The average is: "+avg);
        System.out.println("__________________________");
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("\nEnter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i]= s.nextInt();
        }
        System.out.println("__________________________");
        largestSmallest();
        evenOdd();
        npz();
        sumAvg();
    }
}
