// Create a class Employee and encapsulate the data members
package itssachin.assignments2;

public class Emp {      // Employee class is used in previous examples so using Emp
    private int employeeId;
    private String employeeName;
    private String department;

    public Emp setEmployee(int employeeId, String employeeName, String department) {
        this.employeeId= employeeId;
        this.employeeName= employeeName;
        this.department= department;
        return this;
    }

    public void getEmployee() {
        System.out.println("ID: "+employeeId);
        System.out.println("Name: "+employeeName);
        System.out.println("Department: "+department);
    }

    public static void main(String args[])
    {
        Emp e=new Emp();
        e.setEmployee(1, "xyz", "IT");
        e.getEmployee();
    }
}
