package ru.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (int j = 0; j < board.length; j++) {
            if (board[j][column] != 'X') {
                return false;
            }
        }
        return true;
    }

}
