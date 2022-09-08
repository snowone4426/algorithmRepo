package Arr;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class A9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr, Collections.reverseOrder());

		for (int x : arr) {
			System.out.println(x);
		}
	}

}
