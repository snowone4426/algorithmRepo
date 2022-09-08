package Arr2;

public class A4 {

	public static void main(String[] args) {
		int[][] arr = { { 5, 8, 10, 6, 4 }, { 11, 20, 1, 13, 2 }, { 7, 9, 14, 22, 3 } };
		
		for (int[] x:arr) {
			for (int y : x) {
				System.out.printf("%2d   ",y);
			}
			System.out.println();
		}
	}

}
