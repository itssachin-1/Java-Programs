// Design a Java program to get a string and do the following in the same program.
// 1) Get a character. Find the occurrence of the character from right and left side. Display that information separately.
// 2) Get a positive integer from user and find the character of the index such that should not create run time error.

import java.util.Scanner;

public class CharIndex {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str= s.nextLine();
        System.out.println("-------------------------------------");

        System.out.print("Enter the character to be found: ");
        char c = s.next().charAt(0);

        rightOccurrence(str, c);
        leftOccurrence(str, c);

        System.out.println("-------------------------------------");
        System.out.print("Enter the index of char to be found(Index starts from 0): ");
        int index= s.nextInt();
        charAtIndex(str, index);

        s.close();  // Closing Scanner obj to free up resources and avoid memory leaks.
    }

    static void rightOccurrence(String str, char c){
        boolean flag=false;
        int lIndex=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                flag=true;
                lIndex=i;
                break;
            }
        }
        System.out.println((flag)? c + " is found at: " + lIndex + "th location from left.":c + " is not found in the given string.");
    }
    static void leftOccurrence(String str, char c){
        boolean flag=false;
        int rIndex=0;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i)==c){
                flag=true;
                rIndex=i;
                break;
            }
        }
        System.out.println((flag)? c + " is found at: " + rIndex + "th location from right.":c + " is not found in the given string.");
    }

    static void charAtIndex(String str, int idx){
        boolean flag=false;
//        Using charAt() method of String
//        for(int i=0; i<str.length(); i++){
//            flag= idx == i;
//        }
//        System.out.println((!flag)?"Please enter the correct index!":"The char at index "+idx+": "+str.charAt(idx));


//      Using array of chars.
        char[] ch = str.toCharArray();  // converting string to array of chars.
        for(int i = 0; i<ch.length; i++){
//            (i == idx)? flag=true : flag=false;   // error variable expected found value
            if (i == idx) {
                flag = true;
                break;
            }
        }
        System.out.println((!flag)?"Please enter the correct index!":"The char at index "+idx+": "+ch[idx]);
    }
}
