// Write a Java program to get the age of a person and find the age group of that person as...

package itssachin.assignments1;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        byte age;
        System.out.println("Enter age: ");
        Scanner s= new Scanner(System.in);
        age= s.nextByte();

        if(age>=0 && age<3)
            System.out.println("Toddlers");
        else if(age>=4 && age<8)
            System.out.println("Kids");

        else if(age>=9 && age<12)
            System.out.println("Child");

        else if(age>=13 && age<18)
            System.out.println("Teens");

        else  if(age>=19 && age<40)
            System.out.println("Adults");

        else if(age>=41 && age<60)
            System.out.println("Matured Adults");

        else if(age>=61 && age<75)
            System.out.println("Seniors");

        else
            System.out.println("Super Seniors");

//        switch(age){
//            case 0: System.out.println("Toddlers");
//            case 9: System.out.println("Kids");
//            case 13: System.out.println("Child");
//            case 19: System.out.println("Teens");
//            case 41: System.out.println("Matured Adults");
//            case 61: System.out.println("Seniors");
//            default :
//                break;
//        }
    }
}

