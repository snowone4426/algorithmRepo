package Arr2;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] grade = new String[5];
		int count = 0;

		for (int i = 0; i < grade.length; i++) {
			int sum = 0;
			double avg;

			for (int j = 0; j < 4; j++) {
				sum += sc.nextInt();
			}

			avg = (double) sum / 4;

			if (avg < 80) {
				grade[i] = "fail";
			} else {
				grade[i] = "pass";
				count++;
			}
		}

		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i]);
		}
		System.out.printf("Successful : %d", count);

	}

}
