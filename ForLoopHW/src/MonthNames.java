import java.util.Scanner; //importing scanner class
public class MonthNames {
        public static void main(String[] args) {  //main method
            Scanner sc = new Scanner(System.in);   // scanner class to put input by user
            System.out.print("Enter month's number: "); //print statement to inform user for steps to do
            int monthNumber;                     // declaring variable
            monthNumber = sc.nextInt();
            switch (monthNumber) {        //switch statement to find month name from number given by user
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("july");
                    break;
                case 8:
                    System.out.println("august");
                    break;
                case 9:
                    System.out.println("september");
                    break;
                case 10:
                    System.out.println("october");
                    break;
                case 11:
                    System.out.println("november");
                    break;
                case 12:
                    System.out.println("december");
                    break;
                default:
                    System.out.println("invalid"); //any other number will be printed as a invalid
                    break;
            }
        }}