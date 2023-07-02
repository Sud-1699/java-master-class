import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        //First Way
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        System.out.println(Arrays.deepToString(board));

        //Second Way
        char[][] board2 = new char[][] {
                new char[] {'-', '-', '-',},
                new char[] {'-', '-', '-',},
                new char[] {'-', '-', '-',},
        };

        System.out.println(Arrays.deepToString(board2));
    }
}
