public class SavingsAccount {
    private static double InterestRate;
    private double SavingBalance;

    public SavingsAccount(double interestRate, double savingBalance){
        InterestRate_1(interestRate);
        setSavingBalance(savingBalance);
    }public static double getInterestRate() {
        return InterestRate;
    }
    public double getSavingBalance() {
        return SavingBalance;
    }
    public static void InterestRate_1(double interestRate) {
        if (interestRate > 0.0) {
            InterestRate = interestRate;

        }else InterestRate = 0.0;
    }
    public void setSavingBalance(double savingBalance) {
        if (savingBalance > 0.0) {
            SavingBalance = savingBalance;

        }else SavingBalance = 0.0;
    }
    public double MonthlyInterest() {
        double Balance;
        Balance = this.SavingBalance * SavingsAccount.InterestRate / 12;
        this.SavingBalance += Balance;
        return this.SavingBalance;
    }
}
