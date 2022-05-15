// Write a user-defined function to find the sum of an array passed as argument.
// Write a program that declares an array of 10 elements and uses this function to
// a) Find the sum of all elements.
// b) Find the sum of first 5 elements.
// c) Find the sum of last 5 elements.
package itssachin.assignments2;
import java.util.Arrays;

public class SumOfAll {
    static void sumUp(int... a) {
        int sum = 0, sum5=0, suml5=0;

        for (int e : a) {
            sum += e;
        }
        System.out.println("Sum of all numbers: "+sum);

        for (int i = 0; i < 5; i++) {
            sum5 += a[i];
        }
        System.out.println("Sum of first 5 numbers: "+sum5);


        for (int i = a.length-1; i >= (a.length-5); i--) {
            suml5 += a[i];
        }
        System.out.println("Sum of last 5 numbers: "+suml5);
    }
    public static void main(String[] args) {
        int[] arr= {11,21,32,43,51,62,76,87,90,100};
        System.out.println(Arrays.toString(arr));
        sumUp(arr);
    }
}
