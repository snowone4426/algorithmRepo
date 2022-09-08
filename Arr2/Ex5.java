package Arr2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[4];

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%dclass?", i + 1);
			for (int j = 0; j < 3; j++) {
				score[i] += sc.nextInt();
			}
		}

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%dclass :  %d\n", i + 1, score[i]);
		}
	}

}
