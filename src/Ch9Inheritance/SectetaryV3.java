package Ch9Inheritance;

public class SectetaryV3 extends EmployeeV3 {

    public SectetaryV3(String name){
        super(name);
    }

    public void takeDictation(String text){
        System.out.println("Taking dictation of text:" + text);
    }
}
