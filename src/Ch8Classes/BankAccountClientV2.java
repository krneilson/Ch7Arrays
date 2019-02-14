package Ch8Classes;

public class BankAccountClientV2 {
    public static void main(String args[]){
        /*Address kimballAddress = new Address(702, "Prospect Ave",
                "Mamaroneck", "NY", 10543 );
        DateOfBirth kimballDateOfBirth = new DateOfBirth(27,12, 2001);
        KimballNeilsonBankAccountV2 kimball = new KimballNeilsonBankAccountV2("kimball", "0000000001",
                kimballAddress, kimballDateOfBirth);*/

        KimballNeilsonBankAccountV2 kimball = new KimballNeilsonBankAccountV2("kimball", "0000000001",
                new Address(702, "Prospect Ave",
                        "Mamaroneck", "NY", 10543 ),
                new DateOfBirth(27,12, 2001));

        kimball.deposit(9999999.99);
        System.out.println(kimball);
        kimball.deposit(0.01);
        System.out.println(kimball);
        kimball.withdraw(5555);
        System.out.println(kimball);
        System.out.println(kimball.getAddress());
    }
}
