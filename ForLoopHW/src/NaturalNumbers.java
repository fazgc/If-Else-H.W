import java.util.Scanner; // import scanner class
public class NaturalNumbers {
    public static void main(String[] args)  // main methode
    {
            int i, n, sum=0;  //variables
            {
                Scanner in = new Scanner(System.in); //scanner class statement
                System.out.print("Input number: ");  //suggesting user to input number here
                n = in.nextInt();              // calling variables
            }
            System.out.println("The first n natural numbers are : "+n); //printing statement

            for(i=1;i<=n;i++)  // for loop statement
            {
                System.out.println(i);
                sum+=i;
            }
            System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum); //printing answer

        }}
