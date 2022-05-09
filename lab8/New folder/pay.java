package paypack;

import java.util.Scanner;

public class pay {
    public void payment(int value) {
        Scanner sc = new Scanner(System.in);
        System.out.println("System is requesting for payment of Rs " + value);
        System.out.println("Press 1 to continue");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Your payment is successful,thank you!");
        } else {
            System.out.println("Payment failed,Try again later");
        }

    }
}