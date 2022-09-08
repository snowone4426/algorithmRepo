package Arr2;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] firstArr = new int[2][4];
		int[][] secondArr = new int[2][4];

		System.out.println("first array");

		for (int i = 0; i < firstArr.length; i++) {
			for (int j = 0; j < firstArr[i].length; j++) {
				firstArr[i][j] = sc.nextInt();
			}
		}

		System.out.println("second array");

		for (int i = 0; i < secondArr.length; i++) {
			for (int j = 0; j < secondArr[i].length; j++) {
				secondArr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < firstArr.length; i++) {
			for (int j = 0; j < firstArr[i].length; j++) {
				System.out.print(firstArr[i][j] * secondArr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
