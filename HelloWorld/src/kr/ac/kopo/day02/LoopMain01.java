package kr.ac.kopo.day02;

/*
 1. 반복할문장
 2. 시작값
 3. 증가/감소
 4. 종료조건 
 *
 
 한바퀴 뛸차례다; //초기화를 먼저 해주고 바퀴수를 계속 증가해줌. 
 while(!열바퀴 다 뛰었냐?) {
 	운동장을 한바퀴 뛴다;
 	바퀴수 증가;	
 }
 	1.init;
 	while(2.expr) {
 		3.statement;
 		4.incre/decre;
 }
 5.
 
 	1. 초기화를 먼저 한 다음 조건을 물어보고, 조건이 참이라면 3번(statement)를 수행하고 4번까지 수행함. 
 	1 -> 2. 조건 참 -> 3 -> 4 
 	  -> 2 조건 참 -> 3 -> 4
 	  -> 2 조건 참 -> 3 -> 4 
 	  -> 2 조건 거짓 -> 5
 	
 //조건이참이라면 밑에 명령문을 실행하고 다시 위로 돌아가서 조건을 확인하고 명령문 실행하고 만약 조건이 거짓이라면 벗어난다.

/*
 for (1.init; 2.expr; 3. incre/decre) {
 	  4. statement;
 }
 5. 

 	1 -> 2 조건이 참이라면 -> 3번이 아닌 4번 (반복하려는 문장)을 먼저 수행 -> 그 다음 3번 (증가/ 감소)를 수행.
 	  -> 2 조건이 참 -> 4 -> 3
 	  -> 2 조건 참 -> 4 -> 3
 	  -> 2 조건 거짓 -> 5
 	  
 	//사이에는 세미콜론을 넣어줌. 
 */
 //동명의 변수를 쓸 수 없음. 
//for를 while보다 먼저 써주면 에러가 안나는데 밑에 써주면 에러가 뜨게 된다.
System.out.println("---------------for 반복문 시작--------------");
for(int cnt =1; cnt <= 5 ; cnt++) {//후위 증가를 시키나 전위 증가를 시키나 똑같음. 아무렇게 써도 상관 없음. //for문 안에 있는 초기화는 반복이 끝나면 사라짐/ 
	System.out.println("Hello");
	int cnt =1; 
//혼자 이렇게 쓰일 때는 앞에 쓰나 뒤에 쓰나 상관없음. 후위 증가를 많이 씀. 
}
System.out.println("----------------for 반복문 종료-------------=");		
}
}

public class LoopMain01 {
	public static void main(String[]args) {
		boolean bool = true;
		System.out.println("---------------while 반복문 시작--------------");
		int cnt = 1;
		while( cnt <= 5) {
			System.out.println("Hello");
			++cnt; //혼자 이렇게 쓰일 때는 앞에 쓰나 뒤에 쓰나 상관없음. 후위 증가를 많이 씀. 
		}
		System.out.println("----------------while 반복문 종료-------------=");		
	
}

//for문 안에서 만들어진 변수는 for문 안에서만 사용되고 for문 밖에서는 사용 못한다. 변수의 scope 임. 변수의 life cycle을 정확하게 이해해야 함. 
	
