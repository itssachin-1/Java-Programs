// Design a Java Program to get a matrix as input and print the transpose of the given matrix.
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        byte r, c;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of rows in matrix: ");
        r= s.nextByte();
        System.out.println("Enter number of column in matrix: ");
        c= s.nextByte();

        int[][] matrix= new int[r][c];
        System.out.println("Enter elements in matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("matrix["+i+"]["+j+"]: ");
                matrix[i][j]=s.nextInt();
            }
        }

//        System.out.println(matrix.length);
//        for (int[] row: matrix) {
//            System.out.println();
//            for (int col: row) {
//                System.out.print(col+" ");
//            }
//        }
//        System.out.println(Arrays.deepToString(matrix));

        System.out.println("--------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            if(i==matrix.length/2)
                System.out.print("\t\t M =");
            else
                System.out.print("\t\t\t");

            for (int j = 0; j < matrix[i].length; ++j){
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        for(int i=0; i<c; i++){
            System.out.println();
            if(i==matrix.length/2)
                System.out.print("\t\t M\u0027 =");
            else
                System.out.print("\t\t\t");
            for (int j = 0; j < r; ++j) System.out.print("\t" + matrix[j][i]);
        }
        System.out.println("\n--------------------------------");

    }
}
