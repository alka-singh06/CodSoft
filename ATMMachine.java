import java.util.*;

class ATM {
    float Balance = 100000;
    int PIN = 5678;

    public void checkpin() {
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if (enterPin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin:");
            int enter = sc.nextInt();
            menu();
        }
    }

    public void menu() {
        System.out.println("Enter your choice:");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1) {
            checkBalance();
        } else if (option == 2) {
            withDrawMoney();
        } else if (option == 3) {
            depositeMoney();
        } else if (option == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice:");
        }
    }

    public void checkBalance() {
        System.out.println("Balance:" + Balance);
        menu();
    }

    public void withDrawMoney() {
        System.out.println("Enter amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawn Successful");
        }
        menu();
    }

    public void depositeMoney() {
        System.out.println("Enter the Amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Sucessfully");
        menu();
    }

}

public class ATMMachine {
    public static void main(String args[]) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
