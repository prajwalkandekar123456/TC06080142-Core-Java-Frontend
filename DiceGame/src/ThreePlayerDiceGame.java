import java.util.Random;
import java.util.Scanner;

public class ThreePlayerDiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the 3-Player Dice Game!");

        System.out.print("Enter Player 1 name: ");
        String player1 = scanner.nextLine();
        System.out.print("Enter Player 2 name: ");
        String player2 = scanner.nextLine();
        System.out.print("Enter Player 3 name: ");
        String player3 = scanner.nextLine();

        int round = 1;
        int[] scores = new int[3]; 

        while (round <= 5) { 

            System.out.println("\nRound " + round + " begins!");

            int roll1 = rollDice(random);
            int roll2 = rollDice(random);
            int roll3 = rollDice(random);

            System.out.println(player1 + " rolls: " + roll1);
            System.out.println(player2 + " rolls: " + roll2);
            System.out.println(player3 + " rolls: " + roll3);

            String winner = determineRoundWinner(player1, roll1, player2, roll2, player3, roll3);

            // Handle ties
            if (winner.equals("It's a tie!")) {
                System.out.println("Round " + round + " is a tie!");
            } else {
                int winnerIndex = winner.equals(player1) ? 0 : (winner.equals(player2) ? 1 : 2);
                scores[winnerIndex]++;
                System.out.println("Round " + round + " winner: " + winner);
            }

            // Display scores after each round
            System.out.println("Scores after Round " + round + ":");
            System.out.println(player1 + ": " + scores[0]);
            System.out.println(player2 + ": " + scores[1]);
            System.out.println(player3 + ": " + scores[2]);

            round++;
        }

        String overallWinner = determineOverallWinner(player1, player2, player3, scores);
        System.out.println("\nOverall winner: " + overallWinner);

        scanner.close();
    }

    private static int rollDice(Random random) {
        return random.nextInt(6) + 1; // Simulating a 6-sided dice roll
    }

    private static String determineRoundWinner(String player1, int roll1, String player2, int roll2, String player3, int roll3) {
        if (roll1 == roll2 && roll2 == roll3) {
            return "It's a tie!";
        } else if (roll1 >= roll2 && roll1 >= roll3) {
            return player1;
        } else if (roll2 >= roll1 && roll2 >= roll3) {
            return player2;
        } else {
            return player3;
        }
    }

    private static String determineOverallWinner(String player1, String player2, String player3, int[] scores) {
        int maxScore = Math.max(Math.max(scores[0], scores[1]), scores[2]);

        if (scores[0] == scores[1] && scores[1] == scores[2]) {
            return "It's a tie!";
        } else if (scores[0] == maxScore) {
            return player1;
        } else if (scores[1] == maxScore) {
            return player2;
        } else {
            return player3;
        }
    }
    
    
}
