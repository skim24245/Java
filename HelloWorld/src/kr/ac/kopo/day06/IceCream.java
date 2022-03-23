package kr.ac.kopo.day06;

import java.util.Scanner;

public class IceCream {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이스크림 몇개 구입하시겠습니까? => ");
		int count = sc.nextInt();
		IceCream [] IceArr = new IceCream[count];
		for(int i = 0; i <count; i++) {
			
			iceArr[i] = new Icecream(); // ()는 클래스 icecream뒤에 배열이 만들어진다는 ㅓㄳ.  
			
			System.out.println("***" + (i+1) + "번째 아이스크림 구매정보 입력***");
			System.out.println("아이스크림 명 : ");
			IceArr[i].name = sc.nextLine(); //이렇게만 치면 null이 나오게 되는데 아이스크림의 인스턴스 객체의 주소값(참조값)을 기억하는 참조배열값을 만들고, 아이스크림 내부 Icecream ice01 ; Icecream ice02. Icecream ice 03를 만들어줘야 함
			// Icecream ice01;
			// Icecream ice02;
			// Icecream ice03;
			
			//정수나 실수를 입력받고 그 다음에 입력받는 문자가 문자나 문자열이면 올바르게 입력 못받는다. 
			;
		}
	}
}
