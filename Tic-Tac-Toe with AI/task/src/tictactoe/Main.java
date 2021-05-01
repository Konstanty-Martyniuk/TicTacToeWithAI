package tictactoe;

public class Main {
    public static void main(String[] args) {
        GameBoard field = new GameBoard();
        AILogic aiLogic = new AILogic();
        GameUI gameUI = new GameUI();
        Logic logic = new Logic();
        int[] resultAndMoveNumber = {0, 0}; //resultAndMoveNumber[0] = result, resultAndMoveNumber[1] = move number
        int gameOption = gameUI.chooseGameOption();
        field.printField();

        if (logic.playTheGame(field, aiLogic, gameUI, logic, resultAndMoveNumber, gameOption)) return;
        logic.printTheWinner(resultAndMoveNumber[0]);
    }
}