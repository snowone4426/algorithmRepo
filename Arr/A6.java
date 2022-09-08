package Arr;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();

		for (int i = 0; i < 9; i++) {
			int num = sc.nextInt();
			if (min > num) {
				min = num;
			}
		}
		
		System.out.println(min);
	}

}
