// Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine.
// In this class the member functions are setdata and displaydata.
package itssachin.assignments2;

public class Room {
    private int number;
    private int area;
    private String acMachine;

    public void setData(int number, int area, String acMachine){
        this.number= number;
        this.area= area;
        this.acMachine= acMachine;
    }


    public void displayData(){
        System.out.println("Room No: "+number+"\tArea: "+area+"sqft. \tAC: "+acMachine);
    }

    public static void main(String[] args) {
        Room room = new Room();
        room.setData(107, 150, "Hitachi");
        room.displayData();
    }
}
