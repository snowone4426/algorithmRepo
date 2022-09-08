package Repeat3;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char alpa = 'A';
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(alpa++);
			}
			for (int j = 0; j < i; j++) {
				System.out.print(count++);
			}
			System.out.println();
		}
		
	}

}
