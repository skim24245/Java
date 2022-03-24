package Assignment;

import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		if (input1 >= 90 && input1 <= 100) { //괄호 위치 잘 파악하기
			System.out.println("A");
		}else if (input1 >= 80 && input1 <= 89)
			System.out.println("B");
		else if (input1 >= 70 && input1 <= 79)
			System.out.println("C");
		else if (input1 >= 60 && input1 <= 69)
			System.out.println("D");
		else
			System.out.println("F");
	}

}
