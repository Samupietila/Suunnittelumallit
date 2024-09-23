package template_method;

import template_method.*;
import java.util.Scanner;

public class YatzyKindOf extends Game {
    private Dice[] dice; 
    private GameCard[] gameCard;
    private Scanner sc = new Scanner(System.in);


    @Override
    public void initializeGame(int numberOfPlayers) {
        dice = new Dice[5];
        for (int i = 0; i < 5; i++) {
            dice[i] = new Dice(i);
        }
        gameCard = new GameCard[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            gameCard[i] = new GameCard(i);
        }
        System.out.println("Yatzy game initialized with " + numberOfPlayers + " players.");
    }

    @Override
    public boolean endOfGame() {
        for (GameCard gc : gameCard) {
            if (!gc.isFull()) {
                return false;
            }
        }
        System.out.println("Game over!");
        return true;
    }


    @Override
    public void playSingleTurn(int player) {
        gameCard[player].checkIfFull();
        if (gameCard[player].isFull()) {
            return;
        }
        throwDice(player);
        decideWhereToScore(player);
        System.out.println(gameCard[player]);
    }

    public void decideWhereToScore(int player) {
        do {
            System.out.println("Player " + player + " is playing.");
            System.out.println(gameCard[player]);
            System.out.println("Enter the ID of the slot you want to put your points: ");
            try {
                int scoreId = sc.nextInt();
                if (scoreId < 1 || scoreId > 6) {
                    System.out.println("Invalid slot ID. Choose a number between 1 and 6.");
                    continue;
                }
            scoreId--;
            if (gameCard[player].getSlotValueByNumber(scoreId) != -1) {
                System.out.println("This slot is already filled. Choose another one.");
                continue;
            }
            int score = checkTheScore(scoreId);
            gameCard[player].setSlotValueByNumber(scoreId, score);
            break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
            }
        } while (true);        
    }

    public int checkTheScore(int scoreId) {
        int score = 0;
        for (int i = 0; i < 5; i++) {
            if (dice[i].getValue() == scoreId + 1) {
                score += scoreId + 1;
            }
        }
        return score;
    }

    public void unLockAllDice() {
        for (int i = 0; i < 5; i++) {
            dice[i].setLocked(false);
        }
    }

    public void throwDice(int player) {
        int roll = 0;
        unLockAllDice();
        do {
        roll++;
        System.out.println("Player " + player + " is playing.");
        System.out.println("Throw " + roll + ":");
            for (int i = 0; i < 5; i++) {
                if (dice[i].isLocked()) {
                    continue;
                }
                dice[i].roll();
            }
            System.out.println("Dice values: ");
            for (Dice d : dice) {
                System.out.println(d);
            }
            if (roll == 3) {
                break;
            }
            unLockAllDice();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the IDs of the dice you want to lock, separated by spaces or write -1 to finish: ");
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }
            if (input.equals("")) {
                continue;
            }
            String[] diceIds = input.split(" ");
            for (String id : diceIds) {
            int diceId = Integer.parseInt(id);
            dice[diceId].setLocked(true);
            }
        } while (true);
    }
    
    @Override
    public void displayWinner() {
        int maxScore = 0;
        int winner = 0;
        for (int i = 0; i < gameCard.length; i++) {
            int totalScore = gameCard[i].getTotalScore();
            if (totalScore > maxScore) {
                maxScore = totalScore;
                winner = i;
            }
        }
        System.out.println("Player " + winner + " wins with " + maxScore + " points!");
    }

}