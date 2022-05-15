// Design a Java Program to represent time as class which contains the following:
// a. Hours, minutes and seconds as members.
// b. Basic Methods to get input, print the time.
// c. Method to find the difference between two times.
// Demonstrate these methods through few objects. Also apply the necessary conditions

import java.util.Scanner;

public class Time {
    int hours, minutes, seconds;
    void setTime(int hours, int minutes, int seconds){
        this.hours= hours;  // 'this' cannot be referenced from a static context
        this.minutes= minutes;
        this.seconds= seconds;
    }
//    void getTime(){
//        System.out.println(hours+":"+minutes+":"+seconds);
//    }
    void timeDifference(Time start, Time stop){
        int hr= Math.abs(stop.hours- start.hours);
        int mn= Math.abs(stop.minutes- start.minutes);
        int sec= Math.abs(stop.seconds- start.seconds);
        System.out.println("The Time difference: "+ hr+":"+mn+":"+sec);
    }

    public static void main(String[] args) {
//        Time t = new Time();
        Scanner s = new Scanner(System.in);
//        t.setTime(t.hours, t.minutes, t.seconds);
//        t.getTime();
        Time start= new Time();
        System.out.println("Please enter start Time as H M S: ");
        start.hours = s.nextInt();
        start.minutes = s.nextInt();
        start.seconds = s.nextInt();
        if(start.hours>24||start.minutes>60||start.seconds>60){
            System.out.println("Invalid Time!");
            System.out.println("Re-enter Time as H M S: ");
            start.hours = s.nextInt();
            start.minutes = s.nextInt();
            start.seconds = s.nextInt();
        }
        start.setTime(start.hours, start.minutes, start.seconds);

        Time stop= new Time();
        System.out.println("Please enter stop Time as H M S: ");
        stop.hours = s.nextInt();
        stop.minutes = s.nextInt();
        stop.seconds = s.nextInt();
        if(stop.hours>24||stop.minutes>60||stop.seconds>60){
            System.out.println("Invalid Time!");
            System.out.println("Re-enter Time as H M S: ");
            stop.hours = s.nextInt();
            stop.minutes = s.nextInt();
            stop.seconds = s.nextInt();
        }
        stop.setTime(stop.hours, stop.minutes, stop.seconds);

        Time d= new Time();
        d.timeDifference(start, stop);
    }

}
