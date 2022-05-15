// write a program To find the sum of command line arguments and count the invalid integers entered.
package itssachin.assignments2;

public class CLASum {
    public static void main(String... args) {
        int sum=0, count=0;
        for (String i: args) {
            try {
                sum += Integer.parseInt(i);
            }
            catch (NumberFormatException e) {
                System.err.println(e);
                count++;
            }
        }
        System.out.println("Sum= " + sum);
        System.out.println("Invalid= " + count);
    }
}
