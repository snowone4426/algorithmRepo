package Arr2;

public class Ex6 {

	public static void main(String[] args) {
		int[][] board = new int[5][5];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = 0;
			}
		}
		board[0][0]++;
		board[0][2]++;
		board[0][4]++;

		for (int i = 1; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {

				if (j - 1 < 0) {
					board[i][j] = board[i - 1][j + 1];
				} else if (j + 1 > 4) {
					board[i][j] = board[i - 1][j - 1];
				} else {
					board[i][j] = board[i - 1][j - 1] + board[i - 1][j + 1];
				}
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
