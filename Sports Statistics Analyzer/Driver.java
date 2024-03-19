import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static Scanner myScanner = new Scanner(System.in);
    private static ArrayList<Player> players = new ArrayList<>();
    public static void main(String[] args) {
        boolean run = true;
        while(run){

            int choice = 0;
            boolean valid = false;

            while (!valid){
                System.out.println("\nWelcome to the player analysis system!");
                System.out.println("\nPlease select from the following options");
                System.out.println("\n1. Add a basketball player");
                System.out.println("2. Add a football player");
                System.out.println("3. Display all players");
                System.out.println("4. Exit\n");
                if (myScanner.hasNextInt()){
                    choice = myScanner.nextInt();
                    myScanner.nextLine();
                    valid = true;
                } else {
                    System.out.println("\nInvalid input. Please enter an integer for your choice.");
                    myScanner.nextLine();
                }
            } 

            switch(choice){
                case 1: 
                    System.out.println();
                    addBasketballPlayer();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    addFootballPlayer();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    displayAllPlayers();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\nProgram ending...\n");
                    run = false;
                    break;
                default:
                    System.out.println("\nInvalid input. Please try again.");
            }
        }
        myScanner.close();
    }

    private static void addBasketballPlayer(){
        String regex = "^[a-zA-Z]+(\\s[a-zA-Z]+)*$";

        String name = validateStringWithPattern("Enter name: \n", regex);
        int age = validatePositiveInt("Enter age: ", 0, 10000);
        String team = validateStringWithPattern("Enter team: \n", regex);
        String position = validateStringWithPattern("Enter position: \n", regex);
        int points = validatePositiveInt("Enter points: ", 0, 10000);
        int rebounds = validatePositiveInt("Enter rebounds: ", 0, 10000);
        int assists = validatePositiveInt("Enter assists: ", 0, 10000);


        BasketballPlayer basketballPlayer = new BasketballPlayer(name, age, team, position, points, rebounds, assists);
        players.add(basketballPlayer);
        System.out.println(name + " added to the database.");
    }

    private static void addFootballPlayer(){
        String regex = "^[a-zA-Z]+(\\s[a-zA-Z]+)*$";

        String name = validateStringWithPattern("Enter name: \n", regex);
        int age = validatePositiveInt("Enter age: ", 0, 10000);
        String team = validateStringWithPattern("Enter team: \n", regex);
        String position = validateStringWithPattern("Enter position: \n", regex);
        int totalYards = validatePositiveInt("Enter total yards: ", 0, 10000);
        int touchdowns = validatePositiveInt("Enter touchdowns: ", 0, 10000);

        FootballPlayer footballPlayer = new FootballPlayer(name, age, team, position, totalYards, touchdowns);
        players.add(footballPlayer);
        System.out.println(name + " added to the database.");
    }

    private static void displayAllPlayers(){
        if (players.isEmpty()){
            System.out.println("No players have been added yet");
            return;
        }

        System.out.println("All Players: -------------------------------------------------------------------------------------------- \n");
        for (Player player : players){
            player.printStats();
            System.out.println();
        }
        System.out.print("---------------------------------------------------------------------------------------------------------");
    }

    private static int validatePositiveInt(String prompt, int min, int max) {
        int value;
        do {
            System.out.println(prompt + "\n");
            while (!myScanner.hasNextInt()) {
                System.out.println("\nInvalid input. Please enter a number\n");
                myScanner.next();
            }
            value = myScanner.nextInt();
            myScanner.nextLine();
            System.out.println();
            if (value < min || value > max) {
                System.out.println("Input must be between " + min + " and " + max + ".\n");
            }
        } while (value < min || value > max);
        return value;
    }

    private static String validateStringWithPattern(String prompt, String regex) {
        String input;
        do {
            System.out.println(prompt);
            input = myScanner.nextLine();
            System.out.println();
            if (!input.matches(regex)) {
                System.out.println("Invalid input. Enter words only (No hyphens, numbers, etc.)\n");
            }
        } while (!input.matches(regex));
        return input;
    }
}

