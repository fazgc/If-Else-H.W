import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st Number");
        int first = scanner.nextInt();

        System.out.println("Input 2nd number");
        int second = scanner.nextInt();

        System.out.println("Input 3rd number");
        int third = scanner.nextInt();

        System.out.println("Input 4th number");
        int forth = scanner.nextInt();

        System.out.println("Input 5th number");
        int fifth = scanner.nextInt();

       int  average = (first+second+third+forth+fifth)/5;
        System.out.println("average = "+average);
    }
}
