// Write a program that randomly generates an integer between 0 and 100, inclusive. The program
// prompts the user to enter a number continuously until the number matches the randomly generated number.
// For each user input, the program tells the user whether the input is too low or too high, so the user can choose the next input intelligently.
import java.util.Scanner;

public class RandomNumber {
    static int randomNumber= (int)(Math.random()*100);

    public static void main(String[] args) {
        int num;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter(Guess) the number: ");
        num = s.nextInt();
        checkNum(num);

        while(num!= randomNumber){
            num = s.nextInt();
            checkNum(num);
        }
    }
    static void checkNum(int num){
        if(num==randomNumber){
            System.out.println("Correct! You got it.");
        }
        else if(num+10<randomNumber)
            System.out.println("too low!");
        else if(num<randomNumber){
            System.out.println("You're close!");
        }
        else if (num+10>randomNumber)
            System.out.println("too high!");
        else
            System.out.println("You're close!");
    }
}
