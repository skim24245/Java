package kr.ac.kopo.day07;

public class ConstructorMain02 {
	public static void main(String[]args) {
		Member m = new Member();
		m.name = "홍길동";
		/*
		 * Member m2 = new Member(); //다른 클래스에서 멤버 클래스로 호출하는 방법은 썩 좋은 방법이 아님. 따라서 ㅅ 
		   m2.name ="홍길동";
		 */
		m.info(); //이름이 null이 나오고 0이 나오는 이유는 자동으로 defualt 만들어지는 것이 참조변수 초기화가 숫자가 0이고 null이 나옴. 
		
}	
}
