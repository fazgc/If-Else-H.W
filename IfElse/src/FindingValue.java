import java.util.Scanner; //importing scanner class

public class FindingValue {
        public static void main(String[] args) {   //main method
            Scanner sc = new Scanner(System.in);   //scanner class
            //char ch,ch2;                           // variables
            System.out.println("Enter any character"); //acknowledge user to enter any alphabet character
            char ch = sc.next().charAt(0);

            if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')){   //if else condition to convert cases.
                //inbuilt method for character lowercase.
                System.out.println(ch+" is alphabet"); //answer printed after converted by inbuilt method
            }
            else if (ch>='0' && ch<='9'){                            //else presenting alternate option which is uppercase.
                System.out.println(  ch+ " is number");}

                 else {System.out.println(" its a special character");}
            }
        }

