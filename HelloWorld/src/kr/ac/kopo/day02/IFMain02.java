package kr.ac.kopo.day02;

import java.util.Scanner;

public class IFMain02 {
//걷다
//택시타다
//버스타다
	
/*
 * 8시 <= 출발시간 < 8시 15분
 	컴퓨터에서는 2개씩 2개씩 연산을 수행해야 하기 대문에
	위에처럼 쓰면 오류가 나온다.
	8시와 출발시간, 출발시간과 8시 15분 이렇게 나눠서 써야 하고
	이렇게 2개로 나누기 위해서는 논리 코드 (true, false) 를 써야 한다. 
	크기 비교 할 대 3> num 이렇게 쓰는게 아니라 num <3 이렇게 써야 한다.
	변수는 왼쪽에 써야 함 
	따라서 여러개의 문장을 써야 할 때에는
	연산을 수행할 지 안할지 제어를 먼저 가하고, (첫번째 케이스)
	if(조건1){
		문장1;
	} else { //조건 1이 거짓인것들중에 조건 2가 참이라면 문장 2를 수행하라. 
	    if(조건2) {
		문장2;
	} else { //조건 1이 거짓인것들중에 조건 2가 거짓인들중에 
		문장3;
	}
	
}
 */
	
/*
 * 집에서 출발한 시간을 입력하세요 ex 7시 30분 : 730 = > 8시 7분이면 807 이렇게 적으면
 * 버스를 탑니다.
 *  
 */
	public static void main(String[]args) {
		public class Java {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

			}

		}

		System.out.println("집에서  출발한 시간을 입력하세요(7시30분 : 730)=> ");
		int time = sc.nextInt();
		if (time < 800) { // 집에서 출발한 시간이 8시 이후인 중에서 15분 이전에 있는 것
			System.out.println("걸어서 학교에 간다");
		} else {
			if (time < 815) { //8시 이후부터 8시 15분 사이 
				System.out.println("버스를 타고 학교에 간다");
			} else { //8시 이후이면서 8시 
				System.out.println("택시를 타고 학교에 간다");
			}
		} // ctrl shift f :단축키 

	}
	
	
}