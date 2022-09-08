package Arr;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int count = 0;

		while (count < 100) {
			int num = sc.nextInt();

			if (num == -1) {
				break;
			}
			arr[count] = num;
			count++;
		}

		System.out.printf("%d %d %d", arr[count - 3], arr[count - 2], arr[count - 1]);
	}

}
