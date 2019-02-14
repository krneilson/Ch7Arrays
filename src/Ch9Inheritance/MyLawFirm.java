//This program is a client program to instantiate
//bunch of  employees for a law firm
package Ch9Inheritance;

public class MyLawFirm {
    public static void main(String[] args) {
        EmployeeV3 tom = new LegalSeceataryV3();
        EmployeeV3 jonny = new MarketersV3();
        EmployeeV3 henry = new LawyerV2();

        printInfo(tom);
        printInfo(jonny);
        printInfo(henry);
    }

    public static void printInfo(EmployeeV3 employee){
        System.out.println("Salary : " + employee.getSalary());
        System.out.println("Vacation Form : " + employee.getVacationForm());
        System.out.println("Vacation Days : " + employee.getVacationDays());
        System.out.println();



    }

}
