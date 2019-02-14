package Ch9Inheritance;

public class LegalSeceataryV2 extends SectetaryV2 {

    public double getSalary(){
        return (super.getSalary() + 5000.0);
    }

    public void legalDoc(){
        System.out.println("Preparing legal documents.");
    }

}
