package kr.ac.kopo.day06;

public class 고양이 { //메소드나 클래스명은 한글로 쓸 수는 있지만 글로벌적인 소통을 하기 위해 영어로 쓰는 것이다 //추상화.+
	void 잠을잔다() {
		System.out.println("고양이가 잠을잡니다");
		
	}
	void 나용거린다() {
		System.out.println("고양이가 나용합니다");
	}
}

class Method {
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	void call(int i) {
		System.out.println("call(int)메소드 호출..."); 
	}
//메소드와 메소드를 구분하는 것은 메소드 이름 + 메소드 타입으로 구분한다. //다르면 다른 메소드로 인식한다. 
}
 	void call(double d) {
	 System.out.println("call(double) 메소드 호출....");
	 
 }
 	void call(boolean b) {
 		
 	}
public class MethodMain02 { //아직 눈에 보이는 객체 안만듬. new라는 키워드를 이용해서 객체를 만들어야 함. 
	void call() {
	public static void main(String[]args) {
		Method m = new Method(); //메소드 클래스의 인스턴스를 생성한다.
		m.call(); //고양이가 호출된다 
		m.call(10);
		m.call(10.3);
		m.call(true);
		
		고양이 나비 = new 고양이(); //new를 키워드를 이용해서 고양이 나비라는 객체를 만든 것임. 
		나비.나용거린다(); //고양이라는 실체 객체를 만들어야 냐옹고린다는 행동을 할 수 있음 
		
	}
}