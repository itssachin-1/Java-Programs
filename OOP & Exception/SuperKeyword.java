// Demonstrate the use of ‘super’ keyword.
// a) To refer to a member of super class.
// b) To call super class constructor from sub class constructor.
package itssachin.assignments2;

public class SuperKeyword {
    //Parent class or Superclass or base class
        int num = 100;
        double num2;
        SuperKeyword(double num2){
            this.num2= num2;
        }
}
class SubKey extends SuperKeyword {
        //Child class or subclass or derived class
        int num = 110;                      // same variable redeclare in subclass
        String str;
        SubKey(String str){
            super(5.6);              // calling super class constructor
            this.str=str;

        }

        void printNumber(){
            System.out.println(super.num);  // accessing superclass variable
            System.out.println(num2);
            System.out.println(str);
        }
        public static void main(String[] args){
            SubKey obj = new SubKey("abc");
            obj.printNumber();

        }
}
