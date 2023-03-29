import java.util.Scanner;

public class SalesCommission {
    static String ID;
    static String name;
    static double amount50k,amount30k,amount20k,amount10k,amountless;
    static double salary;
    static double commission50k,com30k,com20k,com10k,comless;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales details :");
        System.out.println("sales ID");
        ID =scanner.nextLine();
        System.out.println("seller name");
        name=scanner.nextLine();
        System.out.println("basic salary");
        salary= scanner.nextDouble();

        System.out.println("Enter sales amount 50000");
        amount50k=scanner.nextDouble();
            commission50k = amount50k*35/100;
            System.out.println("Then seller commission will be 35% = "+commission50k);

        System.out.println("enter sales amount 30000");
        amount30k=scanner.nextDouble();
            com30k=amount30k*20/100;//50,000 35% sales amount >= 30,000 20%  >= 20,000 10%  >= 10,000 5% < 10,000 2%
            System.out.println("Then seller commission will be 20% = "+com30k);

        System.out.println("enter sales amount 20000");
        amount20k=scanner.nextDouble();
        com20k=amount20k*10/100;
            System.out.println("Then seller commission will be 10% = "+com20k);

        System.out.println("enter sales amount 10000");
        amount10k=scanner.nextDouble();
            com10k=amount10k*5/100;
            System.out.println("Then seller commission will be 5% = "+com10k);

        System.out.println("enter sales amount less than 10000");
        amountless=scanner.nextDouble();
            comless=amountless*2/100;
            System.out.println(" Then seller commission will be 2% = "+comless);

        }

    }

