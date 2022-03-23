package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * a 입력 : 10
 * b 입력 : 3
 * 
 * 10이 3의 배수인가? false
 * 
 */

public class Operation02 {
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("a 입력 : ");
			int a = scanner.nextInt();
			
			System.out.println("b 입력 : ");
			int b = scanner.nextInt();
			
			boolean result = (b != 0 && a % b == 0);
			System.out.printf("%d가 %d의 배수인가? %b/n", a, b, result);
		}
		
		/*
		 * 조건식 ? T : F
		 * 조건식 ? T : (조건식 '? T' :F')
		 */
	
		
	
		System.out.print("Hello World!");
		
	}


}
