public class CreditLimitCalculator {
    private static int ID_Counter = 1;
    private int account_Number;
    private int beg_Balance;
    private int total_Items_Charged;
    private int total_Credits;
    private int credit_Limit;

    public CreditLimitCalculator(int beg_Balance, int total_Items_Charged, int total_Credits, int credit_Limit) {
        this.account_Number = ID_Counter++;
        setBeg_Balance(beg_Balance);
        setTotal_Items_Charged(total_Items_Charged);
        setTotal_Credits(total_Credits);
        setCredit_Limit(credit_Limit);
               
    }

    public int getAccount_Number() {
        return this.account_Number;
    }

    public int getBeg_Balance() {
        return beg_Balance;
    }

    public void setBeg_Balance(int beg_Balance) {
        if (beg_Balance > 0.0) {
            this.beg_Balance = beg_Balance;

        } else {
            this.beg_Balance = 0;
        }
    }

    public int getTotal_Items_Charged() {
        return total_Items_Charged;
    }

    public void setTotal_Items_Charged(int total_Items_Charged) {
        if (total_Items_Charged > 0) {
            this.total_Items_Charged = total_Items_Charged;

        } else {
            this.total_Items_Charged = 0;
        }

    }

    public int getTotal_Credits() {
        return total_Credits;
    }

    public void setTotal_Credits(int total_Credits) {
       if (total_Credits > 0) {
           this.total_Credits = total_Credits;

       }
       else
       {
           this.total_Credits=0;
       }
    }

    public int getCredit_Limit() {
        return credit_Limit;
    }

    public void setCredit_Limit(int credit_Limit) {
        if (credit_Limit > 0) {
            this.credit_Limit = credit_Limit;
        } else {
            this.credit_Limit = 0;
        }
    }

    public int create_new_Balance() {
        int Create_new_Balance = beg_Balance + total_Items_Charged - total_Credits;
        return (Create_new_Balance > 0) ? Create_new_Balance : 0;
    }

    public boolean LimitExceded() {
        return (create_new_Balance() > credit_Limit) ? true : false;
    }
}