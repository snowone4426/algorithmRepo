package Arr2;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[26][2];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = (char) (65 + i);
			arr[i][1] = 0;
		}

		for (int i = 0; i < 100; i++) {
			char alpa = sc.next().charAt(0);

			if (alpa < 'A' || alpa > 'Z')
				break;
			arr[alpa - 65][1]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if ((int) arr[i][1] != 0) {
				System.out.printf("%c : %d\n", arr[i][0], (int) arr[i][1]);
			}
		}
	}

}
