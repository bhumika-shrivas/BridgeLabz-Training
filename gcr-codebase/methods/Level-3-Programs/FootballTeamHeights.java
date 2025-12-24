import java.util.Arrays;

public class FootballTeamHeights {

    public static int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
	
    public static int findShortest(int[] heights) {
        int min = heights[0];

        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }

        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];

        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights();
        System.out.println("Player Heights (in cm):");
        System.out.println(Arrays.toString(heights));

        // Calculate results
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\nTotal Height = " + sum + " cm");
        System.out.println("Mean Height = " + mean + " cm");
        System.out.println("Shortest Height = " + shortest + " cm");
        System.out.println("Tallest Height = " + tallest + " cm");
    }
}
