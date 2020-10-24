import java.util.Scanner;
public class Chapter_4_18 {
    public static void main (String [] args)
    {
        Scanner in =new Scanner(System.in);
        CreditLimitCalculator cred1 = new CreditLimitCalculator(200,3,10,300);
        CreditLimitCalculator cred2 = new CreditLimitCalculator(500,8,220,350);
        CreditLimitCalculator cred3 = new CreditLimitCalculator(2500,50,400,260);
        CreditLimitCalculator cred4 = new CreditLimitCalculator(100,2,46,80);


        System.out.println("Account number for cred1: "+cred1.getAccount_Number());
        System.out.println("Account balance for cred1: "+cred1.create_new_Balance());
        System.out.println("=======================================================");
        System.out.println("Account number for cred2: "+cred2.getAccount_Number());
        System.out.println("Account balance for cred2: "+cred2.create_new_Balance());
        System.out.println("=======================================================");
        System.out.println("Account number for cred3: "+cred3.getAccount_Number());
        System.out.println("Account balance for cred3: "+cred3.create_new_Balance());
        System.out.println("=======================================================");
        System.out.println("Account number for cred4: "+cred4.getAccount_Number());
        System.out.println("Account balance for cred4: "+cred4.create_new_Balance());
        System.out.println("=======================================================");


    }
}
