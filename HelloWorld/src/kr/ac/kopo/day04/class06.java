package kr.ac.kopo.day04;
//나비 멕타이 10번문제 (별의 갯수가 좌우대칭을 가지고 있음. 데칼코마니 형임)
/*
*-------*
**-----**
***---***
****-****
*********
****-****
***---***
**-----**
*-------*
*/

public class class06 {
	public static void main(String[]args) {
		for(int i =1; i <=9 ; i++) { //9줄까지 입력 
			for(int j=1; j<=9 ; j++) {
				if(j <= star || j >=10-star) { //이해안감
					System.out.print(*);
					System.out.println('-');
				}
			}
// 중간을 기점으로 나눴을 때 별의 갯수는 앞에서 				
			System.out.println();
			if (i <5 )
				star++;
			else 
				star--;
		}
	}
}
