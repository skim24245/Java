package kr.ac.kopo.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 	Set, Tree set : 순서(X), 중복(X)
 	 - HashSet
 	 - TreeSet //작으면 왼쪽에 크면 오른쪽에// 출력할 때 오른차순으로 쓸 수 있음. 
 	 -문자를 저장할 수 있는 set을 만듦.
	   전체 원소의 갯수를 찍어보면 데이터가 나오게 됌. 
	set은 순서를 가지고 있지 않으니  
	
	/* 전체 데이터 접근방법 3가지
	 * 1. 1.5 버전의 for문 이용 
	 * 2. toArray() 메소드 이용 
	 * 3. Interator 객체 이용 
	 * 1.5 for 순서를 가지고 있지 않기 때문에 입력한 순서대로 출력이 되는 것이 아님. ex) four two one 
	 * toArray() set이 가지고 있는 데이터들을 배열에다가 넣어주면서 변환을 시켜, to array라는 메소드임. object 배열의 형태로 나오게 됌. 
	 * set.Arrary(); to array의 리턴형은 object 배열의 형태이고, generic은 일어나지 않음. 배열은 generic이 먹히지 않음 왜? generic은 collection일 때 쓰이니까
	 * object 배열의 목적은 모든 set을 저장하는 것이 목적이고 generic을 써서 형변환을 시켜주는 것. generic을 이용해서 모든 데이터를 저장하고 싶다면 배열 형태는 object 형태를 써야 함.
	 * set에 들어있는 갯수가 10개이면 object에 들어있는 갯수도 10개임. 
	 * 배열을 접근하려는 방법은 index, for 1.5문, array to string 형태로 전체 데이터를 한번에 출력하는 등 이렇게 3가지 출력할 수 있음. 
	 * object에서 arr[i].length에서를 쓸 수 없음.
	 * string의 배열을 만드는거라, string 형태를 가리키는 것이고, 묵시적 형태로 전환이 되고, 부모가 자식에 접근할 수 있고, object 접근할 수 있는데 length는 string 형태이니까 접근할 수 없음.
	 * string에 접근할 수 있고, 사용하려면 명시적 형변환을 써줘야 함.
	 * 내가 만드는게 아니니까, 자바에서 제공해주는 거니까, string. lenth를 알고 싶으면 명시적 형변환을 이용해서 각각의 길이 값을 알아야 함. 
	 * 문자일 경우네는 tree을 쓰면 오름차순의 형태를 쓰게 됀다. 얘만 좀 특이한 형태를 가지고 있음. 
	 * 자료구조에 있는 트리, stack, list, arraylist 등 다 안만들어도 좋으니 뭐가 있는 지 흐름파악을 쓰면 됌. 
 	 * 사실 많이 쓰는 방식은 list >  map >> 순이긴 하지만 배우는 것. set을 쓰는 것보다 map을 많이 씀. 
 */
	public class SetMain {

		public static void main(String[] args) {
			
			Set<String> set = new HashSet<>();
//			Set<String> set = new TreeSet<>();
			System.out.println("\"one\"입력성공여부 : " + set.add("one"));
			set.add("two");
			set.add("three");
			set.add("four");
			set.add("five");
			System.out.println("\"one\"입력성공여부 : " + set.add("one"));
			
			System.out.println("전체 원소의 개수 : " + set.size() + "개");
			
			/*
			 * 전체 데이터 접근방법 3가지
			 * 1. 1.5버전의 for문 이용
			 * 2. toArray() 메소드 이용
			 * 3. Iterator 객체 이용
			 */
			
			System.out.println("< 1.5 for문 이용한 출력");
			for(String str : set) {
				System.out.println(str);
			}
			
			System.out.println("< toArray() 이용한 출력 >");
			Object[] arr = set.toArray();
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			/*
			 * Iterator(순환객체) 주요 메소드
			 * - hasNext() : 데이터 존재여부 판단
			 * - next() : 순환 객체의 데이터를 access 하는게 목적이고, 데이터를 접근할 때 쓰는 것.
			 * 
			 */
			System.out.println(" <Iterator 이용한 출력> "); //set을 이용해서 전체 데이터를 access하고 싶으면 iterator라는 메소드를 사용해서 iterator 객체를 반환하고, set에 있는 모든데이터에 접근할 수 있음. 
			//iterator를 이용해서 set에 이용하는 것이 목적임. 그래서 set에 있는 자료형 타입인 string으로 출력이 되는 것임.
			Iterator<String> ite = set.iterator(); //어떤 데이터의 집합이 있다면 데이터에 맨 처음부터 맨 끝까지 접근하는 것이 목적인데, 데이터의가 몇개인지 모르니까 멈추려면
			// 내 뒤에 데이터가 있는지 계속 물어보는 것이 hadsNext()임.
			while(ite.hasNext()) { //전체 데이터를 access 하려고 set을 쓰는건 아니지만, 전체 데이터를 알고 싶으면 배열이나 for문 등을 이용해서 데이터를 접근하는 것. 
				System.out.println(ite.next());//next를 한번 해야 접근이 가능함. next는 차고지게 있어서 next를 이용해서 1번지 2번지 등 차고지로 이동을 해야 함. iterator는
				// 배열이 아니라 참조변수 하나임. 그래서 next를 이용해서 가리키는 것. set을 이용해서 데이터를 만들었는데 데이터 갯수가 몇개인지 모르니까 for문을 쓰던가 itertor를 쓰던가
				// 아님 set에 있는 모든 값을 배열로 정의를 해서 접근을 하는 것임. 원래 검색하려면 검색하려는 contains라는 키워드를 이용해서 접근을 해주는 거긴 한데, iterator를 쓰는 이유는
				// set를 쓰느 ㄴ목적은 전체 데이터를 접근하려는 경우가 아닌데 드문 경우 전체 데이터를 접근하고 싶을 때 iterator를 쓰는 거임.
				//데이터 목적에 따라 list를 쓸 지 set을 쓸 지 결정하는 것. 
			}
			
		}
	}

