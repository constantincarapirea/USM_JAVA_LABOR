public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] e = new Employee[3];

        Date firstEmp = new Date(1998, 6, 1);
        Date secondEmp = new Date(2004, 7,8);
        Date thirdEmp = new Date(1999,10,20);
        Date fourthEmp = new Date(1994, 2,16);

        Date testHireDate = new Date(2016, 3, 4);
        Date testDate = new Date(2020, 5, 25);

        e[0] = new Employee("Bodrug", "Mihail", firstEmp, testHireDate, 2000 );
        e[1] = new Employee("Capbatut", "Vladislav", secondEmp, testHireDate, 2000 );
        e[2] = new Employee("Nita", "Vladislav", thirdEmp, testHireDate, 2000 );

        System.out.println("Employees payroll processed on "+testDate.toString());
        System.out.println();
        for (Employee tmpEmp: e){
            double tmpPayroll = tmpEmp.getSalary();
            if (tmpEmp.getBirthDate().getMonth() == testDate.getMonth()){
                tmpPayroll += 100;
                tmpEmp.setSalary(tmpPayroll);
            }
            System.out.println(tmpEmp + "");
        }
    }
}