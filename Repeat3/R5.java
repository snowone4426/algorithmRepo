package Repeat3;

import java.util.Scanner;

public class R5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*(input - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}