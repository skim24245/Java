package kr.ac.kopo.day07;

public class StringMain02 {
	public static void main(String[]args) {
		//상수 영역은 한번 hello라는 공간이 만들어지면 프로그램이 종료될 때까지 계속 남아있음
		//new 라는 곳은 가비지 컬렉션에 의해서 사라질 수 있음.
		
		String str = "Hello";// 상수문자열 -> 이 줄이랑 밑의 줄은 "hello"라는 메소드를 가리키고 있다는 뜻. 
		String str2 = "Hello"; //상수문자열이 계속 만들어지는 것이 아니라 어딘가에 상수값들이 저장하기 위한 메모리의 공간이 있음. new를 쓰지 않고 쓸 때는 같다고 표현되지만 
		String str1 = new String("Hello"); //heap 영역에 hello가 저장되어서 
		String str4 = new String("Hello");
		
		if(str1 == str2) { //str랑 str2가 가리키고 있는 주소값이 동일하냐를 물어보는 것. 즉 주소를 비교하는 것임. // 위에 두줄은 주소값이 같은데, 밑에 두줄은 가리키는 주소값이 달라서 값이 다름. (사진 첨부) 
			System.out.println("같다");
		} else {
			System.out.println("다르다");
			
		}
	


	//주소값을 물어보는 것이 아니라 값의 비교를 물어보고 싶다면 equals라는 메소드임
		if(str.equals(str2)) {//str랑 str2의 값이 같냐고 물어봤는데 값이 true이면 같게 나올 것이고, 아니라면 문자열을 비교하는데 
			System.out.println("문자열비교" : 같다");
		} else {
			System.out.println("문자열비교" : 같다");
		}
		
			//final은 str가 가리킨다는 것을 고정시킨다는 것이지 하나만 가진다는 뜻임.
		//참조자료형은 주소로 비교하는 것이고 
		//기본자료형은 자신이 주소를 가지고 있으니까 값을 비교하는 것
		
		//문자열을 비교할 때는 equls를 써야하는데 귀찮으니까 swtich를 쓴다.
		
		
		if(str.equals(str2) == true) {
			System.out.println("문자열비교 : 같다");
		} else {
			System.out.println("문자열비교 : 다르다");
		}
		
		System.out.println("대소문자관계없이 문자열 비교 : " 
						+ str.equalsIgnoreCase(str2));
		
		  String [] names = {"홍길동, "홍길순", "홍길동", "박길동", "홍가네", "
			System.out.println(" <전체 이름이 홍길동인 사람 출력 >");
			for(String name : names) {
				if(name.equals("홍길동")) {
						System.out.println(name);
				}
			}

		System.out.println(" <성이 홍씨인 사람 출력 >"); //앞에 문자 출력 
			for(String name : names) {
				if(name.startsWith"홍")){
					System.out.println(name);
			}
		}
		System.out.println(" <이름이 길동인 사람 출력 >"); //뒤에 문자 출력 
			for(String name : names) {
				if(name.endsWith"길동")){
					System.out.println(name);
			}
		}
				//전체 이름에 홍이라는 사람이 표현할 때 물어보는 것. 
		System.out.println("<이름에 홍이 포함된 사람 출력>");
		for(String name : names) {
			if(name.contains(contains"홍")) {
				System.out.println(name)
			}
		
		}// 크기 비교
		str = "boat";
		str2 = "banana";
		int compare = str.compareTo(str2);
		if(compare == 0) {
			System.out.println(str + " == " + str2);
		} else if(compare > 0) {
			System.out.println(str + " > " + str2);
		} else {// compare < 0
			System.out.println(str + " < " + str2);
		}
	}
}