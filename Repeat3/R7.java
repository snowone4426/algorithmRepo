package Repeat3;

import java.util.Scanner;

public class R7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		char alpa = 'A';

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(count++);
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(alpa++);
				if (alpa > 'Z') {
					alpa = 'A';
				}
			}
			System.out.println();
		}

	}

}
