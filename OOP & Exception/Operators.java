// Write a program to give the examples of operators.
// 1) Increment and decrement operators.
// 2) Bitwise Complement Operator.
// 3) Arithmetic operator. 4) Relational Operator 5) Bitwise operator.
// 6) Conditional Operator
package itssachin.assignments2;

public class Operators {
    public static void main(String[] args) {
        int a=3, b=7, c=6;
        double d=5.6;

        System.out.println("Original values: "+"a="+a+ ", b="+b+" ,c="+c+" ,d="+d);
        System.out.println("----------------------------------------------------------");

//      ArithmeticOperators (+, -, *, /, %,) (precedence: *, /, % --> +, -) (Associativity: left-to-right)
        System.out.println("Arithmetic Operators: ");
        System.out.println("(a + b - c * c / a % b)= "+(a + b - c * c / a % b));
        System.out.println("----------------------------------------------------------");

//      Increment Decrement Operators (++,--) (Associativity-prefix: right-to-left)
        System.out.println("Increment-Decrement Operators: ");
        System.out.println("Current values: "+"a="+a+ ", b="+b+" ,c="+c+" ,d="+d);
        System.out.println("++a = "+(++a)+" | --b = "+(--b)+" | c-- = "+(c--)+"| d++ = "+(d++));
        System.out.println("Values after increment and decrement: "+"a="+a+ ", b="+b+" ,c="+c+" ,d="+d);
        System.out.println("----------------------------------------------------------");

//      Relational Operators(<, <=,>,›=, ==, !=)
//      Conditional Operators(?:)  (Associativity: right-to-left)
        System.out.println("Relational & Conditional Operators: ");
        System.out.println("((b > a) ? (false ? ((a < c) ? c : d) : a) : b)= "+((b > a) ? (false ? ((a < c) ? c : d) : a) : b));
        if(a==b)
            System.out.println("a == b");
        if(a!=b)
            System.out.println("a != b");
        if(b >= a || c<=a)
            System.out.println("True");
        System.out.println("----------------------------------------------------------");

//      Bitwise Operators(" <<,>>, &, ^, |)
        System.out.println("Bitwise Operators: ");
        System.out.println("a: 0b"+Integer.toBinaryString(a)+" | b: 0b"+Integer.toBinaryString(b)+" | c: 0b"+Integer.toBinaryString(c));
        System.out.println("a|b= "+(a|b)+"(0b"+Integer.toBinaryString(a|b)+")");    //Bitwise OR
        System.out.println("a&b= "+(a&b)+"(0b"+Integer.toBinaryString(a&b)+")");    //Bitwise AND
        System.out.println("a^b= "+(a^b)+"(0b"+Integer.toBinaryString(a^b)+")");    // Bitwise XOR

        byte x= 5;
        byte y= 0b101;
        System.out.println("x: 0b"+Integer.toString(x, 2)+" | y: 0b"+Integer.toString(y,2));
        System.out.println("a<<1 : "+ (x<<1)+"(0b"+Integer.toBinaryString(x<<1)+")");
        System.out.println("a>>1 : "+ (y>>1)+"(0b"+Integer.toBinaryString(y>>1)+")");
        System.out.println("----------------------------------------------------------");

    }
}

//    Assignment Operators (=,+=,-=, *=, /= )   (Associativity: right-to-left)
//    Logical Operators (!, &&, ||)
