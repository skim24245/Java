package kr.ac.kopo.day04;

public class class1 {
	public static void main(String[] args) {
		for(int i=5; i>=1; --i) {//5부터 시작해서 한 행은 하나씩 숫자가 줄어듦. 첫번째는 5부터 시작하고 두번째는 4부터 시작하고 등등.. 
			for(int j=i; j<=i+4; ++j) { //j는 각 행을 설명하는 거임. 첫번째 행: 5부터 시작해서 9까지 첫째줄 출력 //두번째 행: 4부터 8까지 //3번째 행: 3부터 7까지...(한 행에서 종료할 때 4씩 커지니까)
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

