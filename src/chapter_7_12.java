import java.util.Scanner;
public class chapter_7_12 {
    public static boolean dublicate(int n, int[] a) {
        int dublicat = 0;
        for(int v : a) {
            if(n == v) dublicat++;
        }

        if (dublicat > 0) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nr= 5, n, i = 0;
        int[] a = new int[5];

        while(nr != 0) {
            System.out.println("==============================================");
            System.out.print("Get a unique number between 10 - 100: ");
            n= input.nextInt();
            if ( n <= 100 && n >= 10) {
                if (dublicate(n, a)) {
                    System.out.println("Input number is not unique, try again!");
                    continue;
                }
                else {
                    System.out.println("=======================================");
                    a[i++] = n;
                    System.out.println("Unique number = "+ n);
                    nr--;
                    System.out.println("Remain attempt = "+nr);
                }
            }
            else {
                System.out.println("Input number is out of range, try again!");
            }
        }
        System.out.println("=====================================================");
        System.out.println("Array with unique number: ");
        for(int v: a) {
            System.out.print(" " +  v);
        }
    }


}