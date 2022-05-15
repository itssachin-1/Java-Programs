// Design a class to store account details of a person like account number, name, account type, available balance and minimum balance.
// Define methods to get input, display account details, show balance, deposit and withdraw.
// Apply the condition while withdraw money from account that the minimum balance to be maintained.

import java.util.Scanner;

public class AccountDetails {
    private int accountNumber;
    final int  minimumBalance=1500;
    private double  availableBalance, d, w;
    private String name, accountType;

    void setInfo(int accountNumber, double availableBalance, String name, String accountType){
        this.accountNumber= accountNumber;
        this.availableBalance= availableBalance;
        this.name= name;
        this.accountType= accountType;
    }
    void displayBalance(){
        System.out.println("Current Balance: "+availableBalance);
    }
    void accountDetails(){
        System.out.println("____________________________________");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Name: "+name);
        System.out.println("Account Type: "+accountType);
        System.out.println("Available Balance: "+availableBalance);
        System.out.println("Minimum Balance Required: "+minimumBalance);
        System.out.println("------------------------------------");
    }
    void deposit(){
        System.out.println("You deposited: "+d);
        availableBalance+=d;
        displayBalance();
    }

    void withdraw(){
        if(availableBalance-w>= minimumBalance){
            System.out.println("You withdrawn: "+w);
            availableBalance-=w;
            displayBalance();
        }
        else if(availableBalance==minimumBalance)
            System.out.println("You can't withdraw money!\n Low Balance!!!");
        else
            System.out.println("You can't withdraw this amount!\nminimum required balance reached.");
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        AccountDetails acc= new AccountDetails();
        acc.setInfo(100010010, 1500, "xyz", "Savings");
        acc.accountDetails();
        System.out.println("Enter the amount you want to deposit: ");
        acc.d= s.nextInt();
        acc.deposit();
        System.out.println();

        System.out.println("Enter the amount you want to withdraw: ");
        acc.w= s.nextInt();
        acc.withdraw();
        System.out.println("____________________________________");
    }
}
