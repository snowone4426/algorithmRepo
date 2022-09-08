package Arr;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 10000;
		int max = 1;

		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			if (num < 100 && num > max) {
				max = num;
			}
			if (num > 100 && num < min) {
				min = num;
			}
		}

		System.out.println(max + " " + min);

	}

}
