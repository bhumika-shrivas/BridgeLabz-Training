// Create a program to convert the distance of 10.8 kilometers to miles.

public class KmToMiles {
    public static void main(String[] args) {

        double distance = 10.8;

        // Convert kilometers to miles (1 km = 0.621371 miles)
        double convertedValue = distance * 0.621371;

        System.out.println("The distance " + distance + " km in miles is " + convertedValue);
    }
}
