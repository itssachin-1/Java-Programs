// Design a Java program with your choice of a class to represent any real-world object. Illustrate constructors and this keyword.
public class Smartphone {
    String brand;
    String os;
    byte RAM;
    String processor;
    String display;
    short storage;

    // Constructor
    Smartphone(String brand, String os, byte RAM, String processor, String display, short storage){
        this.brand= brand;      // this keyword
        this.os= os;
        this.RAM= RAM;
        this.processor= processor;
        this.display= display;
        this.storage= storage;
    }
    void getInfo(){
        System.out.println("\nSmartphone Info:");
        System.out.println("___________________________________________");
        System.out.println("Brand: "+brand+" | "+"OS: "+os);
        System.out.println("RAM: "+RAM+"GB"+"       | "+"Processor: "+processor);
        System.out.println("Display: "+display+" | "+"Storage: "+storage+"GB");
    }

    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", "Android-12", (byte) 8,  "Snapdragon-865", "1080p", (short) 128);
        phone.getInfo();
     }
}
