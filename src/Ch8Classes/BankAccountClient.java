package Ch8Classes;

public class BankAccountClient {
    public static void main(String args[]){
        BankAccountV1 kimball = new BankAccountV1("kimball", "0000000001",
                "702 Prospect Ave, Mamaroneck, NY, 10543, United States of America",
                "12272001");
        kimball.deposit(9999999.99);
        System.out.println(kimball);
        kimball.deposit(0.01);
        System.out.println(kimball);
        kimball.withdraw(5555);
        System.out.println(kimball);
    }
}
