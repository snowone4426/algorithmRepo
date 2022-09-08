package Arr;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sum+= arr[0] + arr[2] + arr[4];
		
		System.out.println(sum);
		
	}

}
