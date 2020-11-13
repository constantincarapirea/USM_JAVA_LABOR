import java.util.Scanner;

    public class chapter_5_16 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int max = 5, cicl= 0, n;
            int a[] = new int[5];


            do {
                System.out.print("Get numbers between 1 and 30: ");
                n = in.nextInt();
                if (n >= 1 && n <= 30) {
                    a[cicl] = n;
                    ++cicl;
                    --max;
                }else continue;
            }while(max != 0);
             System.out.println("==============================================================");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
            System.out.println("==============================================================");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

