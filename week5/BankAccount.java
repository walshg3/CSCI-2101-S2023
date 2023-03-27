package week5;

    import java.util.Scanner;
    /*
     * Appas Bank
     * Bank Account Parameters:
     * public Name -> String ✓
     * private Balance -> double ✓ 
     * private Date of Birth -> String ✓
     * private SSN -> int (Maybe String) ✓
     * private Account Number -> int ✓
     * 
     * Bank Account Methods:
     * Constructor 
     * Getters and Setters
     * Deposit
     * Withdraw
     * Transfer (HomeWork)
     * Balance
     * Menu
     * Compound Interest
     * Simple Interest (HomeWork)
     * Authentication Basic
     * Authentication Advanced (HomeWork?)
     * 
     * Bank Account Constructor
     * Name, Balance, SSN, Account Number, Date of Birth
     * Name, SSN
     */

public class BankAccount {

    // Bank Account Parameters
    public String name;
    private double balance;
    private String dob;
    private int ssn;
    private int accountNumber;




    // Bank Account Constructor
    public BankAccount(String name, int ssn, double balance, int accountNumber, String dob) {
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.dob = dob;
    }

    // Bank Account Constructor
    public BankAccount(String name, int ssn) {
        this.name = name;
        this.ssn = ssn;
    }


    // Bank Account Methods

    // Note you do need to create a getter for public variables however it is best practice to create a getter for all variables

    /*
     * Getters and Setters
     */

    public String getName() {
        return this.name;
    }

    public double getbalance() {
        return this.balance;
    }

    public String getdob() {
        return this.dob;
    }

    public int getssn() {
        return this.ssn;
    }

    public int getaccountNumber() {
        return this.accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
     * Should only be used by during the creation of the account never after instead see deposit and withdraw
     */
    public void setbalance(double balance) {
        this.balance = balance;
    }

    public void setdob(String dob) {
        this.dob = dob;
    }

    public void setssn(int ssn) {
        this.ssn = ssn;
    }

    public void setaccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }





    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }


    // Create a mthod that will subtract a mothly fee from the balance
    // this method will take a double as a parameter
    // this method will subtract the fee from the balance
    // Netflix subscription is $12.99
    public void monthlyFee(double fee) {
        withdraw(fee);
    }


    // Create a method that will print a menu to the user
    // This is called a helper method / function
    public static int menu() {
        int choice;
        Scanner input = new java.util.Scanner(System.in);
        System.out.println("Welcome to Appas Bank");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");
        System.out.println("4. Balance");
        System.out.println("5. Compound Interest");
        System.out.println("6. Simple Interest");
        System.out.println("0. Exit");
        System.out.println("Please enter your choice: ");
        choice = input.nextInt();
        return choice;
    }

    public void compoundInterest(double rate, int years) {
        double interest = this.balance * Math.pow((1 + rate), years);
        this.balance += interest;
    }

    public void simpleInterest(double rate, int years) {
        double interest = this.balance * rate * years;
        this.balance += interest;
    }

}
//     public static void main(String[] args) {
//         System.out.println("Hello World");

//         BankAccount myAccount = new BankAccount("Appa", 1000, 123456789, 123456789, "01/01/2000");
//         BankAccount yourAccount = new BankAccount("Momo", 123456789);

//         myAccount.deposit(100);
//         myAccount.withdraw(50);
//         myAccount.transfer(100, yourAccount);
//         System.out.println(myAccount.balance());
//         System.out.println(yourAccount.balance());
//         myAccount.menu();
//         myAccount.compoundInterest(0.05, 5);
// }