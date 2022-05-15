//  Write a Java program for Sorting elements of an array
package itssachin.assignments2;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        System.out.println("Enter size of the array: ");
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i]= s.nextInt();
        }

        int tmp=0;
        for (int i = 0;  i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] < arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
