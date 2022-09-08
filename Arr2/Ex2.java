package Arr2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[11][2];

		for (int i = 0; i < score.length; i++) {
			score[i][0] = i * 10;
			score[i][1] = 0;
		}

		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			switch (num) {
			case 100:
				score[10][1]++;
				break;
			default:
				score[Integer.toString(num).charAt(0) - '0'][1]++;
				break;
			}
		}

		for (int i = score.length - 1; i >= 0; i--) {
			if (score[i][1] != 0) {
				System.out.printf("%-3d : %d person\n", score[i][0], score[i][1]);
			}
		}

	}

}
