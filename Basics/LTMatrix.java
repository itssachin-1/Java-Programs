// Develop a Java program to get a matrix and print the lower triangle of the matrix.
// Apply the necessary conditions if it required.
import java.util.Scanner;

public class LTMatrix {
    public static void main(String[] args) {
        byte n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of nxn matrix: ");
        n= s.nextByte();

        int[][] matrix= new int[n][n];
        System.out.println("Enter elements in matrix: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("matrix["+i+"]["+j+"]: ");
                matrix[i][j]=s.nextInt();
            }
        }
        System.out.println("\nThe required lower triangle matrix: ");
        for(int i=0; i<n; i++){
            System.out.print("\t\t\t");
            for(int j=0; j<n; j++)
                System.out.print((i>=j)?matrix[i][j]+"\t":0+"\t");
            System.out.println();
        }

    }
}
