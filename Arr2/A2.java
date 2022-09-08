package Arr2;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][2];

		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = i;
			arr[i][1] = 0;
		}

		while (true) {
			int num = sc.nextInt();
			int idx = Integer.toString(num).charAt(0) - '0';

			if (num == 0)
				break;

			if (num < 10) {
				arr[0][1]++;
			} else {
				arr[idx][1]++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i][1] > 0) {
				System.out.printf("%d : %d\n", arr[i][0], arr[i][1]);
			}
		}
	}

}
