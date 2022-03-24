package Assignment;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for (int j = 1; j <=9 ; j ++) {
			System.out.printf(""%d" * "%d" = "%d", i, j);
		}
		
	}
}
