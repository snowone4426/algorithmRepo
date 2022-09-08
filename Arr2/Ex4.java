package Arr2;

public class Ex4 {

	public static void main(String[] args) {
		int[][] arr = { { 3, 5, 9 }, { 2, 11, 5 }, { 8, 30, 10 }, { 22, 5, 1 } };
		int sum = 0;

		for (int[] x : arr) {
			for (int y : x) {
				sum += y;
				System.out.printf("%-2d ",y);
			}
			System.out.println();
		}
		System.out.println(sum);
	}

}
