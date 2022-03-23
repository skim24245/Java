package kr.ac.kopo.day05;

// 실행클래스 
public class CarMain { //CarMain이라는 클래스인데 실행클래스라고 부름. 하나의 실행클래스와 여러개의 참조클래스를 만듦. 
	public static void main(String[]args) {
		/*new 클래스명(); //instance 객체 만드는 법 
		new Car(); //클래스 명은 대문자로 써줘야 한다. new car를 만들면 heap 영역에 생성된다. 
		new car(); //자동차 이름은 가지고 있지 않으니까 car의 변수 c를 써줘야 한다. 
		*/
		
		/**브랜드명 */
		String name; //브랜드명
		/**제조사 */
		String company; //제조사 
		
		String []names = new String [2];
		String []compnay = new String [2];
		
		names[0] = "소나타";
		company[0] = "현대";
		
		/*
		 인스턴스 객체 생성
		 */
		
		Car c = new Car();// ()는 생성자를 말함. 나중에 배우게 됌. 생성자의 종류는 new 뒤에 나오는 형태는 무조건 ()가 나오거나 []가 나와야 함. 클래스를 생성하려면 new를 써주고 클래스를 써주고 ()를 써줘야 한다. 
		c.name = "소나타";
		c.company = "현대";// c의 company는 현대라는 주소값을 가지고 있음. 
	
		Car c2= new Car();
		c2.name ="K9"; //객체 c2가 가지고 있는 이름은 K9다. 
		c2.company = "기아";
		
		//접근하려면 .name이나 .company 이렇게 써줘야 함. 
		System.out.println("첫번째 자동차명 : " + c.name);
		System.out.println("두번째 자동차명 : " + c2.name);
		//name과 company라는 2개의 멤버변수를 가지고 있는 c라는 instacne를 가지고 있음.
		//참조변수를 통해서만 access 할 수 있음. 
		
	}
}