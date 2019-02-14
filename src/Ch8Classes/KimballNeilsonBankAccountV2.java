package Ch8Classes;
//this program simulates a vary simple bank account
public class KimballNeilsonBankAccountV2 {
    //state fields below
    private double balance;
    private int pin;
    //following state fields are required when constructing a bank account
    private String name;
    //ssn stands for social security number
    private String ssn;
    private Address address;
    //dob stands for date of birth
    private DateOfBirth dob;

    //constructors below
    public KimballNeilsonBankAccountV2(String name, String ssn, Address address, DateOfBirth dob){
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
    }
    public KimballNeilsonBankAccountV2(String name, String sSN, Address address, DateOfBirth dob, double balance, int pin){
        this.name = name;
        this.ssn = sSN;
        this.address = address;
        this.dob = dob;
        this.balance = balance;
        this.pin = pin;
    }

    //behaviors below
    //getters
    public String getName(){
        return name;
    }
    public String getSnn(){
        return ssn;
    }
    public Address getAddress(){
        return address;
    }
    public DateOfBirth getDob(){
        return dob;
    }
    public double getBalance(){
        return balance;
    }
    public int getPin(){
        return pin;
    }

    //setters
    public void deposit(double cash){
        balance += cash;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    //toString method below
    public String toString(){
        return("Name: " + name + "\nBalance: " + balance);
    }

}
