package tictactoe;

import java.util.Random;

public
class AILogic {
    public int[] getAICoordinates() {
        Random random = new Random();
        int[] aIcoordinates = new int[2];
        int validateAICoordinates = 0;

        while (validateAICoordinates != 2) {
            aIcoordinates[0] = random.nextInt(3);
            aIcoordinates[1] = random.nextInt(3);
            validateAICoordinates = GameBoard.checkField(aIcoordinates);
        }
        System.out.println("Making move level \"easy\"");
        return aIcoordinates;
    }

    public int[] getMediumAICoordinates() {
        char[][] field = GameBoard.getField();
        int winXcombinationToBlock = 208;
        int winOcombinationToBlock = 190;
        char[] positionToBlock;
        int[] aIcoordinates = new int[2];

            for (int i = 0; i < 3; i++) {
                if (field[i][0] + field[i][1] + field[i][2] == winXcombinationToBlock ||
                        field[i][0] + field[i][1] + field[i][2] == winOcombinationToBlock) {
                    //
                    aIcoordinates[0] = i;
                    positionToBlock = new char[]{field[i][0], field[i][1], field[i][2]};
                    for (int j = 0; j < 3; j++) {
                        if (positionToBlock[j] == ' '){
                            aIcoordinates[1] = j;
                        }
                    }

                } else if (field[0][i] + field[1][i] + field[2][i] == winXcombinationToBlock ||
                        field[0][i] + field[1][i] + field[2][i] == winOcombinationToBlock) {
                    aIcoordinates[0] = i;
                    positionToBlock =new char[]{field[0][i], field[1][i], field[2][i]};
                    for (int j = 0; j < 3; j++) {
                        if (positionToBlock[j] == ' '){
                            aIcoordinates[1] = j;
                        }
                    }
                }
            }
            if (field[0][0] + field[1][1] + field[2][2] == winXcombinationToBlock ||
                    field[0][0] + field[1][1] + field[2][2] == winOcombinationToBlock) {
                if (field[0][0] == ' ') {
                    aIcoordinates[0] = 0;
                    aIcoordinates[1] = 0;
                } else if (field[1][1] == ' ') {
                    aIcoordinates[0] = 1;
                    aIcoordinates[1] = 1;
                } if (field[2][2] == ' ') {
                    aIcoordinates[0] = 2;
                    aIcoordinates[1] = 2;
                }
            } else if (field[2][0] + field[1][1] + field[0][2] == winXcombinationToBlock ||
                    field[2][0] + field[1][1] + field[0][2] == winOcombinationToBlock) {
                if (field[2][0] == ' ') {
                    aIcoordinates[0] = 2;
                    aIcoordinates[1] = 0;
                } else if (field[1][1] == ' ') {
                    aIcoordinates[0] = 1;
                    aIcoordinates[1] = 1;
                } if (field[0][2] == ' ') {
                    aIcoordinates[0] = 0;
                    aIcoordinates[1] = 2;
                }
            } else {
            Random random = new Random();
            int validateAICoordinates = 0;
            while (validateAICoordinates != 2) {
                aIcoordinates[0] = random.nextInt(3);
                aIcoordinates[1] = random.nextInt(3);
                validateAICoordinates = GameBoard.checkField(aIcoordinates);
            }
        }
        System.out.println("Making move level \"medium\"");
        return aIcoordinates;
    }

    public int[] getHardAICoordinates() {
        System.out.println("Making move level \"hard\"");
        char[][] field = GameBoard.getField();
        int winXcombinationToBlock = 208;
        int winOcombinationToBlock = 190;
        char[] positionToBlock;
        int[] aIcoordinates = new int[2];


        return aIcoordinates;
    }


}
