// Write a program to Check if the given string is Palindrome or not.
package itssachin.assignments2;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        String str;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string: ");
        str= s.next();
        int len= str.length()-1;
        String tmp= "";
        for (int i = len; i >= 0; i--) {
            tmp += str.charAt(i);
        }
        System.out.println((tmp.equals(str))?str+" is a palindrome.":str+" isn't a palindrome.");
//        numPalindrome(123);
    }
}
//
//    static void numPalindrome(int x){
//        int count=0, tmp=x, tmp1=x, rev=0;
//        while(tmp!=0){
//            tmp= tmp/10;
//            count++;
//        }
//        for (int i = 0; i < count; i++) {
//            rev +=  (tmp1 % 10);
//            rev *= 10;
//            tmp1 /= 10;
//        }
//        rev /= 10;
//        System.out.println(rev);
//        System.out.println((rev==x)?"The number is a palindrome." :"The number isn't a palindrome.");
//    }
