public class SumOfX {
    public static void main(String[] args) { // main method
        int sum = 0;                       // declaring variable
        for( int i = 1; i< 20; i+=1){     //for loop statement
            sum+=i;
            System.out.println(i+"+");   //printing statment
        }
        sum+=20;
        System.out.println(20+ "=" +sum);

    }
}
