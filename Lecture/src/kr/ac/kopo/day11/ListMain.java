package kr.ac.kopo.day11;
import java.util.ArrayList;
import java.util.List;
public class ListMain {

		//list의 자료형은 참조 자료형만 가능하기 때문에 정수로 써주고 싶으면 <interger> 이렇게 써줘야 함.
		//같은 타입을 모아놓은 후 빠르게 찾아서 검색하려고 쓰는 것 


	/*
	 	List : 순서 O, 중복 O
	 	 - ArrayList
	 	 - LinkedList
	 	 
	 	 add()
	 	 get()
	 	 size()
	 	 remove()
	 	 isEmpty()
	 	 contains()
	 	 clear()
	 */

		public static void main(String[] args) {
		
//			List<String> list = new ArrayList<String>(); // string 배열을 쓴다는 개념만이라도 알면 됌. 굳이 Generic 을 알 필요 없음. 어떤 타입의 데이터를 저장할 건지를 물어보는 것이지 상속과는 아무런 관계가 없다.
			List<String> list = new ArrayList<>(); //string 생략 가능함. list 안에 들어있는 generic/ 
			list.add("one");
			list.add("two");
			list.add("three");
			list.add("four");
			list.add("one"); 	//list는 중복을 허용함.
			
			System.out.println("전체 원소의 개수 : " + list.size() + "개");
			
			System.out.println("< PRINT >");
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
				
			}
			System.out.println("\"one\" 삭제 : "
					+ (list.remove("one") ? "성공" : "실패"));
			System.out.println("\"one\" 삭제 : "
					+ (list.remove("one") ? "성공" : "실패"));
			System.out.println("\"one\" 삭제 : "
					+ (list.remove("one") ? "성공" : "실패"));
			 //삭제를 했다 (성공) 실패했다라는 개념으로 boolean형이 들어옴. 
			
			System.out.println("< 1.5버전 >");
			for(String str : list) { //표현 방법 암기!! 
				System.out.println(str);
			}
			System.out.println("0번지 문자열 : " + list.get(0));
			System.out.println("0번지에 위치한 문자열 삭제 : " + list.remove(0)); // 삭제한 0번지는 없어지고 그 다음 숫자가 출력이 됌. 
	}
}


