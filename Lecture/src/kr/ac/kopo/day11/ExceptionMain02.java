package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain02 {

	
		public static void main(String[] args) {
			
			System.out.println("main start...");
			try {
				Random r = new Random();
				int num = r.nextInt(3);	// 0, 1, 2
				System.out.println("num : " + num);
				System.out.println(10 / num);
			} catch(ArithmeticException ae) {
//				System.out.println("예외발생 : " + ae.getMessage());
				ae.printStackTrace(); //어느줄에서 에러가 났는지 알 수 있음. 
			}
			System.out.println("main end...");
			
		}
	}
