package Repeat3;

import java.util.Scanner;
public class R1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 1;

        while ( sum < input ) {
            if ( i%2 !=0 ) {
                sum+=i;
                count++;
            }
            i++;
        }

        System.out.printf("%d %d",count, sum);

	}
}