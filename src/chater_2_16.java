import java.util.Scanner;
public class chater_2_16 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a,b;
        System.out.println("Introduceti valorile la a si b");
        System.out.printf("a=");
        a=in.nextInt();
        System.out.print("b=");
        b=in.nextInt();
        if(a > b)
        System.out.println("(a>b) \n" + a + " > "+b);
       if(a<b)
          System.out.println("(a<b) \n" + a + " < " + b);
       if (a == b)
           System.out.println("(a=b) \n" + a + "=" +b );


    }
}
