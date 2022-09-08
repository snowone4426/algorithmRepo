package Arr;

import java.util.Scanner;
import java.util.Arrays;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = { 'J', 'U', 'N', 'G', 'O', 'L' };
		char input = sc.next().charAt(0);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input) {
				System.out.println(i);
				break;
			}
			if (i == arr.length - 1) {
				System.out.println("none");
			}

		}
	}

}
