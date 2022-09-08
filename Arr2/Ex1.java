package Arr2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] count = new int[6][2];

		for (int i = 0; i < 6; i++) {
			count[i][0] = i + 1;
			count[i][1] = 0;
		}

		for (int i = 0; i < 10; i++) {
			count[sc.nextInt() - 1][1]++;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.printf("%d : %d\n", count[i][0], count[i][1]);
		}
	}

}
