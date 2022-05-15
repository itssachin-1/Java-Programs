// Design a Java program to get a number from user and find the given number is positive or negative. Display the message.

public class PosNeg {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a < 0) {
            System.out.println(args[0]);
            System.out.println("The number is a negative number.");
        } else if (a == 0)
            System.out.println("The number is Zero(neither positve nor negative).");
        else
            System.out.println("The number is a positive number.");
    }
}
