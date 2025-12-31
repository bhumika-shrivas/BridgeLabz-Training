public class DigitalWatch {
    public static void main(String[] args) {

        System.out.println("24-Hour Watch\n");

        boolean powerCut = false;

        // Hour loop
        for (int hour = 0; hour < 24; hour++) {

            // Minute loop
            for (int minute = 0; minute < 60; minute++) {

                // Power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("\nPower Cutoff!");
                    powerCut = true;
                    break; 
                }

                System.out.printf("%02d:%02d\n", hour, minute);
            }

            // Break hour loop after power cut
            if (powerCut) 
			{
                break;
            }
        }
    }
}
