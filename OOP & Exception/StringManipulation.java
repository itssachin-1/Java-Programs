// Create String Demo class and perform different string manipulation methods
package itssachin.assignments2;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "Hello";
        String str1= str.concat("Java!");
        String str2= "hello";
        String str3= new String("Hello");

        System.out.println("str1: "+str1);
        System.out.println("str.charAt(2): "+str.charAt(2));
        System.out.println("str.indexOf(0): "+str.indexOf(0));
        System.out.println("str.toLowerCase(): "+str.toLowerCase());
        System.out.println("str.toUpperCase(): "+str.toUpperCase(Locale.ROOT));

        System.out.println("str.compareTo(str2): "+str.compareTo(str2));
        System.out.println("str==str3: " + str==str3);
        System.out.println("str==str2: " + str==str2);
        System.out.println("str.compareToIgnoreCase(str2): "+str.compareToIgnoreCase(str2));
        System.out.println("str.compareTo(str3): "+str.compareTo(str3));

        System.out.println("str.contains(\"Hel\"): "+str.contains("Hel"));
        System.out.println("str.endsWith(\"lo\"): "+str.endsWith("lo"));
        System.out.println("str.startsWith(\"H\"): "+str.startsWith("H"));    // must have to provide String not char
        System.out.println("str.startsWith(\"h\"): "+str.startsWith("h"));    // must have to provide String not char
        System.out.println("str2.replace(\"lo\", \"p\"): "+str2.replace("lo", "p"));

        System.out.println("str2.getBytes(): "+str2.getBytes(StandardCharsets.UTF_8));
//        System.out.println("str.split(\" \", 3): "+str.split(" ", 3));

    }
}
