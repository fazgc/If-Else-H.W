import java.util.Scanner;  // i am having problem doing this hence not getting answer.

public class PrimeNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number here and press enter : ");
        int n = sc.nextInt();
        int i,m=0; boolean v = true ;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                   // v =1;
                    break;
                }
            }
            //if(v ==0)  { System.out.println(n+" is prime number"); }
        }//end of else
       // for(int i = 0; i <=  )
    }
}
