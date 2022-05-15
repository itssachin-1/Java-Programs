// Compute mean and Standard deviation
import java.util.Scanner;

public class MSD {
    static int n;
    static double mean(double[] x, int n){
        double mean=0;
        for (double e:x) {
            mean+=e;
        }
        mean/=n;
        return mean;
    }
    static double stdDeviation(double[] x, int n){
        double sd=0, mean;
        mean= mean(x, n);
//        System.out.println(mean);
        for (int i = 0; i < n; i++) {
            sd+=Math.pow((x[i]-mean),2)/n;
        }
        sd= Math.sqrt(sd);
        return sd;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n= s.nextInt();
        double[] x= new double[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            x[i]= s.nextDouble();
        }
        System.out.println("Mean: "+mean(x, n));
        System.out.println("Standard deviation: "+stdDeviation(x, n));

    }
}
