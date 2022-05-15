// Write a program to calculate the following
// 1 Find the length of array.
// 2 Demonstrate a one-dimensional array.
// 3 Demonstrate a two-dimensional array.
// 4 Demonstrate a multidimensional array.
package itssachin.assignments2;
import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    static int[] arr1= {1,2,3,4,5};

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[][] arr2= new int[2][3];
        int[][][] arr3= new int[2][3][2];
        System.out.println("Length of arr1 is: "+ arr1.length);

        System.out.println("Enter elements of 2*3 2d-array: ");
        for(int r=0; r<2; r++){
            for (int c = 0; c < 3; c++) {
                arr2[r][c]= s.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr2));

        System.out.println("Enter elements of 2*3*2 3d-array: ");
        for(int r=0; r<2; r++){
            for (int c = 0; c < 3; c++) {
                for (int i = 0; i < 2; i++) {
                    arr3[r][c][i]= s.nextInt();
                }
            }
        }
        System.out.println(Arrays.deepToString(arr3));
    }
}
