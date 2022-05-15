/*
Write a Java Program for Star Patterns
a.Square Star Pattern
      ****
      ****
      ****
      ****
b.Triangle Star Pattern
  *
  **
  ***
  ****
c.Inverted Pyramid
 *******
  *****
   ***
    *
*/
package itssachin.assignments2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class StarPattern {
    static int size;

    public static void squarePattern(int n){
        for (int i=0; i< n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
//            IntStream.range(0, n).map(i -> '*').forEach(System.out::print);
            System.out.println();
        }
        System.out.println();
    }

    public static void trianglePattern(int n){
        for (int i=0; i< n; i++) {
            int tmp=i;
            for (int j = tmp; j >=0; j--) {
                System.out.print('*');
            }
//            IntStream.range(0, n).map(i -> '*').forEach(System.out::print);
            System.out.println();
        }
        System.out.println();
    }

    public static void invertedTrianglePattern(int n){
        int tmp=n;

        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int r = tmp-1; r >0; r--) {
                System.out.print("*");
            }
            for (int c = tmp; c >0; c--) {
                System.out.print("*");
            }
            tmp--;
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of pattern: ");
        size = s.nextInt();
        squarePattern(size);
        trianglePattern(size);
        invertedTrianglePattern(size);
    }

}
