import java.util.Scanner;

public class PositiveNegative {


        public static void main(String[] args)
        {
            int number;                            //object
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");//user will enter number
            number = scanner.nextInt();//to check number is grater than 0
            if(number>0)
            {
                System.out.println("The number is positive.");}// to checks number is less than 0
            else if(number<0)
            {
                System.out.println("The number is negative.");}//print this if number entered is less than 0
            else
            {
                System.out.println("The number is zero.");//will print this if number grater than 0
            }
        }
    }