import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;
public class LeapYear {
    static int year; //global variable
    public static void main(String[] args) {    //main method
        Scanner scanner =new Scanner(System.in); //scanner to input value(here year you want to check)
        System.out.println("please enter year here : "); //statement for instruction.
         year = scanner.nextInt(); //scanner variable
        if (year % 400 == 0) {    //if else to get result.
            System.out.println("Its a leap year."); //message to print.
        } else {
            System.out.println("Its not a leap year.");
        }
        }
    }