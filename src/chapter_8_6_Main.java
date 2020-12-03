public class chapter_8_6_Main {
    public static  void main(String [] args){
        SavingsAccount saver1= new SavingsAccount(3,2000);
        SavingsAccount saver2 = new SavingsAccount(3,3000);
        System.out.println("Balance for saver1: "+saver1.MonthlyInterest());
        System.out.println("Blance for saver2: "+saver2.MonthlyInterest());
        System.out.println("=========================================");
        SavingsAccount.InterestRate_1(5.0);
        System.out.println("Balance for saver1 with interest rate: " +saver1.MonthlyInterest());
        System.out.println("Balance for saver1 with interest rate: "+saver1.MonthlyInterest());

    }
}
