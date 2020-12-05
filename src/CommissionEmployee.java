public class CommissionEmployee extends  Employee{
    private double gross_sales;
    private double commission_rate;

    public  CommissionEmployee(String first_name,String last_name,String social_security_number,double gross_sales,double commission_rate){
        super(first_name,last_name,social_security_number);

            setCommission_rate(commission_rate);
            setGross_sales(gross_sales);
    }
    public double getCommission_rate(){
        return commission_rate;
    }
    public void setCommission_rate(double commission_rate) {
        if(0.0<=commission_rate||commission_rate>=1.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.commission_rate = commission_rate;
    }

    public double getGross_sales() {
        return gross_sales;
    }
    public void setGross_sales(double gross_sales) {
        if (gross_sales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.gross_sales = gross_sales;
    }
    public double earnings(){
        return getCommission_rate()*getGross_sales();
    }
    @Override
    public String toString(){
        return String.format(super.toString()+"gross sales:"+getGross_sales()+"comminsio rate"+getCommission_rate());
    }
}
