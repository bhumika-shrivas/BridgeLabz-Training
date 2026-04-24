package com.streamsapi;

/*Stock Price Logger
○ Scenario: Display all stock prices from a live feed.
○ Task: Use forEach() to print updates.*/

import java.util.List;

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Double> stockPrices = List.of(
                2450.75,
                2462.10,
                2448.60,
                2475.30,
                2468.90
        );

        stockPrices.forEach(price ->
                System.out.println("Stock Price Update: ₹" + price)
        );
    }
}
