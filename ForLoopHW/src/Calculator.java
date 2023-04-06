import java.util.Scanner; // importing scanner

public class Calculator {
    //calling nonstatic method
    void Calculation(){
        Scanner sc = new Scanner(System.in);  //scanner class to put input by user
        System.out.println("Enter the first number in integer "); //massage for user to give value
        int num1 = sc.nextInt();         //declaring variable
        System.out.println("Enter the second number in integer ");
        int num2 = sc.nextInt();
        System.out.println("Enter any operator symbol you want to calculate numbers with eg. +,-,*,/");
        String operator = sc.nextLine();
        String add,sub,multi,div;
        switch (operator) {  // switch statement
            case "add":
                System.out.println("Addition = " + num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case "sub":
                System.out.println("Substraction = " + num1 + "+" + num2 + "=" + (num1 - num2));
                break;
            case "multi":
                System.out.println("Multiplication = " + num1 + "+" + num2 + "=" + (num1 * num2));
                break;
            case "div":
                System.out.println("Division = " + num1 + "+" + num2 + "=" + (num1 / num2));
                break;
            default:
                System.out.println("answer = "+(num1+num2));
        }}
        public static void main(String[] args) {  //main methode
            Calculator calculator = new Calculator();  //creating object to call nonstatic method in static area
            calculator.Calculation();   //calling methode using object
    }
}
