public class DivideNumbers3 {
    public static void main(String[] args) {  //main method
            System.out.println("Divided by 3: "); //printing statement for numbers divided by 3
            for (int i = 1; i <= 100; i++) {      // for loop statement for numbers between 1 and 100 divided by 3 with if statement
                if (i%3==0)
                    System.out.print(i +", ");    //printing answer
            }
        System.out.println("\nDivided by 5: ");   //printing statement for numbers divided by 5
          for (int i = 1; i<=100; i++){          // for loop statement
              if (i%5 == 0)
                  System.out.println(i +", ");  //printing answer
        }
    }
}
