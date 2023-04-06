public class SumOfPositive{
    static double sum(int n)  //declaring variable
    {
        double i, s = 0.0;
        for (i = 1; i <= n; i++)   //for loop statement
            s = s + 1/i;
        return s;
    }
    public static void main(String args[])  //main method
    {
        int n = 5;                         //variable
        System.out.printf("Sum is %f", sum(n));  //printing answer
    }
}

