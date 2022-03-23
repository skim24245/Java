package kr.ac.kopo.day01;

public class PrintMain02 {

	/*
	 ASCII CODE (0 ~ 256) : 1byte 대문자, 소문자, 숫자문자, 특수문자, 공백문자를 숫자로 일대일 매칭시킨 숫자표
	 아스키 코드를 표현할 수 있는 숫자는 0에서 256까지임. : 2^7 - 1 
	 UNICODE (0 ~ 65500) : 2 byte 
	 다국어 지원 숫자표 (ASCII CODE + 한글, 한자, ...)
	 bit : 0 , 1
	 1 byte= 8bit  => 1 byte는 8개를 묶어노은 것이니 2^0 에서 2^7까지 묶어 놓은 것임.
	 'A' :65의 10 진수는 0x41
	 'a' :97의 10 진수는 0x61
	 '0' :48의 10 진수는 0x30
	 앞에 숫자를 쓰고 뒤에 x를 쓰게 되면 16진수라는 뜻이 됨.
	 16진수 표현을 알아둬야 함. 나중에 프론트엔드에서 색깔 쓸 때 필요함.
	 float는 double 7자리 
	 float 는 double 15자리 (double이 기본이 됌)
	 */
	
	// utf- 8 3byte
	public static void main(String[] args) {
		System.out.println('A');
		System.out.println('A' + "BCD"); //문자형과 문자열을 더하면 ABCD가 나오게 됌 
		System.out.println('A' + 'B'); // 문자형과 문자형을 더하면 AB가 나와야 할 것 같은데 131이 나옴. 65에서 66 더하니 131. 문자 + 문자 = 숫자 
		System.out.println('A' + 10); //문열에다가 정수나 실수를 더했더니 정수값의 형태가 나옴. //컴퓨터는 2진수이고 대문자를 구분하지 못하기 때문에 10이 나가거나 2가 나가거나 하게 됨.. 그 숫자를 아스키 코드라고 함. 
		System.out.println('\n');
		System.out.println('a');
	}

}
