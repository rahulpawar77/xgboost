import java.util.Scanner;

public class ATM {
    private double balance = 100000;

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be greater than zero"
            );
        }

        balance += amount;

        System.out.println("$" + amount + " deposited successfully");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be greater than zero"
            );
        }

        if (amount > balance) {
            throw new ArithmeticException(
                "Insufficient Funds in Account"
            );
        }

        balance -= amount;

        System.out.println("$" + amount + " withdrawn successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        while (true) {
            System.out.println("\n==== ATM MENU ====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        atm.checkBalance();
                        break;

                    case 2:
                        System.out.print("Enter Deposit Amount: ");
                        atm.deposit(sc.nextDouble());
                        break;

                    case 3:
                        System.out.print("Enter Withdrawal Amount: ");
                        atm.withdraw(sc.nextDouble());
                        break;

                    case 4:
                        System.out.println("THANK YOU");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (ArithmeticException e) {
                System.out.println("ERROR: " + e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("Invalid Input");
                sc.nextLine();

            } finally {
                System.out.println("Transaction process completed");
            }
        }
    }
}