package Repeat3;

import java.util.Scanner;

public class R6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char alpa = 'A';

		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print(alpa++);
				if (alpa > 'Z') {
					alpa = 'A';
				}
			}
			System.out.println();
		}

	}

}
