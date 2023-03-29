import java.util.Scanner;
public class InterchangeValue {
    static Scanner scanner = new Scanner(System.in);
    int a;
    int b;
     public static void main(String[] args) {
        System.out.println("Enter the original value of a and b here");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
         System.out.println("a = "+a);
         System.out.println("b = "+b);
         a = a ^ b ^ (b = a);
         System.out.println("interchanged values :");
         System.out.println("a = "+a);
         System.out.println("b = "+b);
         //public static void main(String[] args);
       // int a = scanner.nextInt();
        //int b = scanner.nextInt();
           // System.out.println(a=a^b^(b=a));
        //InterchangeValue interchangeValue = new InterchangeValue();
      //  interchangeValue.main();


    }
}
