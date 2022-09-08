package Repeat3;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int multi = 0;

		while (true) {

			multi += num;
			System.out.print(multi + " ");

			if (multi % 10 == 0) {
				break;
			}
		}
	}

}
