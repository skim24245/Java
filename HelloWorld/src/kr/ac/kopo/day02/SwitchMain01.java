package kr.ac.kopo.day02;

public class SwitchMain01 {

public static void main(String[]args) {
	String str = new String("Hello"); //a가 hello이냐?를 물어보고 있는데 new를 쓰게 되면 주소값을 받게 됨. 즉 0x50을 가리키는 것. 따라서 0x50가 헬로인지 물어보는데 그렇지 않음. a가 가리키고 있는 값이 hello이냐  
	//변수 a가 가리키고 있는 값과 a가 값냐를 물어보는 것임.문자는 동등이 먹히지 않는다. 위치값이랑 비교되는 것이고 new의 목적은 주소값을. 기본형은 실제 값을 가지고 있는데 참조값은 실제 값이 아니라 주소를 가리키고 있는 것임
	//따라서 값이 다름.
	//실제 값 ! = 실제 값이 가리키고 있는 주소 
	//문자열과 문자열을 비교할 때는 쓸 수 없음. equls라는 함수를 써야 함.
	/*
	 
	 */
	switch(str) { //문자열 비교는 equals보다 switch가 훨씬 편해 잘 쓰게 됌. switch 조건이랑 case 조건이랑 같은 case 별로 실행되는 과정에서는 equals를 쓰고 있음. 
	//메뉴 화면을 구성할 때 많이 씀. 
 	case "Hello" :
			System.out.println("TRUE");
			break;
	default :
		System.out.println("Flase");
}
}}


