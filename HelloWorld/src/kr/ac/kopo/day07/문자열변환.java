package kr.ac.kopo.day07;

public class 문자열변환 {

	public static void main(String[] args) {
		
		String str = "hello world!";
		
		/*
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'r')
				System.out.println("r 위치 : " + i);
		}
		*/
//		char search = 'r';
//		String search = "llo";
		String search = "p";
		System.out.println(search + " 위치 : " + str.indexOf(search));
		System.out.println(search + " 위치 : " + str.indexOf(search, 5));
		
		System.out.println("< " + search + " 위치 검색 >");
		str = "hello world!";
		search = "l";
		int index = str.indexOf(search);
		while(index != -1) {
			System.out.println("시작인덱스 : " + index);
			index = str.indexOf(search, index+1);
		}
		
		str = "hello world!";
		
		String subStr = str.substring(3, 8);	// [3] ~ [8-1]  문자열로 변환
		System.out.println("substring(3,8) : " + subStr);
		System.out.println("substring(6) : " + str.substring(6));
		
		String str2 = "hello" + "!!!!";
		str2 = "hello".concat("!!!!");
		System.out.println("concat() : " + str2);
		
		str = "    hello world    ";
		System.out.printf("[%s] 길이 : %d\n", str, str.length());
		result = str.trim(); //문자열 사이의 공백은 아무 상관없고 문자 양옆에 공백이 중요함. 
		System.out.printf("[%s] 길이 : %d\n", result, result.length());
		
		str = "Hello world!!";
		System.out.println("str : " + str);
		System.out.println("대문자 : " + str.toUpperCase());
		System.out.println("소문자 : " + str.toLowerCase());
	}
}

	 	String data = "홍길동전:하균:조선시대"; //책 제목, 지은이, 시대를 따로 따로 추출할 수 있음. 이럴 때 쓰는건 데이터에서 split할건데, 즉 쪼갤건데, :을 기준으로 자를거야. 
	 	String [] book = data.split(":");
	 	System.out.println("split() : " + Arrays.toString(bookInfo));