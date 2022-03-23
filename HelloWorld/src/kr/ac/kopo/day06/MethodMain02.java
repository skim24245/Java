package kr.ac.kopo.day06;

import java.util.Scanner;

public class MethodMain02 {
	//메소드를 정의하려면 어떤 기능의 메소드를 생성할 건지, 잘 파아해야 한다. 예를 들어, 문자 하나와 정수 하나를 받아와서 수행하려면 다른 곳에서도 2개를 만들어야 하고 순서가 뒤바뀌면 안된다. 
	 // 문자하나 정수 하나처럼 갯수를 맞춰 수행해야 한다. 
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("실수 : ");
		double f = Double.parseDouble(sc.nextLine());
		//double f = sc.nextDouble();
		//sc.nextLine();
		
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());	// "123" -> 123
		
		int num = sc.nextInt();
		sc.nextLine();
		
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.println("str : " + str + ", num : " + num);
		*/
		
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("num : " + num 
				+ ", num2 : " + num2 + ", num3 : " + num3);
		
	}
}
	