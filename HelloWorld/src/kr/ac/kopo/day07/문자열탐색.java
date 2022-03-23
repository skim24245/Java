package kr.ac.kopo.day07;

public class 문자열탐색 {
	public static void main(String[]args) {
		String str = "hello world!"; //r이라는 문자가 몇번째에 있는지 알고 싶을 때 //0부터 빈칸까지 하나하나 다 찾음.
		
	
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
		System.out.println(search + " 위치 : " + str.indexOf(search, 5)); //5부터 인식하라는 뜻. 숫자를 안써주면 0부터 검색하라는 뜻.
		System.out.println(" < " + search + "위치 index 출력 >"); //찾고자 하는 문자열이 없으면 -1을 출력하게 됌. 
		String search = "l"; //찾고자 하는 문자열이 없으면 -1
		int index = str.indexOf(search);
		while(index != -1) {
			System.out.println("시작인덱스 : " + index);
			str.indexOf(search, index+1); //찾은 값 다음부터 
		}
		
	}
}
