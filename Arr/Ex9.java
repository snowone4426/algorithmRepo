package Arr;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			if (num == 0)
				break;
			if (num % 2 == 0) {
				arr[i] = num / 2;
			} else {
				arr[i] = 2 * num;
			}
			count++;
		}
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
