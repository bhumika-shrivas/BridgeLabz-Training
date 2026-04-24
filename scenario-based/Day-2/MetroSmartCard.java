import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 200;

        while (balance > 0) {
            System.out.println("Current Balance: ₹" + balance);
            System.out.print("Enter distance (or -1 to exit): ");
            int distance = sc.nextInt();

            if (distance == -1) {
                System.out.println("Journey ended.");
                break;
            }

            double fare = (distance <= 5) ? 10 :
                          (distance <= 15) ? 20 : 30;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare ₹" + fare + " deducted");
            } else {
                System.out.println("Insufficient balance");
                break;
            }
        }
    }
}
