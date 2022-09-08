package Arr;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// 굳이 배열을 쓰면
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.next().charAt(0);
		}

		System.out.println(arr[0] + " " + arr[3] + " " + arr[6]);
	}

}
