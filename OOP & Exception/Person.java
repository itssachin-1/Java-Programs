// Define a base class person and a derived class employee with single inheritance.
// Define SetData() member functions in each of the class with different signatures to set the data members and demonstrate overloading of member functions.
// Define GetData() member functions in each of the class with same signatures to display data and demonstrate overriding of member functions.
// package itssachin.assignments2;

public class Person {
    String name;
    int id;
    double salary;
    char gender;

    public void setData(String name, int id, char gender, double salary){
        this.name= name;
        this.id= id;
        this.gender= gender;
        this.salary= salary;
    }

    public void getData(){
        System.out.println("Name:\t\t"+name+"\nID:\t\t\t"+id+ "\nGender:\t\t"+gender+"\nSalary:\t\t"+salary);
    }
}

class Employee extends Person{
    String department;
    // Overloading the setData method of super-class with one more parameter i.e. department.
    public void setData(String name, int id, char gender, double salary, String department){
        super.setData(name, id, gender, salary);
        this.department= department;
    }
    @Override
    public void getData(){
        super.getData();
        System.out.println("Department: "+department);      // Overriding the behaviour of superclass getData method by printing one more statement.
    }
}
class TestPerson{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setData("xyz", 110, 'F', 40000, "Engineering");
        emp.getData();
    }
}