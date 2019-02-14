/**
 * This is a class to represent employees in general (20 page manuel)
 */
package Ch9Inheritance;

public class EmployeeV2 {

    /**
     * this class returns the number of hours employees work.
     * @return numbwer of hours that employees work
     */
    public int getHours(){
       return 40;   //works 40 hours a week
    }

    public double getSalary(){
        return 50000.0;
    }

    public int getVacationDays(){
        return 10;
    }

    public String getVacationForm(){
        return "yellow";
    }

}
