public class SumOfNaturalNumbers {
    public static void main(String[] args) {  //main method
        int i,no = 10,sum = 0;                // declaring variables
        for ( i = 1; i <= no; ++i){           // for loop to find sum of natural numbers upto 0 to 10
            sum = sum + i;
        }
        System.out.println("Sum of first 10 numbers is : "+sum);  //print statement to get answer.
    }
}
