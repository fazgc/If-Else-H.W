import java.util.Scanner;

public class StudentResult {
    static String name; //global variable
    static int RollNumber;
    static int maths,sci,eng;

    public static void main(String[] args) {    //main methode
        Scanner scanner = new Scanner(System.in); //scanner class to input name,roll number and 3 subjects marks
        System.out.println("Please enter student details here : "); //printing this message to inform user to provide input
        System.out.println("Name");
         name = scanner.nextLine();
        System.out.println("Roll Number");
         RollNumber = scanner.nextInt();
        System.out.println("Maths");
          maths = scanner.nextInt();
        System.out.println("science");
          sci = scanner.nextInt();
        System.out.println("English");
          eng = scanner.nextInt();
          int total = maths+sci+eng; //to sum up totol marks
        System.out.println("Total Marks = "+(maths+sci+eng));
        double percentage = ((double) total/3); //to turn total marks into percentage.
        System.out.println("Percentage = "+percentage);
        //on basis of the result ,to find out pass/fail, below is 'if else' statement.
        if (percentage >= 35)
        {System.out.println("Tim has passed the exam.");}
        else if(percentage >=35 && percentage < 50)
        { System.out.println("Grade C");}
        else if(percentage >=50 && percentage <60)
        {System.out.println("Grade B");}
        else if(percentage >=60 && percentage <80)
        {System.out.println("Grade A");}
        else if(percentage >=80 && percentage <100)
        {System.out.println("Grade A+");}
        else{System.out.println("");}
        }
}
