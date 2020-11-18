import java.util.Scanner;
public class chapter_6_8 {
        private static final double basehour = 2.0;
        private static final double addhour = 0.5;
        private static final double maxhour = 10.0;
        private static double sumtotal = 0.0;

        public static double calculateCharges(int hour) {
            if(hour > 0 && hour <= 3) {
                sumtotal = getSumtotal() + basehour;
                return basehour;
            }else if (hour > 3 && hour <= 24) {
                double total = basehour + addhour * (hour - 3);
                sumtotal = getSumtotal() + Math.min(total, maxhour);
                return Math.min(total, maxhour);
            }else if(hour > 24) {
                System.out.print("There are no parking spaces longer than 24 hours");
            }
            return 0;
        }
        public static double getSumtotal() {return sumtotal;}

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int hour = 0;
            do {
                System.out.print("Enter the hours parking :");
                hour = input.nextInt();
                System.out.println("Charges: $" +calculateCharges(hour));
                System.out.println("Enter 0 to exit");
                System.out.println("====================================");
            } while (hour != 0);
            System.out.println("Total charges: $"+ sumtotal);
        }
    }
