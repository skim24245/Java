package kr.ac.kopo.day06;

/* 메소드는 문장들의 집합을 말함
 * 정의를 해줄 때는 void 메소드 () 이렇게 ()안을 비어야 함.
    *밑에서 정의를 수행할 때에는 메소드명 (); 을 
 * 반환형 메소드명(옵션인 파라미터) {
 * 문장;
 * 문장;
 */
public class MethodMain01 { //메소드의 정의부 
		void printStar(){ //메소드명은 항상 소문자로 시작 //return 타입은 void로 쓰고 () 안에 아무것도 = *를 10개 찍고 엔터진다는 뜻 
		System.out.println("*****"); //문장을 가지고 있는 배열을 만드려면
	}
   
	
	//for를 쓰려면 연속성, 규칙이 있어야 되는데 없으니까 위의 메소드를 쓴다. 
	public static void main(String[]args) { //메소드의 실행부
		int cnt = 10 ; //cnt는 printstar 에서만 쓰는 것.
		printStar();
		System.out.println("*****");
		System.out.println("Hello");
		System.out.println("*****");
		System.out.println("Hi");
		System.out.println("*****");
		System.out.println("Bye");
		System.out.println("*****");
		// * 개 찍고 엔터찍는 게 총 4번 나온다 for(int i =0; i < 4; i++)
		// for(int i =0; i < 4; i++);
		// System.out.println("*****");
		// if (i == 0)
		// System.out.println("Bye");  //hello나 hi나 bye는 규칙성이 없다. 
		// else if (i == 1)
		// System.out.println("HI") ; FOR문은 반복되는 문장이 연달아 나올 때만 FOR를 쓰는 거지. 반복되는 문장이 없으면 반복문을 쓸 수 없다. 연속성이 없을 때 반복문을 쓸 수 없음. 
		// 별 10개 찍고 엔터찌는 문장을 
		// 별 10개 찍고 
 	}
	//메소드는 호출자가 될 수 도 있고 피호출자 메소드가 될 수도 있음
}
