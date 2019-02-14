//This program is a client program to instantiate
//bunch of  employees for a law firm. This version
//uses an array of objects of the type employee to
//print each employee's information
package Ch9Inheritance;

public class MyLawFirmV2 {
    public static void main(String[] args) {
        EmployeeV2[] myEmployees = new EmployeeV2[3];

        EmployeeV2 tom = new LegalSeceataryV2();
        myEmployees[0] = tom;
        EmployeeV2 jonny = new MarketersV2();
        myEmployees[1] = jonny;
        EmployeeV2 henry = new LawyerV2();
        myEmployees[2] = henry;

        printInfo(myEmployees);
    }

    public static void printInfo(EmployeeV2[] employee){
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Salary : " + employee[i].getSalary());
            System.out.println("Vacation Form : " + employee[i].getVacationForm());
            System.out.println("Vacation Days : " + employee[i].getVacationDays());
            System.out.println();
        }
    }
}


