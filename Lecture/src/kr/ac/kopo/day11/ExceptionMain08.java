package kr.ac.kopo.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.Scanner;

class MismatchEvenException extends Exception {

	public MismatchEvenException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MismatchEvenException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MismatchEvenException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public MismatchEvenException() {
		super();
	}

	public MismatchEvenException(String message) {
		super(message);
	}
	
}

public class ExceptionMain08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("짝수를 입력 : ");
			int num = sc.nextInt();

			if (num < 0 || num % 2 == 1) {
				throw new MismatchEvenException(num + "은 짝수가 아닙니다");
			}
		} catch(Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수를 입력 : ");
		int num = sc.nextInt();
		
		if(num < 0 || num % 2 == 1) {
			System.out.println("잘못입력했습니다");
		} else {
			System.out.println("짝수 : " + num);
		}
		*/
	}
}



