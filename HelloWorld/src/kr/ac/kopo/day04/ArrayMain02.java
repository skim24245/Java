package kr.ac.kopo.day04;

public class ArrayMain02 {
	/*
	 * int는 기본자료형임.
	 * 참조자료형은 int 이외에 값들을 말함 
	 */
		public static void main(String[]args) {
//			String [] strArr = {"데이터분석", "자바", "교육"}; //문자열으 참조자료형 
			String [] strArr = new String[3]; //이렇게 하aus null라고 찍힘. string 참조원소를 배열로 만든것이고 참조배열의 초기화는 0을 가진다. 가리키고 있는 주소값이 없으니까 0을 가짐. 따라서 바로 밑에다가 실제 값들을 적어줘야 함. (삽입해서)
			strArr[0] = "데이터분석"; //위에 new를 써주고 꼭 이렇게 실제 0 부터 2까지 값을 삽입해줘야 함 
			strArr[1] = "자바";
			strArr[2] = "교육";
			
//				String[] strArr = {"데이터분석", "자바", "교육"};
				String[] strArr = new String[5];
				int loc = 0;
				strArr[loc++] = "폴리텍";
				strArr[loc++] = "데이터분석";
				strArr[loc++] = "자바";
				strArr[loc++] = "교육";
				
				System.out.println("문자열의 총 개수 : " + strArr.length + "개");
				
				/*
				 * 배열의 전체 원소를 출력 방식
				 * 1. index를 이용한 출력  (원소접근: 0 ~ length-1)
				 * 2. 1.5버전의 for문을 이용한 출력
				 * 3. Arrays.toString() 메소드를 이용한 출력
				 */
				System.out.println("< index를 이용한 출력 >");
				for(int i = 0 ; i < strArr.length; i++) {
					System.out.println(strArr[i]);
				}
				
				System.out.println("< 1.5버전의 for문 이용 출력 >");                                                
				for(String s : strArr) { // 또는 for(int num : arr){                                            
					//s는 변수임 				    // System.out.print(num + "\t");                                      
	
					System.out.println(s);
				}
				
				System.out.println("< Arrays.toString() 메소드 이용 출력 >");
				String result = Arrays.toString(strArr); 	// "[원소, 원소, 원소, ...]"
				System.out.println(result);
			}
			
		}
			
			/*
			 * 배열의 전체 원소를 ****출력***** 방식
			 * 1. index를 이용한 출력 (원소접근은 0번지부터 length -1까지 
			 * 2. 1.5 버전의 for문 (출력을 목적으로 사용 . 입력 목적 x  => 
			   3. strACC 
			/*
			 System.out.println("< index를 이용한 출력>");
			 for (int i = 0; stArr.length; i++){
			 	System.out.println(strARR[i]);
			 }
			 
			 	
			 	
			 *string []의 목적은 string의 주소값을 가지고 있는 참고변수들의 배열을 일컬음. 참소변수를 3개를 가지고 있는 배열을 말함. stack은 실제 값을 가지고 있는게 아니라 주소값을 가지고 있는 것이고 같은. 0번째에는 실제로 주소값이 그려짐. 
			 참조라료형 변수의 목적은 배열을 만드는 것이 목적임. 
		     for(String s :strArr){
			 	system.out.println(s);
			 *array to string이라는 메소드를 통해서 저 배열이 가지고 있는 모든 원소들을 하나의 문자열로 만듦
			 *array to string을 쓰기 위해서는 import를 해주야함. 
			 */
      
	 
		/ * for문 1.5버전/*
      	int data = 1 
      	for(int num : arr){ //arr에 가지고 있는 요소들을 num이라는 공간에 집어넣으라는 뜻. num에다가 복사본을 집어넣는 것인데 원본값이 아니다보니 입력받거나 수정할 수 있는 용도로 쓸 수 없음. 여기서 수정하면 num의 값을 수정하는 것이지 arr라는 배열을 수정하는 것이 아님. 그래서 1.5 버전의 for는 이렇게 입력을 할 수는 없음.
	  	num = data++  이렇게 num = data++ 1.5버전의 for문을 써주면 0000이렇게 출력이 됌. 1234가 출력이 안돼는 이유는 int num. 한 사이클에서만 살아있고 뒤에는 사라짐. 원래 원소값을 넣는 것이 아니라 복사본을 넣는 것임. 




			

