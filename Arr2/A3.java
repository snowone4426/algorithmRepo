package Arr2;

import java.util.Scanner;
import java.util.ArrayList;

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(sc.nextInt());

		do {
			list.add(list.get(list.size() - 2) - list.get(list.size() - 1));
		} while (list.get(list.size() - 1) > 0);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}