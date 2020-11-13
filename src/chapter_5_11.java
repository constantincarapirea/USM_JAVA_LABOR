import java.util.Scanner;
import java.util.Random;
public class chapter_5_11 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        Random rado = new Random();
        int i, n, min;
        int[] a = new int[40];
        System.out.println("Enter the maximum number entered:");
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            a[i] = rado.nextInt(n);
            System.out.print("a[" + i + "]=" + a[i]);
            System.out.println();
        }
        for (i = 1; i <= n; i++) {
            System.out.print(a[i] + ", ");
        }

        System.out.println("Smallest value:");
        min = a[1];
        for (i = 1; i <= n; i++) {
            if (min > a[i])
                min = a[i];
        }
        System.out.println(min);

    }
}
