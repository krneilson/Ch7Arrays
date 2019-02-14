//This program is a client program to instantiate
//bunch of  employees for a law firm. This version
//uses an array of objects of the type Employee. Each
// object is created directly at the instantiation of the
//employee ...
//print each employee's information
package Ch9Inheritance;

public class MyLawFirmV3 {
    public static void main(String[] args) {
        EmployeeV3[] myEmployees = {new LegalSeceataryV3("Tom"),
                new MarketersV3("Jonny"),  new LawyerV2("Henry")};

        printInfo(myEmployees);
    }

    public static void printInfo(EmployeeV3[] employee){
            //Datetype //iterator  //container
        for(EmployeeV3 staff       : employee){
            System.out.println("Salary : " + staff.getSalary());
            System.out.println("Vacation Form : " + staff.getVacationForm());
            System.out.println("Vacation Days : " + staff.getVacationDays());
            System.out.println();
        }
        /*
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Salary : " + employee[i].getSalary());
            System.out.println("Vacation Form : " + employee[i].getVacationForm());
            System.out.println("Vacation Days : " + employee[i].getVacationDays());
            System.out.println();
        }
        */
    }
}


