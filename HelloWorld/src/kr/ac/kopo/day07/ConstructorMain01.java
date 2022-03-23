package kr.ac.kopo.day07;

/*
 * 생성자 특징
 * 1. 클래스명과 동일
 * 2. 반환형이 없다
 * 3. 디폴트 생성자 지원 : 클래스내에 생성자가 존재하지 않은 경우 jvm이 자동으로 생성 
   4. 멤버변수 초기화 
   5. 
 */
class car { //생성자를 만드는 이유는 멤버변수(속성의 값)을 초기화하는 게 목적임. 멤버변수를 초기화 하는 방법은 ? 바로 뒤에 02에서 배움.
	car(int i){ //()만 적어도 에러가 안나는 이유는 jvm이 default를 자동으로 만들어주기 때문이다. 
		System.out.println("Car() 생성자 호출....");
	}
	car(int i, Sring s){
		System.out.println("Car(int, String) 생성자 호출...")
	}
}
public class ConstructorMain01 {
	public static void main(String []args) {
	Car c = new car (); //생성자를 호출한다. 에러가 안나는 이유는 jvm이 default 생성자를 자동으로 만들어주기 때문에. 클래스내에 생성자가 하나도 정의되어 있지 않을 경우 default를 자동으로 만들어준다. 	
	Car c2 = new car(10);
	}
}
