// Build a class which has references to other classes. Instantiate these reference variables and invoke instance methods.
package itssachin.assignments2;

public class ReferenceVariable {
    int[] arr= {2, 3, 4, 5, 7};

    void sumArray(){
        int sum=0;
        for (int e : arr) {
            sum+=e;
        }
        System.out.print(sum);
    }
}
class RefMain{
    public static void main(String[] args) {
        ReferenceVariable rv = new ReferenceVariable(); // creating reference variable "rv" of class ReferenceVariable
        rv.sumArray();
    }
}
