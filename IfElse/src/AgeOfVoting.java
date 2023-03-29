import java.util.Scanner;

public class AgeOfVoting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to check voting eligibility");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible for vote as your age is :"+age);}
        else {
            System.out.println("You are NOT eligible for voting.");
        }
        }
}
