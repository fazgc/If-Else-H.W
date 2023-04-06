import java.util.Scanner; //importing scanner class

public class TimesTable {
    public static void main(String[] args) {  // main method
        Scanner scan = new Scanner(System.in); // scanner class to put input of any number we want to create times table of
        System.out.print("Enter any number you want to make times table of : ");
        int num=scan.nextInt();     // calling variable in scanner class
        for(int i=1; i <= 10; i++)  //for loop statement to print times table of given number
        {
            System.out.println(num+" * "+i+" = "+num*i); //printing table of entered number
        }
    }
}
