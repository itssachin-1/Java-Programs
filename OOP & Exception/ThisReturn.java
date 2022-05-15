// Write a program to give the example for ‘this’ operator. And also use the ‘this’ keyword as return statement.
package itssachin.assignments2;

public class ThisReturn {
    int a;
    int b;
    double c;

    ThisReturn(){
//        this(10, 17);         // this() must be the first statement
        System.out.println("This line is printing from inside default constructor.");
    }

    public ThisReturn(int a, int b) {
        this();                 // this() : to invoke current class constructor
        this.a = a;             // Using ‘this’ keyword to refer current class instance variables
        this.b = b;
    }
    public ThisReturn(int a, int b, double c){
        this(a, b);             // constructor chaining: reusing constructor
        this.c= c;
    }
    // Method that receives 'this' keyword as parameter
    void sum(ThisReturn ob){
        System.out.print("The sum of a and b is: ");
        System.out.println(ob.a+ob.b);
    }

    // Method that returns current class instance
    void getSum(){
        sum(this);
    }

    public void showData(){
//        System.out.println("Printing this: "+this);
        System.out.println("Value of A ="+a);
        System.out.println("Value of B ="+b);
        System.out.println("Multiplication of a and b: "+this.mul());        // Using ‘this’ keyword to invoke current class method
    }
    int mul(){
        return a*b;
    }

    ThisReturn get(){       // Here return type must be the class type (non-primitive)
        this.a=6;
        this.b=1;
        return this;         // returning this: returns the current obj of instance method get()
    }

    public static void main(String[] args){
        ThisReturn obj = new ThisReturn(4, 7);
//        System.out.println("Printing obj of ThisReturn class: "+obj);
        obj.showData();
        System.out.println("Multiplication of a and b by get(): " + obj.get().mul());       // a and b will update here & after
        obj.getSum();

    }

}
