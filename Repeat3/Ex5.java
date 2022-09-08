package Repeat3;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 2*(n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < 2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
