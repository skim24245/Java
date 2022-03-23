
package FirstClass;
/*
2. 3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오 (키보드입력)
*/
import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int time = s.nextInt();
		int hour = (time/60)/60; 
		int minute = (time/ 60) % 60;
		int second = (time/ 60) % 60 % 60;
		System.out.print("초를 입력하세요 : ");
		System.out.println(hour + "시간" + minute + "분" + second + "초");
	}	
}
