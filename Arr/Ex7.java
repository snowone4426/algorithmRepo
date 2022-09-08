package Arr;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 100;
		int min = 999;

		while (true) {
			int num = sc.nextInt();
			
			if (num == 999) {
				System.out.println("max : " + max);
				System.out.println("min : " + min);
				break;
			}
			
			if (num < min) {
				min = num;
			}
			
			if (num > max) {
				max = num;
			}
		}
	}

}
