package Practice;

import java.util.Scanner;
public class Dan {
	
	//중복된 코드가 여러 개 나오면 출력할 때 복잡할 수 있으니까
	//메소드 오버로딩을 정확하게 언제 쓸 지 고민을 해봐야 함

	public class Gugudan {
		int dan; // 클래스에 정의 됌. 클래스가 시작되서 클래스가 끝이 되는 곳에서 사용 가능하다.
		int getDan() {
			Scanner sc = new Scanner(System.in);
			int dan = sc.nextInt();
			return dan;
		}
		
		/*
		 * 파라미터로 날라온 정수의 해단 구구단을 출력
		 * @param dan 출력단
		 */
		void print(int dan) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		}
		
		/*
		 *2-9 사이의 구구단 
		 * 
		 */
		void print() {
			print(2, 9); //2단에서 9단까지 출력하겠다
	//		for(int dan = 2; dan <= 9; dan++) {
	//			print(dan);
			}
		}
		
		/*
		 * 파라미터로 날라온 시작단 ~ 종료단 사이의 구구단 출력
		 * @param start 시작단
		 * @param end 종료단 
		 */
		void print(int start, int end) { //시작단 
			for(int dan = start; dan <= end; dan++ )	
				print(dan);
		}
	
}
	
