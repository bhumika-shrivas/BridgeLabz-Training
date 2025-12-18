
public class ProfitLossPercentage {
    public static void main(String[] args) {

        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate profit (since selling price is greater than cost price)
        int profit = sellingPrice - costPrice;
        double percentage = (profit * 100.0) / costPrice;

        System.out.println(
            "The Cost Price is INR " + costPrice +
            " and Selling Price is INR " + sellingPrice +
            "\nThe Profit is INR " + profit +
            " and the Profit Percentage is " + percentage
        );
    }
}
