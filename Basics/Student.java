// Design a Student class which contains register number, name, marks for three courses, average and result. Define methods to get input, print details, find the average and result (if mark is more than 49 in all courses then Pass, otherwise Fail).
// Keep input methods and print methods as public while others are private.
// Create array of objects for the Student class and demonstrate those methods
public class Student {
    private int registrationNumber;
    private String name;
    private double avg , result;
    private int  phyMarks, chemMarks,mathMarks;

    public void setInfo(int registrationNumber, String name, int p, int c, int m){
        this.registrationNumber = registrationNumber;
        this.name= name;
        this.phyMarks=p;
        this.chemMarks=c;
        this.mathMarks=m;
    }
    public void getInfo(){
        System.out.println("\nRegistration Number: "+registrationNumber);
        System.out.println("Name: "+name);
    }
    private void getResult(){
        System.out.println("\nResult: ");
        System.out.println("-------------------------------------");
        System.out.println("Physics: "+phyMarks+"\nChemistry: "+chemMarks+"\nMathematics: "+mathMarks);
        System.out.println((phyMarks>=49 && chemMarks>=49 &&mathMarks>=49)?"PASS":"FAIL");
        result= phyMarks+chemMarks+mathMarks;
        System.out.println("Total marks: "+result+"  out of 300");

    }
    private double avg(){
        avg= (phyMarks+chemMarks+mathMarks)/3.0;
        return avg;
    }

    public static void main(String[] args) {
        Student st= new Student();
        st.setInfo(11010111, "xyz", 70, 67, 56);
        st.getInfo();
        st.getResult();
        System.out.println("Average marks: "+st.avg());

    }
}