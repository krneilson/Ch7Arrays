package Ch9Inheritance;

public class LegalSeceataryV3 extends SectetaryV3 {

    public LegalSeceataryV3(String name){
        super(name);
    }

    public double getSalary(){
        return (super.getSalary() + 5000.0);
    }

    public void legalDoc(){
        System.out.println("Preparing legal documents.");
    }

}
