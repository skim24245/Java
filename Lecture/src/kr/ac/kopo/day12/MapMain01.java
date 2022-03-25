package kr.ac.kopo.day12;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/* 구현된 클래스 = 자식 클래스 
   Map : key, value 쌍의 집합, key에 대한 중복 (x)  = > value는 다 중복된 값들
 	-HashMap
 	-TreeMap
 	
 	//
 	새로운 거 추가하려면 put을 써야 함.
  사용자가 사용한 아이디가 있는지 확인하고 싶을 때 contains key  => 아이디가 없다면 
    종료하려면 system.exit(0)을 쓰던가, main 메소드에서 return 만을 쓰면 종료가 돼는 것., 
	
	//
   	key에 의해 입력한 두 string은 서로 다른 곳에 (index) 입력을 한 후 
   각각에 해당되는 key 로 찾아감. 
   hashmap의 역할임. 
 
   Set에 있는 요소가 entry 타입이니, 
	map에 있는 key만 모아서 set 타입으로 만들어주는 것 : set <String> keys = map.keyset();
	key값 알면 get 메소드를 이용해서 value 값을 알 수 있음.


/*
 	Map : key, value 쌍의 집합, key에 대한 중복(X)
 	  - HashMap
 	  - TreeMap
/*
 	Map : key, value 쌍의 집합, key에 대한 중복(X)
 	  - HashMap
 	  - TreeMap
 */

public class MapMain01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		System.out.println("< 패스워드 변경 서비스 >");
		System.out.print("아이디 입력 : ");	
		String id = sc.nextLine();
		if(!map.containsKey(id)) {
			System.out.println("입력하신 ["+id+"]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			return;
		}
		
		System.out.print("기존의 패스워드 입력 : ");
		String password = sc.nextLine();
		if(!map.get(id).equals(password)) {
			System.out.println("패스워드가 일치않습니다");
			System.out.println("서비스를 종료합니다");
			return;
		}
		
		System.out.print("변경할 패스워드 입력 : ");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		System.out.println("패스워드 변경이 완료되었습니다");
		
		System.out.println("< 회원 정보 출력 >");
		System.out.println("---------------------------");
		System.out.println("아이디\t패스워드 ");
		System.out.println("---------------------------");
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + "\t" + map.get(key));
		}
		
		/*
		Set<Entry<String, String>> set = map.entrySet();
		for(Entry<String, String> e : set) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		*/
		System.out.println("---------------------------");
	}
}
