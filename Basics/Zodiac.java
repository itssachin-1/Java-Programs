// Write a Java program that will read in month and day (as numerical value).
// The program will return the equivalent zodiac sign.

import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        int month, day;     // instances of class
        Scanner s= new Scanner(System.in);

        System.out.println("Enter month: ");
        month= s.nextInt();
        System.out.println("Enter day: ");
        day= s.nextInt();

        String m = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Incorrect month";
        };

        if(month==1 && day>=20 || month==2 && day<=18)
            System.out.println("Zodiac sign for "+ m+" "+day+" is Aquarius.");
        if(month==2 && day>=19 || month==3 && day<=20)
            System.out.println("Zodiac sign for "+ m+" "+day+" is Pisces.");
        if(month==3 && day>=21 || month==4 && day<=19)
            System.out.println("Zodiac sign for "+ m +" "+day+" is Aries.");
        if(month==4 && day>=20 || month==5 && day<=20)
            System.out.println("Zodiac sign for "+ m +" "+day+" is Taurus.");
        if(month==5 && day>=21 || month==6 && day<=20)
            System.out.println("Zodiac sign for "+ m +" "+day+" is Gemini.");
        if(month==6 && day>=21 || month==7 && day<=22)
            System.out.println("Zodiac sign for "+ m +" "+day+" is Cancer.");
        if(month==7 && day>=23 || month==8 && day<=22)
            System.out.println("Zodiac sign for "+ m +" "+day+" is Leo.");
        if(month==8 && day>=23 || month==9 && day<=22)
            System.out.println("Zodiac sign for "+ m +" "+day+" is Virgo.");
        if(month==9 && day>=23 || month==10 && day<=22)
            System.out.println("Zodiac sign for "+ m +" "+day+" is Libra.");
        if(month==10 && day>=23 || month==11 && day<=21)
            System.out.println("Zodiac sign for "+ m +" "+day+" is Scorpio.");
        if(month==11 && day>=22 || month==12 && day<=21)
            System.out.println("Zodiac sign for "+ m +" "+day+" is Sagittarius.");
        if(month==12 && day>=22 || month==1 && day<=19)
            System.out.println("Zodiac sign for "+ m +" "+day+" is Capricorn.");

    }
}


//
//    Aquarius (January 20 – February 18)
//    Pisces (February 19 – March 20)
//    Aries (March 21 – April 19)
//    Taurus (April 20 – May 20)
//    Gemini (May 21 – June 20)
//    Cancer (June 21 – July 22)
//    Leo (July 23 – August 22)
//    Virgo (August 23 – September 22)
//    Libra (September 23 – October 22)
//    Scorpio (October 23 – November 21)
//    Sagittarius (November 22 – December 21)
//    Capricorn (December 22 – January 19)
