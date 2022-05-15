// Get ‘n’ integer numbers from user and find the count of each unique number. Display the result as number – its count.
import java.util.Arrays;
import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        byte n;
        Scanner s= new Scanner(System.in);
        System.out.println("How many numbers you want to enter: ");
        n= s.nextByte();
        System.out.print("Enter numbers: ");
        int[] array= new int[n];
        for(int i=0; i<n; i++){
            array[i]=s.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        byte count=1;
        int[] arr= new int[n];
        for (int i=0, j=i+1; i<n && j<n; i++, j++){
            if(array[i]==array[j]){
                count++;
                if(i!=n-1)
                    continue;
            }

            if(count!=1){
                System.out.println(array[i]+" is the number presented for "+ count+" times");
//                arr[i]=array[i];
            }
            arr[i]=array[i];

            if(array[i]!=array[j])
                count=1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Unique numbers: ");
        for(int i=0; i<n; i++){
            if(arr[i]!=0)
                System.out.print(arr[i]+" ");
        }
    }
}
