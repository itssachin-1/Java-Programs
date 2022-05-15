// Design a Java program to get ‘n’ numbers and a number. Apply the linear search and binary search.
// Find the best algorithm through the computation and display the result.
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class lBSearch {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= s.nextInt();
        int[] numbers= new int[size];

        System.out.println("Enter elements of the array: ");
        for (int i=0; i<size; i++) {
            numbers[i]= s.nextInt();
        }

        System.out.println("Enter the number you want to search: ");
        byte num= s.nextByte();


        System.out.println("-----------Linear Search-----------");
        long start2 = System.nanoTime();

        int lResult= lSearch(numbers, num);
        if(lResult==-1)
            System.out.println(num+" is not found in given array of numbers.");
        else
            System.out.println(num+" is found at index: "+lResult);

        long end2 = System.nanoTime();
        long timeElapsed = (end2 - start2);
        System.out.println("Execution time of Liner Search is: "+timeElapsed/1000000 + "ms\n");


        System.out.println("-----------Binary Search-----------");
        Instant start1= Instant.now();

        Arrays.sort(numbers);
        System.out.println("Sorted Array: "+Arrays.toString(numbers));
        int bResult= bSearch(numbers, num, 0, size-1);
        if(bResult==-1)
            System.out.println(num+" is not found in given array of numbers.");
        else
            System.out.println(num+" is found at index: "+bResult);

        Instant end1= Instant.now();
        Duration timeElapsed1 = Duration.between(start1, end1);
        System.out.println("Execution time of Binary Search is: "+timeElapsed1.toMillis() + "ms\n");

        System.out.print((timeElapsed<timeElapsed1.toMillis())?"Here linear search took less time so linear search is best for this case.":"Binary search took very less time than linear search, so Binary search is better & efficient.");
        s.close();
    }

    static int lSearch(int[] numbers, byte num){
        for (int i=0; i<numbers.length; i++){
            if(numbers[i] == num)
                return i;
        }
        return -1;
    }

     static int bSearch(int[] numbers, byte num, int low, int high){
        int mid= (low+high)/2, result=0;
//        int mid = low + (high - low) / 2, result=0;
         if (low > high) {
             result=-1;
         }
        else if(num==numbers[mid]) {
            result = mid;
        }
        else if(num>numbers[mid]){
            result= bSearch(numbers, num, mid+1, high);
        }
        else {
            result= bSearch(numbers, num, low, mid-1);
        }

        return result;
    }
}