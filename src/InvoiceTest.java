import  java.util.Scanner;
public class InvoiceTest {
    public static void  main(String[] args) {
        Chapter_3_12 in1 = new Chapter_3_12("101", "RAM 8GB", 500.00, 5);
        Chapter_3_12 in2 = new Chapter_3_12("102", "Ram 4GB", 200.00, 6);

        double pince;
        int quantity;

        Scanner in = new Scanner(System.in);

        System.out.println("Invoice amount for in1 =" + in1.getInvoiceAmount());
        System.out.println("Invoice amount for in2 =" + in2.getInvoiceAmount());
        System.out.println("=================================================");

        System.out.print("Enter pince for in1:");
        pince=in.nextDouble();
        System.out.print("Enter quantity for in1: ");
        quantity=in.nextInt();
         in1.setPeice(pince);
        in1.setQuantity(quantity);

        System.out.println("=================================================");
        System.out.print("Enter pince for in2:");
        pince=in.nextDouble();
        System.out.print("Enter quantity for in2:");
        quantity=in.nextInt();

        in2.setPeice(pince);
        in2.setQuantity(quantity);
        System.out.println("=================================================");
        System.out.println("Invoice amount for in1 =" + in1.getInvoiceAmount());
        System.out.println("Invoice amount for in2 =" + in2.getInvoiceAmount());



    }
}
