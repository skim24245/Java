package kr.ac.kopo.day06;

import java.util.Scanner;

class Icecream { // class를 생성
	String name; // 이름
	int price; // 가격
}

public class Icecream01 {
	public static void main(String[] args) {
				int sumOfCost = 0;
				Scanner sc = new Scanner(System.in);
				System.out.println("*** 1번째 아이스크림 구매정보 ***");
				Icecream cone1 = new Icecream();
				cone1.name = sc.next();
				cone1.price = sc.nextInt(); //바로 입력 
				
				System.out.println("*** 2번째 아이스크림 구매정보 ***");
				Icecream cone2 = new Icecream();
				cone2.name = sc.next();
				cone2.price = sc.nextInt();
				
				System.out.println("*** 3번째 아이스크림 구매정보 ***");
				Icecream cone3 = new Icecream();
				cone3.name = sc.next();
				cone3.price = sc.nextInt(); //바로 입력
				
				
				Icecream [] coneArr = {cone1, cone2, cone3};
				
				
				int i = 1;// 1부터 입력 
				for(Icecream cone : coneArr) {
					System.out.println("번호 : "  + i++ + ", 아이스크림명 : " + cone.name + ", 가격 : " + cone.price);
					sumOfCost += cone.price; // sumofCost= sumofCost + cone.price
				}
				
				System.out.println(sumOfCost);
			}
}