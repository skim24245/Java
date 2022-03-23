package kr.ac.kopo.day07;

public class Member { //멤버변수
	String name; // string = "알수없음" 이렇게 직접 써도 됌. 이런경우는, 바뀌지 않을 값 (상수값)이럴 경우 이렇게 써도 됌. 하지만 밑에서 바뀌게 될 경우는 따로 앞 부분만 정의를 해주고 뒤에서 값을 다르게 해주며 됌. //멤버변수의 name은 파란색으로 표시
	int age; //멤버변수는 꼭 위에 위치하는 것은 아님. 클래스 - 맴버 변수 -> 생성자 => 메소드 
	String bloodType;
	
	Member(){
		name = "알수없음";
		age = -1;
		bloodType = "알수없음";
	}
	Member(String name){
		name = n;
		age = -1;
		bloodType = "알수없음";
	}
	Member(String name, int age){
		Member(name, age, "알수없음"); //이렇게 쓰면 에러가 발생하는 이유는 컴퓨터는 생성자 내부에서 메소드로 인식하기 때문.생성자 호출이 아니라 메소드 호출로 인식이 됌. 자바에서는 new를 써야지만 생성자를 호출함.
		
	}
	
	Member(String name, int age, String bloodType){ //멤버변수 3개임. 지역변수의 name 색깔은  갈색으로. 지역변수란,  
		//name = name; //생성자 이름이랑 멤버변수 이름이랑 같이 쓰는게 좋긴 한데, name이라는 이름을 가지고것이 멤버라는 클래스의 지역 변수의 name도 있고. 멤버변수 name에다가 지역변수 name을 접근하는 것이 목적인데 이름이 name이 둘다 중복되니까 지역변수가 우선순위임. 왜냐? 
		//나랑 제일 가까운 곳에 선언된 곳중에 지역변수의 name이 되게 된다. //왼쪽에는 멤버변수가 와야 되고 오른쪽에는 지역변수가 와야 되는데 이름이 같다보니 이럴 때 멤버변수this를 쓴다. 멤버변수에는 객체 이름을 쓰지 못해서 this를 써준다. 
		this.name = name 따라서 멤버변수의 name이랑 지역변수의 name이 같다보니까 멤버변수에 this를 쓰면서 다른 곳으로 호출한다. //생성자 내부에 이름이 없을 경우 this 생략 가능. 
		this.age = age;
		this.bloodType = "알수없음";
	}
	void info() {
	System.out.println("이름 : " + name + ", " + " 나이 : " + age + "");
		name = n;
		age = a;
		bloodType ="bt";
		
		Member m3 = new Member("윤길동", 22);
				
		Member m4 = new Member("한길동", 30 , "0");
	}
}
