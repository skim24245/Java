package kr.ac.kopo.day12;

public class WrapperMain { //wrappermain autoboxing 등 무슨 뜻인지만 알기. generic을 쓸 수 있는 타입은 레퍼런스 타입밖에 안돼서 정수나 실수나 문자형으로 써주려면 레퍼런스 타입으로 써줘야하기때문에 wrappermain을 설명한 것.
	
	/*
	 	기본자료형			Wrapper Class
	 	boolean			Boolean
	 	char			Character
	 	byte			Byte
	 	short			Short
	 	int 			Integer
	 	long			Long
	 	float			Float
	 	double			Double
	 	

		class Boolean {
			private boolean value;
	 	
	 */

		public static void main(String[] args) {
			
			int i = 100;
			Integer i2 = new Integer(100);
			Integer i5 = Integer.valueOf(100);
			Integer i3 = 100;	// auto boxing
			int i4 = new Integer(100);	// auto unboxing
			
			System.out.println(Integer.parseInt("123") + 100);
			System.out.println(Integer.valueOf("123") + 100);
		}
	}



