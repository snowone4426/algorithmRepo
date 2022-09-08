package Arr;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int evenSum = 0;
		int oddSum = 0;
		int oddCount = 0;
		float oddAvg;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i % 2 != 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
				oddCount++;
			}
		}

		oddAvg = (float) oddSum / oddCount;

		System.out.println("sum : " + evenSum);
		System.out.printf("avg : %.1f", oddAvg);
	}

}
