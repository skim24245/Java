package kr.ac.kopo.day02;

import java.util.Scanner;

public class IFMain04 {
	 public static void main(String[]args) {
		 public class Java {

				public static void main(String[] args) {
					// TODO Auto-generated method stub

				}

			}

		 System.out.println("1 - 3사이의 정수 입력 : ");
	int num = sc.nextInt();
	
	switch(num) { //SWITCH는 동등비교일 때만 씀. 그럼 SWITCH로 만든 모든 문장들은 IF로도 쓸 수 있음. SWITCH와 IF의 차이점은 일반적으로 IF는 5가지의 갈래길이 있으면 하나만 선택하는 것이고, 선택 안된 값들은 다 버리는 것임.
	// N개 중에 하나만을 쓰느 ㄴ것
	//SWITCH는 2개를 선택하고 3개를 버리고., 3개를 선택하고 2개를 버릴 수 있고 N개 중에 하나만 선택하는 것이 아니라 N 개 중 N개를 쓸 수 있음.
	//CASE라는 것은 책의 포스트잇을 (책 COVER CASE)  시작점부터 끝까지 읽는 것임. CASE2라는 것은 2부터 DEFAULT까지 말함. NUM 3이라면 CASE 3부터 DEFUALT 값까지 모두 수행. 
	//한번 문장을 수행하게 되면 끝나는 위치까지 가야하지만, 나머지 부분을 실행하고 싶다면 break를 쓰게 되는 것임.
	//break 키워드는 for while do while swtich에서만 의미 있음. if는 break랑 아무 의미 없음. 
	//break를 쓰면 커서가 끝으로 가게 되는 것임. 
	
	case 1 : //범위를 지정하는 것이 아니라 동등비교를 뜻함. 따라서 case 2가 먼저 쓰고 뒤에 case 1이라고 써도 상관 없음. 순서는 상관 없다. defult는 일방적으로 밑에 적는 게 맞지만 위에 쓴다고 해도 상관 없음. 값은 그대로 수행하려는 값이 출력되게 된다. 
		System.out.println("ONE");
		break;
	case 2 :
		System.out.println("TWO");
		break;
	case 3 :
		System.out.println("THREE");
		break;
	default : //num이 1, 2, 3 다 아닐때
	System.out.println("ERROR");
		
	}
	
	if(num == 1) {
		System.out.println("ONE");
	} else if(num == 2) {
		System.out.println("TWO");
	} else if(num == 3) {
		System.out.println("THREE");
	} else {
		System.out.println("ERROR");
	
	}
	 }
	/*
	 1~3사이의 정수 입력 :
	 1 입려시 "ONE" 출력
	 2 입력시 "TWO" 출력
	 3 입력시 "THREE" 출력
	 그 외 "ERROR" 출력
	 */
}
