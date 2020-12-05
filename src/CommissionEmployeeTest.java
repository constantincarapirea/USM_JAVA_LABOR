public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
        System.out.println("Employee information obtained by get methods:");
        System.out.println( "First name is"+ employee.getFirst_name() );
        System.out.println( "Last name is"+ employee.getLast_name() );
        System.out.println("Social security number is"+employee.getSocial_security_number() );
        System.out.println("Gross sales is"+ employee.getGross_sales() );
        System.out.println( "Commission rate is"+employee.getCommission_rate() );

        employee.setGross_sales(5000);
        employee.setCommission_rate(.1);
        System.out.println( "Updated employee information obtained by toString"+ employee.toString());
    }

}
