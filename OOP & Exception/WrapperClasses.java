// Use different methods of java defined wrapper classes.
package itssachin.assignments2;

public class WrapperClasses {

    public static void main(String[] args)
    {
        Integer myInt = 10;
        Double myDouble = 11.65;
        Character myChar = 'T';
        Boolean myBool= true;

        Integer intWrapper = Integer.valueOf("12345");
        System.out.println("Value of intWrapper Object: "+ intWrapper);

        //Converting from binary to decimal
        Integer intWrapper2 = Integer.valueOf("11011", 2);
        System.out.println("Value of intWrapper2 Object: "+ intWrapper2);

        //Converting from hexadecimal to decimal
        Integer intWrapper3 = Integer.valueOf("D", 16);
        System.out.println("Value of intWrapper3 Object: "+ intWrapper3);

        System.out.println("Hex value of intWrapper: " + Integer.toHexString(intWrapper));
        System.out.println("Binary Value of intWrapper2: "+ Integer.toBinaryString(intWrapper2));
    }
}
