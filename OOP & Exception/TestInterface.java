// Write a program to create interface named test. In this interface the member function is square.
// Implement this interface in arithmetic class. Create one new class called ToTestInt in this class use the object of arithmetic class.

package itssachin.assignments2;
public interface TestInterface {
    void square(int x);
}
class Arithmetic implements TestInterface{
    @Override
    public void square(int x){
        System.out.println("Square of "+x +": "+ x*x);
    }
}
class TestInt{
    public static void main(String[] args) {
        Arithmetic a= new Arithmetic();
        a.square(7);
        a.square(5);
    }
}