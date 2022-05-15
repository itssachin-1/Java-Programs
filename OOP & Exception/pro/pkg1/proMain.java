package itssachin.assignments2.pro.pkg1;
import itssachin.assignments2.pro.pkg2.ProtectedMethod;

public class proMain extends ProtectedMethod {
    public static void main(String[] args){
        proMain ex = new proMain();
        ex.proMethod();
        System.out.println("Protected variable x: "+ex.x);
    }
}

//    Protected member can be access within the package and outside the package but within the child classes.
//    We can use child class to use protected member outside the package but only child class object can access it.