import java.util.Scanner; //Importing scanner class

public class ChangingCase {
    public static void main(String[] args) {   //main method
        char ch,ch2;                           // variables
        System.out.println("Enter any alphabet"); //acknowledge user to enter any alphabet character
        Scanner sc = new Scanner(System.in);   //scanner class
        ch = sc.next().charAt(0);

        if(ch>='A' && ch<='Z'){   //if else condition to convert cases.
            ch2=Character.toLowerCase(ch);  //inbuilt method for character lowercase.
            System.out.println("Lowercase - "+ch2); //answer printed after converted by inbuilt method
        }
        else {                            //else presenting alternate option which is uppercase.
            ch2 = Character.toUpperCase(ch);
            System.out.println("Uppercase - " + ch2);
        }
    }}
