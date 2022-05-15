// Create a class named 'Member' having the following members: Data members
// Name, Age, Phone number, Address, Salary
// It also has a method named 'printSalary' which prints the salary of the members.
// Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
// Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
package itssachin.assignments2;

public class Member {
    private String name;
    private int age;
    private String phone;
    private String address;
    private double salary;

    public Member(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }
    void getMember(){
        System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone: "+phone+"\nAddress: "+address);
    }

    public void printSalary() {
        System.out.println("Salary " + salary);
    }
}

class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, String phone, String address, double salary, String specialization) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }
    void getEmployee(){
        getMember();
        System.out.println("Specialization: "+specialization);
    }
}

class Manager extends Member{
    private String department;

    public Manager(String name, int age, String phone, String address, double salary, String department) {
        super(name, age, phone, address, salary);
        this.department = department;
    }
    void getManager(){
        getMember();
        System.out.println("Department: "+department);
    }
}

class MemberMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Person-1(Emp)", 27, "+910122333444", "Plot-No:367, Golden-park-apartment, xcity", 30000, "Java");
        Manager mgr = new Manager("Person-2(Mgr)", 50, "+915556667770", "Plot-No:467, Swami-Kunj-apartment, ycity", 60000, "IT");

        emp.getEmployee();
        emp.printSalary();

        mgr.getManager();
        mgr.printSalary();
    }
}