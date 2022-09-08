package Repeat3;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		
		while (count < 20) {
			int num = sc.nextInt();
			
			if (num == 0) {
				break;
			}
			
			sum += num;
			count++;
		}
		
		System.out.print(sum + " ");
		System.out.println(sum/count);
	}

}
