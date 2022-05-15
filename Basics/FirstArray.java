// Write Java code statements that accomplish the tasks listed below a) Declare an array of integers.
// b) Allocate storage to allow 5 integers to be stored in the array.
// c) Populate the array with the values: 1, 8, 27, 64, 125
// d) Replace the third array element with the value -7.
// e) Copy the value of the fifth array element to the first array storage location.
// f) Subtract the value stored in the second array storage location from the value stored in the
// third and store the difference in the fourth array storage location. g) Compute the sum of the array elements with subscripts 1 to 3.

import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {
//       int arr[]= new int[5];
        int[] arr = {1, 8, 27, 64, 125};
        System.out.println("--> The original array: "+ Arrays.toString(arr));
        arr[2]= -7;  // Replacing the third array element with the value -7
        System.out.println("--> Replacing the third array element with the value -7: "+Arrays.toString(arr));

        arr[0]= arr[4];     // [125, 8, -7, 64, 125] Copying the value of the fifth array element to the first array storage location.
        System.out.println("--> Copying the value of the fifth array element to the first array storage location: "+Arrays.toString(arr));

        arr[3]=arr[2]-arr[1];   // [125, 8, -7, -15, 1]
        System.out.println("--> Subtracting the value stored in the second array storage location from the value stored in the \n" + "third and storing the difference in the fourth array storage location: "+Arrays.toString(arr));

//       System.out.println(arr[0]+arr[1]+arr[2]);
        int sum=0;
        for(int i=0; i<3; i++){
            sum+=arr[i];
        }
        System.out.println("\n--> Sum of the array elements with subscripts 1 to 3.: "+sum);
    }
}
