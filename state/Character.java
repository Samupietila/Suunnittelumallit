package state;

import java.util.Scanner;

public class Character {
    private static Scanner scanner = new Scanner(System.in);
    private State state;

    private String name;
    private int healthPoints;
    private String level;
    private int experiencePoints;
    private boolean continues = false;

    public Character(String name) {
        this.name = name;
        this.healthPoints = 50;
        this.level = "Novice";
        this.experiencePoints = 0;
        this.state = new NoviceLevel(this);
    }

    public void operate() {
        while (true) {
            if (state == null) {
                // should never happen
                System.out.println("Game crashed");
                return;
            }
            this.printCharacter();
            state.action();
            if (healthPoints <= 0) {
                System.out.println("GAME OVER");
                return;
            }
            if (level.equals("Master") && continues == false) {
                System.out.println("Game completed! but you can choose to continue playing!");
                System.out.println("Do you want to continue playing?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    continues = true;
                } else {
                    System.out.println("THANK YOU FOR PLAYING!");
                    System.out.println("Exiting game...");
                    System.exit(0);
                }
                return;
            }
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getLevel() {
        return level;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public State getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printCharacter() {
        System.out.println("*********************************");
        System.out.println("* Character Information:");
        System.out.println("* Name: " + name);
        System.out.println("* Health Points: " + healthPoints);
        System.out.println("* Level: " + level);
        System.out.println("* Experience Points: " + experiencePoints);
        System.out.println("*********************************");
    }

    public int readUserChoice(String[] options) {
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        return scanner.nextInt();
    }

}