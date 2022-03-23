package kr.ac.kopo.day06;
import java.util.Random;

/*
 	**********
 	Hello
 	**********
 	Hi
 	**********
 	Bye
 	**********
 	
 	반환형 메소드명([파라미터]) {
 		문장;
 		문장;
 	}
 */
public class Method02 {
	static int printStar(char ch, int cnt) {//문자는 ch 값, 숫자는 cnt 값  void는 피호출자가 호출자에게 전달할 값이 없다는 뜻! 문자 + int는 아스키코드때문에 숫자로 돼서 int형이 된다. 
		
		for(int i = 0; i < cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
		return ch + cnt; //return을 만나면 나를 호출했던 호출자로 되돌아 가는데, 값을 가지고 돌아갈 것인지 그냥 갈것인지 //정수값을 넘길건지 실수값을 넘길건지 타입을 자료형 타입을 써줘야함
		//return 반환형. 타입값만 정해줌! 전달할 수 있는 값은 오직 한개만 됌. 피호출자가 호출자에게 전달할 수 있는 값은 오직 한개인 return값만 되는 것이고, 호출자가 피호출자에게 전달할 수 있는 값은 여러개가 될 수 있다.
		
}
	
	public static void main(String[] args) {
		
		printStar('A', 10);
		System.out.println("Hello");
		printStar('B', 20);
		System.out.println("Hi");
		printStar('C', 5);
		System.out.println("Bye");
		printStar('D', 8);
		Random r = new Random();
		r.nextInt(12.45) //12.45면 double 타입으로 간다. 

		int code = printstar('A', 10); //A와 10을 다른곳으로 넘어줘서 더하게 되면 문자 + 숫자이기 때문에 아스키코드로 인해 정수가 됀다. 따라서 그 정수값을 써주기 위해 code 앞에 int를 써주는 것이다.
		System.out.println("Hello");
		printstar('B', 20);
		System.out.println("Hi");
		printstar('a', 5);
		System.out.println("Bye");
		
		
		}
		//나를 호출했던 호출자 메소드로 돌아가는 것 = return
