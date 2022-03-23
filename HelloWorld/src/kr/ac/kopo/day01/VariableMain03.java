package kr.ac.kopo.day01;

public class VariableMain03 {
	public static void main(String[]args) {
		int a;
		byte b = 10;
		// 명시적 = 생략 안됌 (오른쪽 값이 더 커지니) . 따라서 ()를 안쓰게 되면 오류가 발생하게 된다. 
		// 묵시적 = 생략 됌 
		//타입이 다르면 서로 같게 해야 하는 것이고 생략이 가능하면 묵시적이고 생략이 불가능하면 명시적이라고 함. 
	a = b; //오른쪽에 있는 b 값이 a로 대입되는 것. 대입 연산자라고 부름 . 때때로 왼쪽과 오른쪽에 있는 값의 타입이 서로 다른 경우 형변환이 일어난다. 
	a = (int) b; //너는 원래  byte이지만 ()를 붙임으로써 int라고 최면을 거는 것임. byte 가 int 보다 크기가 작으므로 생략이 가능하다. 묵시적 형변환에서는 생략 가능함.
	// int = (int) byte
			
	b = (byte)a; //byte =(byte)int 대입되는 크기가 더 크므로 강제적 형변환이라고 함. 명시적 형변환이라고 부름. 명시적 또는 강제적 형변환에서는 생략이 불가능하다. 
	System.out.println(10 + 20); //10과 20은 서로 같은 int형이니까 문제 없이 30이 나오게 됌.
	System.out.println(10 + 20.0); //서로 다른 값을 더할 때에는 ex) int + double이면 double로 해야 함.//묵시적 형변환
	System.out.println(10 + (int)20.0); //더하면 30이 됌. 
	//사칙연산 할 대는 큰수의 값을 따라가서 나오게 돼고, 묵시적이나 명시적 형변환이 된다. 
	double d = 10 + 20.2; //int와 double 이니 10에 대해 묵시적 형변환이 일어나서 10.0 +20.2가 되어짐. 왼쪽 double 오른쪽 double이 되어서 형변환이 안일어난다. 
	int e = (int)(10+20.2);//정수와 더블의 타입이 다르니 큰 수 10.0이랑 20.2 더하게 되고 왼쪽은 int 고 오른쪽은 double이니 서로 타입이 달라져서 두개 합친 것에 대해 형변환을 해줘야 함. 
//때는 값을 생략하면 안됌. 
	
	//수정할 수 없는 변수 = 상수 
	// final = 한번 초기화된 값을 수정할 수 없음
	//final은 int num = 100;
	System.out.println(); //클래스 , 변수, 메소드 앞에 final을 붙이냐에 따라 값이 달라짐.
	//상수는 대문자로 써줘야 함
	final int NUM = 100; //상수 변수는 대문자로 작성해줘야 한다. *규칙*
	System.out.println("num : " + NUM);
	double aaa  = Math.PI*10;
	//주로 FINAL 변수를 우리가 쓰기는 흔치 않음. 자바에서 제공되는 라이브러리를 쓰게 되면 상수 
	
	char ch = '!';
	///ch = '''; 
			
			//여기 나오는얘는 문자의 작은 따옴표가 아니라 문자임. 따라서 \을 해줘야 함
			
    ch ='\'';
	ch ='\n';
	ch = '\'; //가 되면 문자로 읽음. 역슬래시로 안읽음
	ch = '\\'; // \\를 써줘야지만 역슬래쉬가 됌. 다른 곳에서 주소를 붙여넣기 할 대 \라는 주소값을 받게 되는데 역슬래쉬라는 뜻을 가지기 위해 \\라고 표현이 됌. 
	string path ="   //경로 쓸 대 \ 하나만 쓰는게 아니라 \\ 두개 써야 함 D:\\Lecture\\Java-workspace
	stinrg str ="\"ab\""; //""안에 ""를 쓰고 싶으면 \\ 역슬래쉬를 서줘야 함. 
	
	}
}
