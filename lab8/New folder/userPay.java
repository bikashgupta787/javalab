import paypack.pay;
import java.util.Scanner;

class userPay{
    public static void main(String[] args) {
        pay py = new pay();
        Scanner sc = new Scanner(System.in);
        System.out.println("Redirecting you to the payment gateway......\n");
        System.out.println("Do not refresh the page.............\n");
        py.payment(5000);

    }
}