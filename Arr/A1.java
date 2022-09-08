package Arr;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.next();
			System.out.print(arr[i]);
		}
	}

}
