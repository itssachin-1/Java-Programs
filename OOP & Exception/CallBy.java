// Write a program for the following:
// 1. Example for call by value.
// 2. Example for call by reference.
package itssachin.assignments2;

class CallByValue{
    void m1(int x){         // call-by-value
        System.out.println(x);
    }
}

class CallByRference{
    private double y=7.2;

    void m2(CallByRference cr){
        cr.y = 15.7+y;
        System.out.println(cr.y);
    }
}

public class CallBy {
    public static void main(String[] args) {
        CallByValue cv = new CallByValue();
        cv.m1(6);

        CallByRference cr = new CallByRference();
        cr.m2(cr);
    }
}
