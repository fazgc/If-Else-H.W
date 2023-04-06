import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {  //main method
        //message for user for what to print
        System.out.println(" Enter any 2 numbers, after typing each number press enter key to find out fibonacci sequence : ");
        Scanner sc = new Scanner(System.in);  // creating scanner object to put input
        // creating variables using scanner class
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i = 1; i <= num2 ; ++i){     // for loop statement to get answer.
            int sumOfPrev2 = num1 + num2;
            num1 = num2;
            num2 = sumOfPrev2;
            System.out.println(sumOfPrev2);
        }
    }
}
