import java.util.Scanner;

public class MobileRecharge
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double balance = 0.0;
        char choice;

        do
        {
            System.out.print("\nEnter Mobile Operator (Airtel/Jio/Vi): ");
            String operator = input.next().toLowerCase();

            System.out.print("Enter recharge amount: ₹");
            double amount = input.nextDouble();

            // Add recharge amount to balance
            balance += amount;

            // Display offers using switch
            switch (operator)
            {
                case "airtel":
                    System.out.println("Offer: 1GB/day + Unlimited Calls");
                    break;

                case "jio":
                    System.out.println("Offer: 1.5GB/day + Disney + Hotstar");
                    break;

                case "vi":
                    System.out.println("Offer: Weekend Data Rollover");
                    break;

                default:
                    System.out.println("Invalid Operator");
            }

            // Show balance
            System.out.println("Current Balance: ₹" + balance);

            // Repeat recharge
            System.out.print("\nDo you want to recharge again? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for recharging!");
        input.close();
    }
}
