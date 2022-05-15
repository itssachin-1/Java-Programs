/* Write a class named Duplicate that use a method named..... long duplicateDigits(long n) that,
 given a long integer n that is here guaranteed to be positive, returns the integer constructed by writing its digits twice in a row.

For example, when called with argument 1504, this method would return 15041504.
You may not convert n to a string at any time, but must calculate the answer using only loops, conditions and basic integer arithmetic.
Your method must work correctly for all positive values of n less than one million.
(Hint: think of how you would check whether n consists of one digit, and how you would calculate the duplicated number in such case.
Then think of two digits, three digits, four digits and higher until you can see and can implement the general pattern.)
*/
import java.util.Scanner;

public class Duplicate {
    long n;
    long duplicateDigits(){
        int count=0;
        long dn=0;

        // counting number of digits
        long tmp = n;
        while(tmp!=0){
            count++;
            tmp /= 10;
        }

        long[] dupNum= new long[count*2];
//       Adding numbers
        for(int i = count-1; i >= 0; i--) {
            dupNum[i]= n%10;    // finding last digit
            n/=10;              // changing place value of number
        }

//       Adding duplicate numbers
        for(int i = count, j=0; i <= count*2 && j<count; i++, j++) {
            dupNum[i]= dupNum[j];
        }

//        System.out.println(Arrays.toString(dupNum));
        for (int i = 0; i < count*2; i++) {
            dn+=dupNum[i];  // adding number to dn which is initially 0
            dn*=10;         // changing place value of number
        }
        return dn/10;       // removing extra 0
    }
    public static void main(String[] args) {
        Duplicate d= new Duplicate();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive number greater than zero: ");
        d.n= s.nextInt();
        while(d.n <= 0){
            System.out.println("Try again! Enter another number: ");
            d.n= s.nextInt();
        }
        System.out.println(d.duplicateDigits());
    }
}
// Algorithm:
// Take a number from user
// count no. of digit by doing num/10 in a loop
// create an array of double the size of count
// add number's digit one by one into the array by finding last digit using num%10 and changing place by num/10 in loop
// assign same array values to other half using another loop to get duplicate number
// now to print without using string take a var which is initially zero and add arrays element to it and multiply by 10 to change place value. do it loop and print var.
