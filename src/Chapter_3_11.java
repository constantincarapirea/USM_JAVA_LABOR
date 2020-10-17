import java.util.Scanner;
public class Chapter_3_11 {
        public static void main(String[] args) {
            Account account1 = new Account("Jane Green", 50.00);
            Account account2 = new Account("John Blue", -7.53);

            System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
            System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

            Scanner input = new Scanner(System.in);

            System.out.print("Enter deposit ammount for account 1: ");
            double depositAmmount = input.nextDouble();

            System.out.printf("%nadding %.2f to account 1 balance %n%n", depositAmmount);
            account1.deposit(depositAmmount);

            System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
            System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

            System.out.print("Enter deposit ammount for account 2: ");
            depositAmmount = input.nextDouble();

            System.out.printf("%nadding %.2f to account 2 balance %n%n", depositAmmount);
            account2.deposit(depositAmmount);

            System.out.print("Enter withdraw from account 1: ");
            double depositWinthdawal = input.nextDouble();

            System.out.printf("%nwithdrawing %.2f from account 1 balance %n%n", depositWinthdawal);
            account1.withdraw(depositWinthdawal);

            System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
            System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

            System.out.print("Enter withdraw from account 2: ");
            depositWinthdawal = input.nextDouble();

            System.out.printf("%nwithdrawing %.2f from account 2 balance %n%n",depositWinthdawal);
            account2.withdraw(depositWinthdawal);

            System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
            System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        }
    }




