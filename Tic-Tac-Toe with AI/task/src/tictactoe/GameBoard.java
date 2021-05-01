package tictactoe;

public
class GameBoard {
    static char[][] field = new char[3][3];

    public GameBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = ' ';
            }
        }
    }

    public void printField() {
        System.out.println("---------");
        for (char[] chars : field) {
            System.out.print("| ");
            for (int k = 0; k < 3; k++) {
                System.out.print(chars[k] + " ");
            }
            System.out.printf("|\n");
        }
        System.out.println("---------");
    }

    public static void updateField(int[] coordinates, char mark) {
        field[coordinates[0]][coordinates[1]] = mark;
    }

    public static int checkField(int[] coordinates) {
        if (coordinates[0] > 2 || coordinates[0] < 0 || coordinates[1] > 2 || coordinates[1] < 0) {
            return 0;
        } else if (field[coordinates[0]][coordinates[1]] != ' ') {
            return 1;
        } else {
            return 2;
        }
    }

    public static
    char[][] getField() {
        return field;
    }
}
