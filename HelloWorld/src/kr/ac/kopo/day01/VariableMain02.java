package kr.ac.kopo.day01;

public class VariableMain02 {

	public static void main(String[]args) {
		//참조 변수 : int boolean 이런것들 다 제외한 것들 
		//"Hello" 문자열을 저장하기 위한 변수 str 선언
		//String str; //클래스의 이름이기 때문에 대문자로 
		//참조자료형은 클래스로 구성되어 있기 때문에 참조자료형은 무조건 다 대문자로 시작한다.
		//str ="Hello"; //문자는 이 방식으로 많이 씀. 
		//String str = new String("Hello"); //참조자료형은 new를 이용해서 만드는 것임. new는 heap에 저장됌. heap에 "Hello" 이 저장되지만 heap에는 접근할 수 없기 때문에 주소값을 알아야 한다. 이때 주소값은
		//헷갈리지 않게 하기 위해 16진수로  쓰게 됌. 0x50을 기억하기 위한 변수가 필요함. 0x을 지정하기 위한 공간이 바로 String str가 됌. heap에 변수 5개 공간을 만들었으면 5개의 변수가 필요함. 만약 3개의 변수 공간을
		//만들었는데 2개만 저장되어 있다면 접근을 못함
		//str 은 주소값을 가지고 있는 것이고 다른 공간에 접근할 수 있기 땨문에 참조형 변수라고 칭함.(c에서 point)
		//참조 변수는 자기자신의 값을 저장하는 것이 아니고 주소값을 가지는 것이고 그 주고값을 통해 다른 공간으로 접근 할 수 있는 것임
		//유일하게 string class만 new를 안쓰고 쓸 수 있음 (규칙이다. 외워야 함)
		String str ="Hello"
	    String str =new String("Hello"); //이것을 run 하면 ~~~@ 이 되는데 이게 주소값임. //참조변수는 str을 말하는 것이고 오른쪽을 말하는게 아님.//헷갈리지 말것
		System.out.println(str); //참조변수는 s (0 x 0001) 을 말하는 것이고 
		//주소는 hashcode()));로 쳐야 나옴
		
		
	}
}
