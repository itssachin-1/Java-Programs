// Define a base class person and a derived class employee with single inheritance.
// Define SetData() member functions in each of the class with different signatures to set the data members and demonstrate overloading of member functions.
// Define GetData() member functions in each of the class with same signatures to display data and demonstrate overriding of member functions.
// modify and define a parametrized constructor and finalizer in each class.
// Demonstrate calling the constructor of the base class from the constructor of the derived class.
// Create objects of person and employee classes to show the order of invocation of constructors.
package itssachin.assignments2;
import java.util.Scanner;

public class PersonFinalize {
    String name;
    int id;
    double salary;
    char gender;
    Scanner s= new Scanner(System.in);
    public PersonFinalize(String name, int id, char gender, double salary){
        System.out.println("PersonFinalize class constructor invoked!");
        this.name= name;
        this.id=id;
        this.gender= gender;
        this.salary= salary;
    }

    public void getData(){
        System.out.println("Name:\t\t"+name+"\nID:\t\t\t"+id+ "\nGender:\t\t"+gender+"\nSalary:\t\t"+salary);
    }

    @Override
    protected void finalize() {
        // Originally finalize method does nothing, but here we override finalize() saying it to print some stmt
        // Calling of finalize is uncertain. Difficult to observe so we force JVM to call it by System.gc();
        System.out.println("Finalize method called in class PersonFinalize.");
    }
}

class EmployeeFinalize extends PersonFinalize{
    String department;

    // Overloading the setData method of super-class with one more parameter i.e. department.
    public EmployeeFinalize(String name, int id, char gender, double salary, String department){
        super(name, id, gender, salary);
        System.out.println("EmployeeFinalize class constructor invoked!");
        this.department= department;
    }
    @Override
    public void getData(){
        super.getData();
        System.out.println("Department: "+department);      // Overriding the behaviour of superclass getData method by printing one more statement.
    }
    @Override
    protected void finalize() {
        // Originally finalize method does nothing, but here we override finalize() saying it to print some stmt
        // Calling of finalize is uncertain. Difficult to observe so we force JVM to call it by System.gc();
        System.out.println("Finalize method called in class EmployeeFinalize.");
    }
}

class TestPersonFinalize{
    public static void main(String[] args) {
        System.out.println("Calling PersonFinalize class constructor!");
        PersonFinalize pf = new PersonFinalize("abc", 100, 'F', 25000);
        pf.getData();
        pf= null;
        System.gc();

        System.out.println("-----------------------");
        System.out.println("Calling EmployeeFinalize class constructor!");
        EmployeeFinalize emp = new EmployeeFinalize("xyz", 110, 'M', 40000, "Engineering");
        emp.getData();
        emp= null;
        System.gc();
    }
}