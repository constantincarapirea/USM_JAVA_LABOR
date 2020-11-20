import java.util.Scanner;

public class chapter_7_14 {
    public static int Product(int ...Argu) {
        int p = 1;
        for(int v: Argu) {
            p *= v;
        }
        return p;
    }
    public static void main(String[] arg) {
        Scanner in=new Scanner(System.in);
        int []a=new int[10];
        int n;

            System.out.println("Enter the number of items from 2 to 10:");
            n=in.nextInt();
        for(int i=0; i<n;i++)
        {
            System.out.print("a["+i+"]=");
            a[i]=in.nextInt();
        }

        if (n>=2)
        System.out.println("The product of values:" +Product(  a[0],a[1]));
        if(n>=3)
        System.out.println("The product of values:" + Product( a[2],a[1], a[0]));
        if (n>=7)
            System.out.println("The product of values:" + Product( a[2],a[1], a[0],a[4],a[6],a[3],a[5]));
        if (n>=10)
            System.out.println("The product of values:" + Product( a[2],a[1], a[0],a[4],a[6],a[3],a[5],a[9],a[8]));
    }

}
