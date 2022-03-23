package kr.ac.kopo.day06;

import java.util.Scanner;

public class Nextint {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//버퍼쓰는 법 
		System.out.println("정수 : ");
		//정수 입력받고 문자로 표현하기 위한 첫번째 방법 
		int num = sc.nextInt();
		sc.nextLine(); 		//sc. nextLine(); 를 써줘야지만 버퍼를 비울 수 있다. 정수 123을 입력받았다고 해더라도 문자 123으로 입력하게 됌. 나는 정수 123을 원하기 때문에 문자 123을 정수 123으로 변환시켜줘야 함
		
		//정수 입력받고 문자로 표현하기 위한 두번째 방법 - > 암기를 하면 편하다 
		int num1 =Integer.parseInt(sc.nextLine());    // "123" -> 123  문자를 정수로 변환시켜 줌. 이때 문자를 정수로 바꾸기 위한 메소드는 Integer.PareseInt() 이므로 암기하자 
		
		
		//실수
		System.out.println("실수 : ");
		double f = Double.parseDouble(sc.nextLine()); 
		//double f = sc.nextDouble(); //입력 받고 없어지는 것임
		
		
		//출력입력출력입력이지만 버퍼를 사용했기 때문에 출력입력으로 보이는 것임.
		//정수건 실수건 문자열이건 입력받으면 적어도 최소 엔터가 그대로 남아있음
		//정수가 실수건 문자열이건 영향을 끼치지 않으려면 버퍼를 비워줘야 함. 
		//sc. nextLine(); 를 써줘야지만 버퍼를 비울 수 있다. 
		//next int나 nextdouble를 쓰고 나서는 버퍼를 피우기 워해서는 실제로 sc.nextLine() ; 를 써줘야지만 다음 버퍼에 영향을 끼치지 않는다. 
		//정수 실수 문자열 논리값을 입력받건 nextLine로 문자열로 입력받음. 문자열 456로 입력받기 때문에 정수 456으로 바꿔줘야 함. 
	}
}
	
