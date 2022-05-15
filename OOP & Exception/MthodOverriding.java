// Write a program to give the example for method overriding concepts.
package itssachin.assignments2;

public class MthodOverriding {
    void eat(){
        System.out.println("Eating...");
    }
    void sleep(){
        System.out.println("So tired!! I'm feeling sleepy...");
    }
    void code(){
        System.out.println("Coding is cool!");
    }
    void repeat(){
        eat();
        sleep();
        code();
    }
}
class derivedClass extends MthodOverriding {
    void eat(){
        System.out.println("Student should eat less.");
    }
    void sleep(){
        super.sleep();
        System.out.println("Can't sleep.. I have work to finish.");
    }
    @Override   // It is not necessary to write @Override, but it is highly recommended. As in case of spelling mistake it can lead to completely unexpected behaviour.
    void code(){
        System.out.println("Coding is a skill best acquired by practice and example rather than just reading from books.");
    }

    @Override
    void repeat() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Life of coders: Eat() --> Sleep() --> Code --> Repeat()");
    }

    public static void main(String[] args) {
        derivedClass dc= new derivedClass();
        dc.eat();
        dc.sleep();
        dc.code();
        dc.repeat();
    }
}