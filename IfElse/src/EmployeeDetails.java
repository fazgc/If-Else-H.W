import java.util.Scanner;

public class EmployeeDetails {
       static String ID; // GLOBAL VARIABLES
       static String name;
       static double BasicSalary;
       static double HRA, DA, TA, PF;
       static double GlossSalary;
    public static void main(String[] args) {  //MAIN METHOD
        Scanner scanner = new Scanner(System.in);  //SCANNER CLASS TO GIVE EMPLOYEE DETAILS BY USER ONLY
        System.out.println("Enter employee details here : ");
        System.out.println("Employee ID");
         ID = scanner.nextLine();
        System.out.println("Name");
         name = scanner.nextLine();
        System.out.println("Basic Salary");
        BasicSalary = scanner.nextDouble();
         HRA = BasicSalary * 10 / 100;     //TO GET VALUE OF HRA ON BASIS OF BASIC SALARY
        System.out.println("HRA = " +HRA);
         DA = BasicSalary * 8 /100;
        System.out.println("DA = " +DA);
         TA = BasicSalary * 9 /100;
        System.out.println("TA = " +TA);
         PF = BasicSalary * 20 /100;
        System.out.println("PF = " +PF);
         GlossSalary = (BasicSalary+HRA+DA+TA-PF); // TO FIND OUT Gross salary = basic salary + HRA + TA + DA -PF
        System.out.println("Gloss Salary = "+GlossSalary);

    }
}