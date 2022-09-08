package Arr;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		float avg;

		for (int i = 0; i < 100; i++) {
			int num = sc.nextInt();
			if (num == 0) {
				avg = (float) sum / count;
				System.out.printf("Multiples of 5 : %d\nsum : %d\navg : %.1f", count, sum, avg);
				break;
			}
			if (num % 5 == 0) {
				sum += num;
				count++;
			}
		}
	}

}
