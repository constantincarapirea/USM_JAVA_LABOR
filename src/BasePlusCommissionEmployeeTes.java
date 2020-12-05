public class BasePlusCommissionEmployeeTes {
    public static void main(String[] args) {

        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        System.out.println("Employee information obtained by get methods:%n");
        System.out.println("First name is"+ employee.getFirst_name());
        System.out.println("Last name is"+ employee.getLast_name());
        System.out.println("Social security number is"+employee.getSocial_security_number());
        System.out.println("Gross sales is"+ employee.getGross_sales());
        System.out.println( "Commission rate is"+employee.getCommission_rate());
        System.out.println( "Base salary is"+employee.getBaseSalary());
        employee.setBaseSalary(1000);
        System.out.println( "Updated employee information obtained by toString"+employee.toString());
    }
}
