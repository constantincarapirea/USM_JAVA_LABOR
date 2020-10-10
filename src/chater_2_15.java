import java.util.Scanner;
public class chater_2_15 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a,b,sum,produ,difer;
        System.out.println("Introduceti valorile la a si b");
        System.out.printf("a=");
        a=in.nextInt();
        System.out.print("b=");
        b=in.nextInt();
        sum=a+b;
        produ=a*b;
        difer=a-b;
        System.out.println("Suma lui " + a +" + "+ b +" = " +sum);
        System.out.println("Produsul lui " + a +" * "+ b +" = " +produ);
        System.out.println("Diferenta lui " + a +" - "+ b +" = " +difer);


    }
}
