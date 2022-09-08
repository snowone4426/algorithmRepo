package Arr;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int oddSum = 0;
		int evenSum = 0;

		for (int i = 1; i <= 10; i++) {
			int num = sc.nextInt();
			if (i % 2 == 0) {
				evenSum += num;
			} else {
				oddSum += num;
			}
		}

		System.out.printf("odd : %d\neven : %d", oddSum, evenSum);
	}

}
