package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class GameUI {
    int[] getCoordinates() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectInput = true;
        int[] coordinates = new int[2];

        while (isCorrectInput) {
            try {
                System.out.print("Enter the coordinates: ");
                coordinates = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                coordinates[0]--;
                coordinates[1]--;
                int logicResponse = GameBoard.checkField(coordinates);
                switch (logicResponse) {
                    case 0: System.out.println("Coordinates should be from 1 to 3!");
                    break;
                    case 1: System.out.println("This cell is occupied! Choose another one!");
                    break;
                    default:
                        isCorrectInput = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            }
        }
        return coordinates;
    }

    int chooseGameOption() {
        Scanner scanner = new Scanner(System.in);
        boolean continueValidation = true;
        int result = -1;
        while (continueValidation) {
            System.out.println("Input command: ");
            String[] gameOption = scanner.nextLine().split(" ");

            if (gameOption[0].equals("exit")) {
                System.out.print("exit");
                continueValidation = false;
                result = 0;
            } else if (gameOption.length < 3) {
                System.out.println("Bad parameters!");
            } else if(gameOption[0].equals("start") && gameOption[1].equals("user") && gameOption[2].equals("easy")) {
                continueValidation = false;
                result = 1;
            } else if(gameOption[0].equals("start") && gameOption[1].equals("easy") && gameOption[2].equals("user")) {
                continueValidation = false;
                result = 2;
            } else if(gameOption[0].equals("start") && gameOption[1].equals("easy") && gameOption[2].equals("easy")) {
                continueValidation = false;
                result = 3;
            } else if(gameOption[0].equals("start") && gameOption[1].equals("user") && gameOption[2].equals("user")) {
                continueValidation = false;
                result = 4;
            } else if(gameOption[0].equals("start") && gameOption[1].equals("user") && gameOption[2].equals("medium")) {
                continueValidation = false;
                result = 5;
            } else if(gameOption[0].equals("start") && gameOption[1].equals("medium") && gameOption[2].equals("user")) {
                continueValidation = false;
                result = 6;
            } else if(gameOption[0].equals("start") && gameOption[1].equals("user") && gameOption[2].equals("hard")) {
                continueValidation = false;
                result = 7;
            } else if(gameOption[0].equals("start") && gameOption[1].equals("hard") && gameOption[2].equals("user")) {
                continueValidation = false;
                result = 8;
            } else {
                System.out.println("Bad parameters!");
            }
        }
        return result;
    }
}
