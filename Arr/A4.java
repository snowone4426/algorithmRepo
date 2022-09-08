package Arr;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int n;

		for (n = 0; n < 100; n++) {
			int num = sc.nextInt();

			if (num == 0) {
				break;
			}

			arr[n] = num;
		}

		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
