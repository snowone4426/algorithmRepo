package Arr;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		int num1 = sc.nextInt() - 1;
		int num2 = sc.nextInt() - 1;

		System.out.printf("%.1f", arr[num1] + arr[num2]);
	}

}
