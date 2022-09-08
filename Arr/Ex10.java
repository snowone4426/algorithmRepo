package Arr;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
