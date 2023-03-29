import java.util.Scanner; //importing scanner class
public class ArithmeticSymbols {

        public static void main(String args[])      //main method
        {
            int first, second, add, sub, multiply;   //variables
            float divide;
            Scanner scanner = new Scanner(System.in); //scanner class

            System.out.print("Enter Two Numbers : "); //instruction for user to enter value
            first = scanner.nextInt();                //values input
            second = scanner.nextInt();

            add = first + second;                     //arithmetic commands to perform
            sub = first - second;
            multiply = first * second;
            divide = first / second;

            System.out.println("Sum = " + add);        //printing answers
            System.out.println("substraction = " + sub);
            System.out.println("Multiplication = " + multiply);
            System.out.println("Division = " + divide);
        }
    }