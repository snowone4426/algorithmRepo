package Arr;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sum = 0;

		for (int i = 0; i < 6; i++) {
			sum += sc.nextFloat();
		}

		float avg = sum / 6;

		System.out.printf("%.1f", avg);
	}

}
