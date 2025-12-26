import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double GST_RATE = 0.05; // 5% GST

        while (true) {
            System.out.print("Enter coffee type (Espresso/Latte/Cappuccino) or type 'exit': ");
            String coffeeType = sc.next();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting!");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double pricePerCup;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double total = pricePerCup * quantity;
            double gst = total * GST_RATE;
            double finalBill = total + gst;

            System.out.println("Total Bill (including GST): ₹" + finalBill);
        }

        sc.close();
    }
}
