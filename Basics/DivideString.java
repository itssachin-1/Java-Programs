// Write a Java program to get a string from user. Divide the given string into 5 equals parts and make those part as new string.
// At last, print all information. Apply the necessary conditions
import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        String str;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string: ");
        str= s.nextLine();

        int len=str.length(), e=0;
        String parts="";
        String[] sArr= new String[5];
        if(len%5!=0)
            System.out.println("This string can't be divided into 5 equal parts.");
        else{
            int lenCount=0;
            for (int i=0; i<len; i++){
                parts += str.charAt(i);
                lenCount++;
                if(lenCount%(len/5)==0){
                    sArr[e]=parts;
                    e++;
                    parts="";
                }
            }
            for (int i = 0; i < 5; i++) {
                String string = sArr[i];
                System.out.println(string);
            }
        }
    }
}
