// Design a Java program to print the following pattern for the positive value ‘n’. Sample Output
//      *
//    * * *
//   * * * *
// * * * * * *

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner s= new Scanner(System.in);
        n= s.nextInt();
        for(int r=1; r<=n; r++){    // printing n-lines of star
            int c=r;
            for(int space=0; space<n-c; space++){
                System.out.print(" ");
            }
            while(c!=0){    // printing c-numbers of stars in a row
                System.out.print("* ");
                c--;
            }
            System.out.println();
        }
    }
}
