public class BasePlusCommissionEmployee extends  CommissionEmployee{
    private  double base_salary;
public  BasePlusCommissionEmployee(String first_name,String last_name,String social_security_number,double gross_sales,double commission_rate,double base_salary)
{
    super(first_name, last_name, social_security_number, gross_sales, commission_rate);
    setBaseSalary(base_salary);
}

    public void setBaseSalary(double base_salary){
        if (base_salary < 0.0)throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.base_salary = base_salary;
    }

    public double getBaseSalary()
    {return base_salary;}

    @Override
    public double earnings()
    {return getBaseSalary() + super.earnings();}

    @Override
    public String toString() {
        return String.format("base-salaried"+super.toString()+ "base salary"+ getBaseSalary());
    }
}

