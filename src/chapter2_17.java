import  java.util.Scanner;
public class chapter2_17 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a,b,c,sum,produ,media;;

        System.out.println("Introduceti valorile la a si b");
        System.out.print("a=");
        a=in.nextInt();
        System.out.print("b=");
        b=in.nextInt();
        System.out.print("c=");
        c=in.nextInt();
        sum=a+b+c;
        produ=a*b*c;
        media=sum/3;
        System.out.println("================================================================");
        System.out.println("Suma             : " + a +" * "+ b + " * " + c +" = "+sum);
        System.out.println("Produsul         : " + a +" * "+ b + " * " + c +" = " +produ);
        System.out.println("Media aritmetica : " + a +" * "+ b + " * " + c +" = " +media);
        System.out.println("================================================================");
        if(a>b && a>c )
            System.out.println(a +" este cel mai mare numar");
        if(b>c && b>a)
            System.out.println(b + " este cel mai mare numar");
        if (c>a && c>b)
            System.out.println(c + " este cel mai mare numar");
        if(a<b || a<c )
            System.out.println(a +" este cel mai mic numar");
        if(b<c && b<a)
            System.out.println(b + " este cel mai mic numar");
        if(c<a && c<b)
            System.out.println(c + " este cel mai mic numar");
    }
}
