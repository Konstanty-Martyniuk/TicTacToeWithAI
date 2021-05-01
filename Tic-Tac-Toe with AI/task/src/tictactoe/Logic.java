package tictactoe;

public
class Logic {
    public int isWinner(char[][] field) {
        int result = 0;
        int xWins = 0;
        int oWins = 0;

        for (int i = 0; i < 3; i++) {
            if (field[i][0] + field[i][1] + field[i][2] == 264 ||
                    field[0][i] + field[1][i] + field[2][i] == 264) {
                xWins++;
            } else if (field[i][0] + field[i][1] + field[i][2] == 237 ||
                    field[0][i] + field[1][i] + field[2][i] == 237) {
                oWins++;
            }
        }
        if (field[0][0] + field[1][1] + field[2][2] == 264 ||
                field[2][0] + field[1][1] + field[0][2] == 264) {
            xWins++;
        } else if (field[0][0] + field[1][1] + field[2][2] == 237 ||
                field[2][0] + field[1][1] + field[0][2] == 237) {
            oWins++;
        }

        if (xWins > 0) {
            result = 1;
        } else if (oWins > 0) {
            result = 2;
        }
        return result;
    }

    public void printTheWinner(int result) {
        if (result == 1) {
            System.out.println("X wins");
        } else if (result == 2) {
            System.out.println("O wins");
        } else {
            System.out.println("Draw");
        }
    }

    public static
    boolean playTheGame(GameBoard field, AILogic aiLogic, GameUI gameUI, Logic logic, int[] resultAndMoveNumber, int gameOption) {
        switch (gameOption) {
            case 0:
                return true;
            case 5:
            case 7:
            case 1:
                while (resultAndMoveNumber[0] == 0) {
                    resultAndMoveNumber[0] = getUserMove(field, gameUI, logic, resultAndMoveNumber);
                    if (resultAndMoveNumber[0] == 0) {
                        resultAndMoveNumber[0] = getAIMove(field, aiLogic, logic, resultAndMoveNumber, gameOption);
                    }
                }
                break;
            case 6:
            case 8:
            case 2:
                while (resultAndMoveNumber[0] == 0) {
                    resultAndMoveNumber[0] = getAIMove(field, aiLogic, logic, resultAndMoveNumber, gameOption);
                    if (resultAndMoveNumber[0] == 0) {
                        resultAndMoveNumber[0] = getUserMove(field, gameUI, logic, resultAndMoveNumber);
                    }
                }
                break;
            case 3:
                while (resultAndMoveNumber[0] == 0) {
                    resultAndMoveNumber[0] = getAIMove(field, aiLogic, logic, resultAndMoveNumber, gameOption);
                    if (resultAndMoveNumber[0] == 0) {
                        resultAndMoveNumber[0] = getAIMove(field, aiLogic, logic, resultAndMoveNumber, gameOption);
                    }
                }
                break;
            case 4:
                while (resultAndMoveNumber[0] == 0) {
                    resultAndMoveNumber[0] = getUserMove(field, gameUI, logic, resultAndMoveNumber);
                    if (resultAndMoveNumber[0] == 0) {
                        resultAndMoveNumber[0] = getUserMove(field, gameUI, logic, resultAndMoveNumber);
                    }
                }
                break;
        }
        return false;
    }

    public static
    int getAIMove(GameBoard field, AILogic aiLogic, Logic logic, int[] resultAndMoveNumber, int gameOption) {
        int result;
        if (gameOption == 5 || gameOption == 6) {
            field.updateField(aiLogic.getMediumAICoordinates(), resultAndMoveNumber[1] % 2 == 0 ? 'X' : 'O');
        } else if (gameOption == 7 || gameOption == 8) {
            field.updateField(aiLogic.getHardAICoordinates(), resultAndMoveNumber[1] % 2 == 0 ? 'X' : 'O');
        } else {
            field.updateField(aiLogic.getAICoordinates(), resultAndMoveNumber[1] % 2 == 0 ? 'X' : 'O');
        }
        field.printField();
        result = logic.isWinner(field.getField());
        resultAndMoveNumber[1]++;
        return result;
    }

    public static
    int getUserMove(GameBoard field, GameUI gameUI, Logic logic, int[] resultAndMoveNumber) {
        int result;
        field.updateField(gameUI.getCoordinates(), resultAndMoveNumber[1] % 2 == 0 ? 'X' : 'O');
        field.printField();
        result = logic.isWinner(field.getField());
        resultAndMoveNumber[1]++;
        return result;
    }

}
