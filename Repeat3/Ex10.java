package Repeat3;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int odd = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(odd+" ");
				odd += 2;
				if (odd > 9) {
					odd = 1;
				}
			}
			System.out.println();
		}

	}

}
