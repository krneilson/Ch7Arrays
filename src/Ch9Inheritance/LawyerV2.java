package Ch9Inheritance;

public class LawyerV2 extends EmployeeV2 {
    //Inherit methods from the Employee class

    //override the inherited methods from the employee class
    public int getVacationDays(){
        return 15;
    }

    public String getVacationForm(){
        return "pink";
    }

    public void sue(){
        System.out.println("I'll see you in court!");
    }
}
