import java.util.Scanner;

public class RockPaperScissors 
{

    // Method to get computer choice
    static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    // Method to find winner
    static String findWinner(String user, String computer) {
        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    // Method to calculate stats and percentage
    static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userPercent = (userWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;

        String[][] stats = new String[2][3];
        stats[0] = new String[]{"User", String.valueOf(userWins), String.format("%.2f%%", userPercent)};
        stats[1] = new String[]{"Computer", String.valueOf(computerWins), String.format("%.2f%%", computerPercent)};

        return stats;
    }

    // Method to display results
    static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" +
                               results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nFinal Statistics:");
        System.out.println("Player\tWins\tWin %");
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t" + stat[1] + "\t" + stat[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        String[][] results = new String[games][3];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter choice (Rock/Paper/Scissors): ");
            String userChoice = sc.next();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
        }

        String[][] stats = calculateStats(userWins, computerWins, games);
        displayResults(results, stats);

        sc.close();
    }
}
