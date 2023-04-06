import java.util.Scanner; //importing scanner class

public class FactorialNumber {
    public static void main(String[] args) {  //main method
        Scanner scan = new Scanner(System.in);  // scanner class for user input
        System.out.println("Type the any 2 numbers followed by enter and press enter : "); //instuction for user to input value
        int fact = scan.nextInt(); // variables
        int numb = scan.nextInt();
        for (int i = 1; i <= numb; i++){ //for loop statment
            fact = fact*i;
        }
        System.out.println("factorial of " + ""+numb+ "is" +fact); //printing answer

    }
}
