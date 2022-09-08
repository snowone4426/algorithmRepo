package Arr2;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[][] board = new int[num][2 * num - 1];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
			}
		}
		board[0][num - 1] = 1;

		for (int i = 1; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (j - 1 < 0) {
					board[i][j] = board[i - 1][j + 1];
				} else if (j + 1 >= board[i].length) {
					board[i][j] = board[i - 1][j - 1];
				} else {
					board[i][j] = board[i - 1][j - 1] + board[i - 1][j + 1];
				}
			}
		}

		for (int i = board.length - 1; i >= 0; i--) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != 0) {
					System.out.print(board[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
