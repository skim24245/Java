package kr.ac.kopo.day01;

public class 교수님 {

	/*
	 	 기본자료형
	 	 논리형 : boolean
	 	 문자형 : char
	 	 정수형 : byte, short, int(기본), long
	 	 실수형 : float, double(기본)
	 	 
	 	 
	 	 변수 선언
	 	 자료형  변수명;
	 	 
	 	 변수 대입
	 	 변수명 = 값;
	 	 
	 	 변수 초기화(선언과 동시에 값 대입)
	 	 자료형 변수명 = 값;
	 	 
	 	 같은 자료형의 변수 여러개 선언
	 	 자료형 변수명1, 변수명2, 변수명3, ...;
	 */

	public class VariableMain {
		
		char b;	// 멤벼변수  자동초기화O

		
		public static void main(String[] args) {
			
			// 대문자 A를 저장하기 위한 변수 a 선언
			char a;	// 지역변수, 초기화 자동설정X
			a = 'A';
			
			// 정수 123를 저장하기 위한 변수 c선언
			int c = 123;
			
			// 실수 3개를 저장하기 위한 변수 d1, d2, d3 선언;
//			double d1;
//			double d2;
//			double d3;
			
			double d1, d2 = 12.34, d3 = 0;
			
			
			System.out.println(a);
			System.out.println(c);
		}
	}












}
