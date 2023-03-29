import java.util.Scanner; //imported scanner class

public class WeekNames {
    public static void main(String args[])  //main method
    {   int number;                          //variables
        Scanner sc=new Scanner(System.in);   //scanner class
        System.out.print("Enter number ");   //user will enter name after this instructions
        number=sc.nextInt();
        if(number==1)                        //if else shows numbers = week names
        {System.out.print("Sunday");}
        else if(number==2)
        {System.out.print("Monday");}
        else if(number==3)
        {System.out.print("Tuesday");}
        else if(number==4)
        {System.out.print("Wednesday");}
        else if(number==5)
        {System.out.print("Thursday");}
        else if(number==6)
        {System.out.print("Friday");}
        else if(number==7)
        {System.out.print("Saturday");}
        else
        {System.out.print("");}
}}
