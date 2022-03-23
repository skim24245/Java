package kr.ac.kopo.day01;

public class HelloWorld {

	public static void main(String[] args) {
		int [] arr; // arr[0]~ arr[4] int 배열의 주소값을 기억. 메소드 안에 선언되어있는 지역 변수를 말함. 이런 지역 변수는 초기화가 안되어있음.그래서 실제 배열을 만드려면 정수 값을 밑에 써줘야함. 
		arr = new int[5]; //위에 초기화를 시켜줘야 하니까 밑에 arr 배열에 5라고 초기화를 해줘야함. 이걸 실행하면 @ 183323 이렇게 나오는데 이건 주소값을 말하는 것.
		System.out.println("arr : " + arr); // new를 썼을 때만 자동 초기화가 만들어짐. 
		//정수 5개를 가지는 배열 생성
		System.out.println("arr : " + arr);
		System.out.println("첫번째 원소 : " + arr[0]);
		System.out.println("두번째 원소 : " + arr[1]);
		System.out.println("세번째 원소 : " + arr[2]);
		System.out.println("네번째 원소 : " + arr[3]);
		System.out.println("다섯번째 원소 : " + arr[4]); //그 주소값에서부터 0개 떨어진 곳 1개 떨어진 곳 2개 떨어진 곳 등 상대적인 위치값을 나타내기 때문에 0부터 시작한다.
		
		System.out.println("------------------------------------------");
		/*for(int i= 0; i <5; i++) { //배열 갯수가 5니까 <=4라는 표현보다는 5보다 작다. 이렇게 많이 씀
			System.out.println(i + "번째 원소 : " + arr[i]);
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 50;
		arr[i] = (i+1) *10
		/*
		 * 
		 */
		for(int i= 0; i <arr.length; i++) {
			System.out.println(i + "번째 원소" : " + arr[i]);"
		
			
					
		}
		
	}

}
