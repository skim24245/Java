package kr.ac.kopo.day04;

public class problem08 {
		public static void main(String[]args) {
					int star = 4;
					for(int i =1; i <=9 ; i++) {//9째 줄 
						for(int j=1; j<=9 ; j++) {//5번째 행부터 시작해서 숫자가 하나씩 증가함. 
							if(j <= star || j >=10- star) { //5를 기준으로 분기점. 별의 갯수는 5까지 하나씩 줄어듦 
							System.out.print('*');  
						for(int j=0; j <=2i + 1; j++) { //쉼표는 2n+1의 규칙을 가지고 있음
							System.out.print('-');  
						for(int i=1; i <=10-i ; i++) {// 쉼표 다음 *의 갯수 공식을 찾아야 함. 10-i //끝에서 시작하는 부분 
							System.out.print('*'); //밑 행의 규칙을 찾아야 함. 
						}
			// 중간을 기점으로 나눴을 때 별의 갯수는 앞에서 				
						System.out.println();
						if (i <5 )
							star--; //별의 갯수는 4부터 시작해서 1까지 줄어들다가
						else 
							star++; //별의 갯수가 1을 기준으로 다시 늘어남
 					}
				}
				
			}
		}						
}
}