package Ch9Inheritance;

public class MarketersV2 extends EmployeeV2 {

    public double getSalary(){
        //I want to add $10k to the base salary from the Employee Class
        return (super.getSalary() + 10000.0);     //$50,000 / year
    }

    public void advertise(){
        System.out.println("Call (800)888-8888");
    }

}
